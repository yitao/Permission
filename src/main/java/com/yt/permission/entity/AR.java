package com.yt.permission.entity;

/**
 * 账号 和 角色之间关系
 * Created by yitao on 2016/5/17.
 */
public class AR extends BaseDataEntity{
    String accountId;
    String roleId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
