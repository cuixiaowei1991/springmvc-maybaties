package com.ycy.model;

public class KeyWord {
    private String keywordId;

    private String keywordValue;

    private String keywordAddUser;

    private String keywordType;

    public String getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(String keywordId) {
        this.keywordId = keywordId == null ? null : keywordId.trim();
    }

    public String getKeywordValue() {
        return keywordValue;
    }

    public void setKeywordValue(String keywordValue) {
        this.keywordValue = keywordValue == null ? null : keywordValue.trim();
    }

    public String getKeywordAddUser() {
        return keywordAddUser;
    }

    public void setKeywordAddUser(String keywordAddUser) {
        this.keywordAddUser = keywordAddUser == null ? null : keywordAddUser.trim();
    }

    public String getKeywordType() {
        return keywordType;
    }

    public void setKeywordType(String keywordType) {
        this.keywordType = keywordType == null ? null : keywordType.trim();
    }
}