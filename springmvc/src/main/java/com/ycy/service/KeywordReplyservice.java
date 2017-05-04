package com.ycy.service;

import com.ycy.model.KeywordReply;

import java.util.List;

/**
 * Created by cuixiaowei on 2016/10/31.
 */
public interface KeywordReplyservice {

    /**
     * 根据主键查询
     * @param keywordreplyId
     * @return
     */
    public int deleteByPrimaryKey(String keywordreplyId);

    /**
     * 新增
     * @param record
     * @return
     */
    public int insert(KeywordReply record);

    /**
     *  根据主键删除
     * @param keywordreplyId
     * @return
     */
    public KeywordReply selectByPrimaryKey(String keywordreplyId);

    /**
     * 条件查询返回list
     * @param record
     * @return
     */
    public List<KeywordReply> selectByKeywordReply(KeywordReply record);

    /**
     * 更新
     * @param record
     * @return
     */
    public int updateByPrimaryKeySelective(KeywordReply record);

    public int updateByPrimaryKey(KeywordReply record);
}
