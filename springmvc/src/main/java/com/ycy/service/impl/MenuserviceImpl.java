package com.ycy.service.impl;

import com.ycy.dao.MenuMapper;
import com.ycy.model.Menu;
import com.ycy.service.Menuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cuixiaowei on 2016/10/31.
 */
@Service
public class MenuserviceImpl implements Menuservice {
    @Autowired
    private MenuMapper menuMapper;
    public int deleteByPrimaryKey(String menuId) {
        return menuMapper.deleteByPrimaryKey(menuId);
    }

    public int insert(Menu record) {
        return menuMapper.insert(record);
    }

    public int insertSelective(Menu record) {
        return 0;
    }

    public Menu selectByPrimaryKey(String menuId) {
        return menuMapper.selectByPrimaryKey(menuId);
    }

    public int updateByPrimaryKeySelective(Menu record) {
        return menuMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Menu record) {
        return 0;
    }

    public List<Menu> selectByMenu(Menu record) {
        return menuMapper.selectByMenu(record);
    }
}
