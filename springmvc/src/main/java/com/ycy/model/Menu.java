package com.ycy.model;

public class Menu {
    private String menuId;

    private String menuName;

    private String menuApplyappid;

    private String menuLevelid;

    private String menuSuperiorid;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuApplyappid() {
        return menuApplyappid;
    }

    public void setMenuApplyappid(String menuApplyappid) {
        this.menuApplyappid = menuApplyappid == null ? null : menuApplyappid.trim();
    }

    public String getMenuLevelid() {
        return menuLevelid;
    }

    public void setMenuLevelid(String menuLevelid) {
        this.menuLevelid = menuLevelid == null ? null : menuLevelid.trim();
    }

    public String getMenuSuperiorid() {
        return menuSuperiorid;
    }

    public void setMenuSuperiorid(String menuSuperiorid) {
        this.menuSuperiorid = menuSuperiorid == null ? null : menuSuperiorid.trim();
    }
}