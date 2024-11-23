package com.study.home_project.repository;

import com.study.home_project.entity.Category;
import com.study.home_project.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    public int saveMenu(Menu menu);
    public List<Menu> getMenus();
    public int deleteMenuByMenuId(int menuId);
    public int updateMenuByMenuId(Menu menu);
    public List<Menu> getBurger();
    public List<Menu> getDrink();
    public List<Category> getCategory();

}