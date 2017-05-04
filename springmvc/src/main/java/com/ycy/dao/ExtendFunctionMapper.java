package com.ycy.dao;

import com.ycy.model.ExtendFunction;

public interface ExtendFunctionMapper {
    int deleteByPrimaryKey(String extendfunctionId);

    int insert(ExtendFunction record);

    int insertSelective(ExtendFunction record);

    ExtendFunction selectByPrimaryKey(String extendfunctionId);

    int updateByPrimaryKeySelective(ExtendFunction record);

    int updateByPrimaryKey(ExtendFunction record);
}