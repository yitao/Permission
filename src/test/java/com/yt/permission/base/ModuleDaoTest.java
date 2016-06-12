package com.yt.permission.base;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yt.permission.dao.ModuleDao;
import com.yt.permission.entity.Module;
import com.yt.permission.entity.Role;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.util.List;

/**
 * Created by yitao on 2016/5/19.
 */

@ContextConfiguration(locations = {"/applicationContext-*test.xml"})
public class ModuleDaoTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private ModuleDao moduleDao;
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
        Module module = new Module();
        module.setLabel("未分配模块");
        module.setValue("未分配模块");
        moduleDao.save(module);
        System.out.println(module);
        suf();
    }

    @Test
    public void testFindAll(){
        pre();
        List<Module> modules = moduleDao.findAllMA();
        for(Module module : modules) {
            System.out.println(module);
        }
        suf();
    }

    @Test
    public void testFindDefault(){
        pre();
        Module module = moduleDao.findDefault();
        System.out.println(module);
        suf();
    }
}
