package com.ycy.dao;

import com.ycy.model.user;

public interface userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer id);

    user selectByUsername(user name);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}