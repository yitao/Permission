package com.yt.permission.dao.mybatis;

import com.yt.permission.dao.ActionDao;
import com.yt.permission.entity.Action;
import org.springframework.stereotype.Repository;

/**
 * Created by yitao on 2016/5/19.
 */
@Repository
public class ActionDaoImpl extends BaseSqlDaoImpl<Action,String> implements ActionDao{
}
