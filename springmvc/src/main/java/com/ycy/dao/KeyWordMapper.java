package com.ycy.dao;

import com.ycy.model.KeyWord;

import java.util.List;

public interface KeyWordMapper {
    int deleteByPrimaryKey(String keywordId);

    int insert(KeyWord record);

    int insertSelective(KeyWord record);

    KeyWord selectByPrimaryKey(String keywordId);

    List<KeyWord> selectByKeyWord(KeyWord keyWord);

    int updateByPrimaryKeySelective(KeyWord record);

    int updateByPrimaryKey(KeyWord record);
}