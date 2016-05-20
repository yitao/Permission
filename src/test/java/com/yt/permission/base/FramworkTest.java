package com.yt.permission.base;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.util.Date;
import java.util.List;

/**
 * Created by yitao on 2016/5/19.
 */
@ContextConfiguration(locations = {"/applicationContext-*test.xml"})
public class FramworkTest extends AbstractJUnit4SpringContextTests{

    @Test
    public void testLoadFramwork(){
        System.out.println();
        System.out.println("---------begin-------");
        System.out.println("---------end----------");
    }


}
