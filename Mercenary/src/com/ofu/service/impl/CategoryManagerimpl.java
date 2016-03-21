package com.ofu.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ofu.dao.CategoryDao;
import com.ofu.dao.po.Category;
import com.ofu.dao.po.User;
import com.ofu.service.CategoryManager;
@Transactional(readOnly=false)
public class CategoryManagerimpl implements CategoryManager{
	private CategoryDao categoryDao;
	public CategoryDao getCategoryDao() {
		return categoryDao;
	}
	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}
	public void addCategory(Category category) throws Exception {
		// TODO Auto-generated method stub
		categoryDao.addcategory(category);
	}
	public List<Category> findallcategory() throws Exception {
		// TODO Auto-generated method stub
		String queryString ="from Category";
		return categoryDao.findList(queryString);
	}
	public Category findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return categoryDao.findById(id);
	}
	public void update(Category category) throws Exception {
		// TODO Auto-generated method stub
		categoryDao.update(category);
	}
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		categoryDao.delete(categoryDao.findById(id));
	}
	public Category findbyname(String name) throws Exception {
		// TODO Auto-generated method stub
		return (Category) categoryDao.findList("from Category c where c.name = '"+name+"'").get(0);
	}

}
