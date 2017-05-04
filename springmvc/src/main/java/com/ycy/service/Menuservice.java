package com.ycy.service;

import com.ycy.model.Menu;

import java.util.List;

/**
 * Created by cuixiaowei on 2016/10/31.
 */
public interface Menuservice {
    public int deleteByPrimaryKey(String menuId);

    public int insert(Menu record);

    public int insertSelective(Menu record);

    public Menu selectByPrimaryKey(String menuId);

    public int updateByPrimaryKeySelective(Menu record);

    public int updateByPrimaryKey(Menu record);

    public List<Menu> selectByMenu(Menu record);
}
