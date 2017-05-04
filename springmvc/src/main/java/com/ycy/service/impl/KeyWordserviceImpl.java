package com.ycy.service.impl;

import com.ycy.dao.KeyWordMapper;
import com.ycy.model.KeyWord;
import com.ycy.service.KeyWordservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cuixiaowei on 2016/10/28.
 */
@Service
public class KeyWordserviceImpl implements KeyWordservice{
    @Autowired
    private KeyWordMapper keyWordMapper;

    public int insertKeyWord(KeyWord keyWord) {
        return keyWordMapper.insert(keyWord);
    }

    public KeyWord selectByPrimaryKey(String keywordId) {
        return keyWordMapper.selectByPrimaryKey(keywordId);
    }

    public List<KeyWord> selectByKeyWord(KeyWord keyWord) {
        return keyWordMapper.selectByKeyWord(keyWord);
    }
}
