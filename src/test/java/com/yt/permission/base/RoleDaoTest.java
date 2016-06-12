package com.yt.permission.base;

import com.yt.permission.dao.RoleDao;
import com.yt.permission.entity.Account;
import com.yt.permission.entity.Role;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by yitao on 2016/5/19.
 */

@ContextConfiguration(locations = {"/applicationContext-*test.xml"})
public class RoleDaoTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private RoleDao roleDao;

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
        Role role = new Role();
        role.setName("总管");
        role.setDesc("系统总管理员");
        roleDao.save(role);
        System.out.println(role);
        suf();
    }
}
