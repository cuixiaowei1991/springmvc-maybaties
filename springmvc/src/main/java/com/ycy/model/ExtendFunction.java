package com.ycy.model;

public class ExtendFunction {
    private String extendfunctionId;

    private String functionName;

    private String applicableWechatAppid;

    private String functionNum;

    private String functionReleaseUser;

    private String functionExtend1;

    private String functionExtend2;

    public String getExtendfunctionId() {
        return extendfunctionId;
    }

    public void setExtendfunctionId(String extendfunctionId) {
        this.extendfunctionId = extendfunctionId == null ? null : extendfunctionId.trim();
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    public String getApplicableWechatAppid() {
        return applicableWechatAppid;
    }

    public void setApplicableWechatAppid(String applicableWechatAppid) {
        this.applicableWechatAppid = applicableWechatAppid == null ? null : applicableWechatAppid.trim();
    }

    public String getFunctionNum() {
        return functionNum;
    }

    public void setFunctionNum(String functionNum) {
        this.functionNum = functionNum == null ? null : functionNum.trim();
    }

    public String getFunctionReleaseUser() {
        return functionReleaseUser;
    }

    public void setFunctionReleaseUser(String functionReleaseUser) {
        this.functionReleaseUser = functionReleaseUser == null ? null : functionReleaseUser.trim();
    }

    public String getFunctionExtend1() {
        return functionExtend1;
    }

    public void setFunctionExtend1(String functionExtend1) {
        this.functionExtend1 = functionExtend1 == null ? null : functionExtend1.trim();
    }

    public String getFunctionExtend2() {
        return functionExtend2;
    }

    public void setFunctionExtend2(String functionExtend2) {
        this.functionExtend2 = functionExtend2 == null ? null : functionExtend2.trim();
    }
}