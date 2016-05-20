package com.yt.permission.base;

import com.yt.permission.dao.AccountDao;
import com.yt.permission.entity.Account;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by yitao on 2016/5/19.
 */

@ContextConfiguration(locations = {"/applicationContext-*test.xml"})
public class AccountDaoTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    AccountDao accountDao;

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
        Account account = new Account();
        account.setAccount("yitao");
        account.setPassword("123456");
        accountDao.save(account);
        System.out.println(account);
        suf();
    }

    @Test
    public void testUpdate(){

    }

    @Test
    public void testQuery(){

    }

    @Test
    public void testDelete(){

    }


}
