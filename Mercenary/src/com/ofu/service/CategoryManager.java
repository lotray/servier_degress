package com.ofu.service;

import java.util.List;

import com.ofu.dao.po.Category;
import com.ofu.dao.po.User;

public interface CategoryManager {
	public void addCategory(Category category) throws Exception ;
	//查询所有用户
	public List<Category> findallcategory() throws Exception;
	//根据id查找用户
	public Category findById(int id)throws Exception;
	//更新用户信息
	public void update(Category category)throws Exception;
	//删除用户
	public void delete(int id) throws Exception;
	//根据名字找类别
	public Category findbyname(String name) throws Exception;
}
