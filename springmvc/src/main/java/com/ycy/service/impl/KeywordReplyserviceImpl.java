package com.ycy.service.impl;

import com.ycy.dao.KeywordReplyMapper;
import com.ycy.model.KeywordReply;
import com.ycy.service.KeywordReplyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cuixiaowei on 2016/10/31.
 */
@Service
public class KeywordReplyserviceImpl implements KeywordReplyservice{

    @Autowired
    private KeywordReplyMapper keywordReplyMapper;
    public int deleteByPrimaryKey(String keywordreplyId) {

        return keywordReplyMapper.deleteByPrimaryKey(keywordreplyId);
    }

    public int insert(KeywordReply record) {
        return keywordReplyMapper.insert(record);
    }

    public KeywordReply selectByPrimaryKey(String keywordreplyId) {
        return keywordReplyMapper.selectByPrimaryKey(keywordreplyId);
    }

    public List<KeywordReply> selectByKeywordReply(KeywordReply record) {
        return keywordReplyMapper.selectByKeywordReply(record);
    }

    public int updateByPrimaryKeySelective(KeywordReply record) {
        return keywordReplyMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(KeywordReply record) {
        return keywordReplyMapper.updateByPrimaryKey(record);
    }
}
