package com.yt.permission.dao.mybatis;

import com.yt.permission.dao.ModuleDao;
import com.yt.permission.entity.Module;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yitao on 2016/5/19.
 */
@Repository
public class ModuleDaoImpl extends BaseSqlDaoImpl<Module,String> implements ModuleDao{
    @Override
    public List<Module> findAllMA() {
        List<Module> result = null;
        result = getSqlSession().selectOne(className+".findAllMa");
        return result;
    }

    @Override
    public Module findDefault() {
        Module module = null;
        module = getSqlSession().selectOne(className+".findDefault");
        return module;
    }
}
