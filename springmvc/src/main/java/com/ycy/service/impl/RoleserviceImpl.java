package com.ycy.service.impl;

import com.ycy.dao.RoleMapper;
import com.ycy.model.Role;
import com.ycy.service.Roleservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cuixiaowei on 2016/10/28.
 */
@Service
public class RoleserviceImpl implements Roleservice {
    @Autowired
    private RoleMapper roleMapper;
    public int insertRole(Role role) {
        return roleMapper.insert(role);
    }
}
