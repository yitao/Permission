package com.yt.permission.dao;

import com.yt.permission.entity.Module;

import java.util.List;

/**
 * Created by yitao on 2016/5/19.
 */
public interface ModuleDao extends BaseSqlDao<Module, String>{

    List<Module> findAllMA();

    Module findDefault();

}
