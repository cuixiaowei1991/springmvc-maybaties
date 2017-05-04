package com.ycy.dao;

import com.ycy.model.MenuReply;

public interface MenuReplyMapper {
    int deleteByPrimaryKey(String menureplyId);

    int insert(MenuReply record);

    int insertSelective(MenuReply record);

    MenuReply selectByPrimaryKey(String menureplyId);

    int updateByPrimaryKeySelective(MenuReply record);

    int updateByPrimaryKey(MenuReply record);
}