package com.ycy.model;

public class KeywordReply {
    private String keywordreplyId;

    private String keywordreplyKeywordid;

    private String keywordreplyContent;

    private String keywordreplyAppid;

    private String keywordreplyUser;

    public String getKeywordreplyId() {
        return keywordreplyId;
    }

    public void setKeywordreplyId(String keywordreplyId) {
        this.keywordreplyId = keywordreplyId == null ? null : keywordreplyId.trim();
    }

    public String getKeywordreplyKeywordid() {
        return keywordreplyKeywordid;
    }

    public void setKeywordreplyKeywordid(String keywordreplyKeywordid) {
        this.keywordreplyKeywordid = keywordreplyKeywordid == null ? null : keywordreplyKeywordid.trim();
    }

    public String getKeywordreplyContent() {
        return keywordreplyContent;
    }

    public void setKeywordreplyContent(String keywordreplyContent) {
        this.keywordreplyContent = keywordreplyContent == null ? null : keywordreplyContent.trim();
    }

    public String getKeywordreplyAppid() {
        return keywordreplyAppid;
    }

    public void setKeywordreplyAppid(String keywordreplyAppid) {
        this.keywordreplyAppid = keywordreplyAppid == null ? null : keywordreplyAppid.trim();
    }

    public String getKeywordreplyUser() {
        return keywordreplyUser;
    }

    public void setKeywordreplyUser(String keywordreplyUser) {
        this.keywordreplyUser = keywordreplyUser == null ? null : keywordreplyUser.trim();
    }
}