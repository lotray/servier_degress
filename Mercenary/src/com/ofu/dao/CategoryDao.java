package com.ofu.dao;

import java.util.List;

import com.ofu.dao.po.Category;



public interface CategoryDao {
	//查找所有类别
	public List<Category> findList(String query) throws Exception;
	//根据id查找类别
	public Category findById(int id)throws Exception;
	//添加类别
	public void addcategory(Category category)throws Exception;
	//更新类别
	public void update(Category Category)throws Exception;
	//删除类别
	public void delete(Category Category) throws Exception;
}
