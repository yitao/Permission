package com.yt.permission.entity;

import org.springframework.data.annotation.Transient;

import java.util.List;

/**
 * Created by yitao on 2016/5/11.
 */
public class Module extends BaseLabelEntity{
    String faModuleId;
    boolean isDefault;
    @Transient
    List<Module> subModules;
    @Transient
    List<Action> actions;

    public String getFaModuleId() {
        return faModuleId;
    }

    public void setFaModuleId(String faModuleId) {
        this.faModuleId = faModuleId;
    }

    public List<Module> getSubModules() {
        return subModules;
    }

    public void setSubModules(List<Module> subModules) {
        this.subModules = subModules;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}
