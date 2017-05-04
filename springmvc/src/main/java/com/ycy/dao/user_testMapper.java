package com.ycy.dao;

import com.ycy.model.user_test;

public interface user_testMapper {
    int deleteByPrimaryKey(String userId);

    int insert(user_test record);

    int insertSelective(user_test record);

    user_test selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(user_test record);

    int updateByPrimaryKeyWithBLOBs(user_test record);
}