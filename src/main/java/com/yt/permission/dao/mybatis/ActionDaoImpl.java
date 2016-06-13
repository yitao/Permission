package com.yt.permission.dao.mybatis;

import com.yt.permission.dao.ActionDao;
import com.yt.permission.entity.Action;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yitao on 2016/5/19.
 */
@Repository
public class ActionDaoImpl extends BaseSqlDaoImpl<Action,String> implements ActionDao{

    @Override
    public List<Action> findAllByModuleId(String moduleId) {
        List<Action> result = null;
        result = getSqlSession().selectList(className+".findAllByModuleId",moduleId);
        return result;
    }

    @Override
    public Action findOneByAction(String action) {
        Action result = null;
        result = getSqlSession().selectOne(className+".findOneByAction",action);
        return result;
    }
}
