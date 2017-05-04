package com.ycy.dao;

import com.ycy.model.KeywordReply;

import java.util.List;

public interface KeywordReplyMapper {
    int deleteByPrimaryKey(String keywordreplyId);

    int insert(KeywordReply record);

    int insertSelective(KeywordReply record);

    KeywordReply selectByPrimaryKey(String keywordreplyId);

    List<KeywordReply> selectByKeywordReply(KeywordReply record);

    int updateByPrimaryKeySelective(KeywordReply record);

    int updateByPrimaryKey(KeywordReply record);
}