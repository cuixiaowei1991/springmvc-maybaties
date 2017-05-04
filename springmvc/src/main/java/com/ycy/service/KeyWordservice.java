package com.ycy.service;

import com.ycy.model.KeyWord;

import java.util.List;

/**
 * Created by cuixiaowei on 2016/10/28.
 */
public interface KeyWordservice {
    /**
     * 新增关键字
     * @return
     */
    public int insertKeyWord(KeyWord keyWord);

    /**
     *按照主键查询
     * @param keywordId
     * @return
     */
    public KeyWord selectByPrimaryKey(String keywordId);

    /**
     * 按照对象相关字段查询
     * @param keyWord
     * @return
     */
    public List<KeyWord> selectByKeyWord(KeyWord keyWord);


}
