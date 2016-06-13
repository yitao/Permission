package com.yt.permission.shiro.filter;

import org.apache.shiro.web.filter.authz.AuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 权限验证过滤器
 * Created by yitao on 2016/6/12.
 */
public class PermissionAuthorization extends AuthorizationFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object mappedValue) throws Exception {
        return true;
    }

}
