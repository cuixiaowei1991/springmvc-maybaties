package com.ycy.service.impl;

import com.ycy.dao.UserAccountMapper;
import com.ycy.dao.userMapper;
import com.ycy.model.user;
import com.ycy.service.UserTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cuixiaowei on 2016/10/28.
 */
@Service
public class UserTestImpl implements UserTest {
    @Autowired
    private userMapper userMapper1;
    public user getUserById(int userId) {

        return userMapper1.selectByPrimaryKey(userId);
    }

    public user getUserByName(user name) {
        return userMapper1.selectByUsername(name);
    }
}
