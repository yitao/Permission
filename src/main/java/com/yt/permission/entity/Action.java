package com.yt.permission.entity;

/**
 * Created by yitao on 2016/5/11.
 */
public class Action extends BaseLabelEntity{
    String moduleId;
    String action;

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
