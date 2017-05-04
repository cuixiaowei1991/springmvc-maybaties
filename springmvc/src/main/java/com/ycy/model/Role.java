package com.ycy.model;

public class Role {
    private String id;

    private String roleIsManager;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleIsManager() {
        return roleIsManager;
    }

    public void setRoleIsManager(String roleIsManager) {
        this.roleIsManager = roleIsManager == null ? null : roleIsManager.trim();
    }
}