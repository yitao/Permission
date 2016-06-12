package com.yt.permission.base;

import com.yt.permission.dao.ActionDao;
import com.yt.permission.entity.Action;
import com.yt.permission.entity.Role;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by yitao on 2016/5/19.
 */

@ContextConfiguration(locations = {"/applicationContext-*test.xml"})
public class ActionDaoTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private ActionDao actionDao;

    public void pre(){
        System.out.println();
        System.out.println("----begin---");
    }

    public void suf(){
        System.out.println("----end---");
        System.out.println();
    }

    @Test
    public void testInsert(){
        pre();
        String moduleId = "4a2ee68d-0a18-4f51-b1cf-19a464d8a141";
        Action action = new Action();
        action.setModuleId(moduleId);
        action.setLabel("添加");
        action.setValue("添加");
        action.setAction("/admin/toadd.do");
        actionDao.save(action);
        System.out.println(action);

        Action action2 = new Action();
        action2.setModuleId(moduleId);
        action2.setLabel("删除");
        action2.setValue("删除");
        action2.setAction("/admin/todelete.do");
        actionDao.save(action2);
        System.out.println(action2);
        suf();
    }
}
