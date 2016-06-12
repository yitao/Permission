package com.yt.permission.dao.mybatis;

import com.yt.permission.dao.ARDao;
import com.yt.permission.dao.AccountDao;
import com.yt.permission.entity.AR;
import com.yt.permission.entity.Account;
import org.springframework.stereotype.Repository;

/**
 * Created by yitao on 2016/5/19.
 */
@Repository
public class ARDaoImpl extends BaseSqlDaoImpl<AR,String> implements ARDao{
}
