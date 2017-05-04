package com.ycy.model;

public class Users {
    private String userId;

    private String userWechatOpenid;

    private String userWechatAppid;

    private String userRole;

    private String userExtend1;

    private String userExtend2;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserWechatOpenid() {
        return userWechatOpenid;
    }

    public void setUserWechatOpenid(String userWechatOpenid) {
        this.userWechatOpenid = userWechatOpenid == null ? null : userWechatOpenid.trim();
    }

    public String getUserWechatAppid() {
        return userWechatAppid;
    }

    public void setUserWechatAppid(String userWechatAppid) {
        this.userWechatAppid = userWechatAppid == null ? null : userWechatAppid.trim();
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    public String getUserExtend1() {
        return userExtend1;
    }

    public void setUserExtend1(String userExtend1) {
        this.userExtend1 = userExtend1 == null ? null : userExtend1.trim();
    }

    public String getUserExtend2() {
        return userExtend2;
    }

    public void setUserExtend2(String userExtend2) {
        this.userExtend2 = userExtend2 == null ? null : userExtend2.trim();
    }
}