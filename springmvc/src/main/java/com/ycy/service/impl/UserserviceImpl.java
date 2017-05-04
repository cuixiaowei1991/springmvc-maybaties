package com.ycy.service.impl;

import com.ycy.dao.UserAccountMapper;
import com.ycy.model.UserAccount;
import com.ycy.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cuixiaowei on 2016/10/26 0013.
 */
@Service
public class UserserviceImpl implements Userservice {
    @Autowired
    private UserAccountMapper userAccountMapper;


    public UserAccount getUserAccountById(Long userId) {

        return userAccountMapper.selectByPrimaryKey(userId);
    }
}
