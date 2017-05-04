package com.ycy.model;

public class MenuReply {
    private String menureplyId;

    private String menureplyMenuid;

    private String menureplyInfo;

    private String menureplyInputuser;

    public String getMenureplyId() {
        return menureplyId;
    }

    public void setMenureplyId(String menureplyId) {
        this.menureplyId = menureplyId == null ? null : menureplyId.trim();
    }

    public String getMenureplyMenuid() {
        return menureplyMenuid;
    }

    public void setMenureplyMenuid(String menureplyMenuid) {
        this.menureplyMenuid = menureplyMenuid == null ? null : menureplyMenuid.trim();
    }

    public String getMenureplyInfo() {
        return menureplyInfo;
    }

    public void setMenureplyInfo(String menureplyInfo) {
        this.menureplyInfo = menureplyInfo == null ? null : menureplyInfo.trim();
    }

    public String getMenureplyInputuser() {
        return menureplyInputuser;
    }

    public void setMenureplyInputuser(String menureplyInputuser) {
        this.menureplyInputuser = menureplyInputuser == null ? null : menureplyInputuser.trim();
    }
}