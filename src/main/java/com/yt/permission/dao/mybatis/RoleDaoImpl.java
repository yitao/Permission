package com.yt.permission.dao.mybatis;

import com.yt.permission.dao.RoleDao;
import com.yt.permission.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * Created by yitao on 2016/5/19.
 */
@Repository
public class RoleDaoImpl extends BaseSqlDaoImpl<Role,String> implements RoleDao{
}
