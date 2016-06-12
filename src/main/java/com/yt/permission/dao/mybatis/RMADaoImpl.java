package com.yt.permission.dao.mybatis;

import com.yt.permission.dao.ARDao;
import com.yt.permission.dao.RMADao;
import com.yt.permission.entity.AR;
import com.yt.permission.entity.RMA;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yitao on 2016/5/19.
 */
@Repository
public class RMADaoImpl extends BaseSqlDaoImpl<RMA,String> implements RMADao{

    public List<RMA> findAllByRoleId(String roleId){
        List<RMA> result = null;
        result = getSqlSession().selectList(className + ".findRmaByRoleId" , roleId);
        return result;
    }

}
