package com.yt.permission.dao;

import com.yt.permission.entity.AR;
import com.yt.permission.entity.RMA;

import java.util.List;

/**
 * Created by yitao on 2016/5/19.
 */
public interface RMADao extends BaseSqlDao<RMA, String>{

    List<RMA> findAllByRoleId(String roleId);

}
