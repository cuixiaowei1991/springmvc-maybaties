package com.ycy.service;

import com.ycy.model.UserAccount;
import com.ycy.model.user;

/**
 * Created by cuixiaowei on 2016/10/28.
 */
public interface UserTest {
    public user getUserById(int userId);

    public user getUserByName(user name);

}
