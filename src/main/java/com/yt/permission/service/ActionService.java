package com.yt.permission.service;

import com.yt.permission.dao.ActionDao;
import com.yt.permission.entity.Action;
import com.yt.permission.logging.Log;
import com.yt.permission.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yitao on 2016/6/13.
 */
@Service
public class ActionService {
    Logger logger = Logger.getLogger(ActionService.class);
//    Log logger = LogFactory.getLog(ActionService.class);
    @Autowired
    private ActionDao actionDao;

    public void insertIfNotExists(String action){
        //actionDao.findOneByAction(action);
        try {
            Action act = new Action();
            act.setAction(action);
            actionDao.save(act);
        } catch (Exception e) {
//            e.printStackTrace();
            logger.info("插入action失败：{}",e);
        }
    }

}
