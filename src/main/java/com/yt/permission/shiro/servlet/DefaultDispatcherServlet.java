package com.yt.permission.shiro.servlet;

import com.yt.permission.service.ActionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.core.MethodIntrospector;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by yitao on 2016/6/13.
 */
public class DefaultDispatcherServlet extends DispatcherServlet {
    private static final String SCOPED_TARGET_NAME_PREFIX = "scopedTarget.";
    private boolean detectHandlerMethodsInAncestorContexts = false;
    public DefaultDispatcherServlet() {
        super();
    }

    public DefaultDispatcherServlet(WebApplicationContext webApplicationContext) {
        super(webApplicationContext);
    }

    @Override
    protected WebApplicationContext initWebApplicationContext() {
        WebApplicationContext context = super.initWebApplicationContext();
        ApplicationContext applicationContext = context.getParent();
        ActionService actionService = applicationContext.getBean(ActionService.class);
        String[] beanNames = (this.detectHandlerMethodsInAncestorContexts ?
                BeanFactoryUtils.beanNamesForTypeIncludingAncestors(applicationContext, Object.class) :
                applicationContext.getBeanNamesForType(Object.class));

        for (String name : beanNames) {
            if (!name.startsWith(SCOPED_TARGET_NAME_PREFIX) && isHandler(applicationContext.getType(name))) {
                detectHandlerMethods(applicationContext,name);
            }
        }
        return context;
    }

    protected void detectHandlerMethods(ApplicationContext applicationContext, final Object handler) {
        Class<?> handlerType = (handler instanceof String ?
                applicationContext.getType((String) handler) : handler.getClass());
        final Class<?> userType = ClassUtils.getUserClass(handlerType);

        Map<Method, RequestMappingInfo> methods = MethodIntrospector.selectMethods(userType,
                new MethodIntrospector.MetadataLookup<RequestMappingInfo>() {
                    @Override
                    public RequestMappingInfo inspect(Method method) {
                        return getMappingForMethod(method, userType);
                    }
                });

        for (Map.Entry<Method, RequestMappingInfo> entry : methods.entrySet()) {
            if(!entry.getValue().getPatternsCondition().getPatterns().isEmpty()) {
                String path = null;
                Set<String> ss = entry.getValue().getPatternsCondition().getPatterns();
                Iterator<String> is = ss.iterator();
                if(is.hasNext()){
                    path = is.next();
                }
                System.out.println("---------------------------");
                if(StringUtils.isNotBlank(path)){
                    System.out.println(path);

                }
            }
//            registerHandlerMethod(handler, entry.getKey(), entry.getValue());
        }
    }

    protected boolean isHandler(Class<?> beanType) {
        return ((AnnotationUtils.findAnnotation(beanType, Controller.class) != null) ||
                (AnnotationUtils.findAnnotation(beanType, RequestMapping.class) != null));
    }

    protected RequestMappingInfo getMappingForMethod(Method method, Class<?> handlerType) {
        RequestMappingInfo info = createRequestMappingInfo(method);
        if (info != null) {
            RequestMappingInfo typeInfo = createRequestMappingInfo(handlerType);
            if (typeInfo != null) {
                info = typeInfo.combine(info);
            }
        }
        return info;
    }

    private RequestMappingInfo createRequestMappingInfo(AnnotatedElement element) {
        RequestMapping requestMapping = AnnotatedElementUtils.findMergedAnnotation(element, RequestMapping.class);
        RequestCondition<?> condition = (element instanceof Class<?> ?
                getCustomTypeCondition((Class<?>) element) : getCustomMethodCondition((Method) element));
        return (requestMapping != null ? createRequestMappingInfo(requestMapping, condition) : null);
    }

    protected RequestCondition<?> getCustomTypeCondition(Class<?> handlerType) {
        return null;
    }

    protected RequestCondition<?> getCustomMethodCondition(Method method) {
        return null;
    }

    protected RequestMappingInfo createRequestMappingInfo(
            RequestMapping requestMapping, RequestCondition<?> customCondition) {
        return RequestMappingInfo
                .paths(requestMapping.path())
                .methods(requestMapping.method())
                .params(requestMapping.params())
                .headers(requestMapping.headers())
                .consumes(requestMapping.consumes())
                .produces(requestMapping.produces())
                .mappingName(requestMapping.name())
                .customCondition(customCondition)
                .build();
    }
}
