package com.yt.permission.dao.mybatis;

import com.yt.permission.dao.ModuleDao;
import com.yt.permission.entity.Module;
import org.springframework.stereotype.Repository;

/**
 * Created by yitao on 2016/5/19.
 */
@Repository
public class ModuleDaoImpl extends BaseSqlDaoImpl<Module,String> implements ModuleDao{
}
