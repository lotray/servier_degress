package com.ofu.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.ofu.dao.CategoryDao;
import com.ofu.dao.po.Category;
import com.ofu.dao.po.Task;
import com.ofu.service.CategoryManager;
import com.opensymphony.xwork2.ActionSupport;


public class CategoryAction extends ActionSupport{
	private Category category;
	@Resource private CategoryManager categoryManager;
	private List<Category> categories;
//	public CategoryAction() {
//        //初始化Map对象  
//		categories =new ArrayList<Category>();
//    }
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public CategoryManager getCategoryManager() {
		return categoryManager;
	}
	public void setCategoryManager(CategoryManager categoryManager) {
		this.categoryManager = categoryManager;
	}
	public String addcategory() throws Exception{
		categoryManager.addCategory(category);
		findallcategory();
		return SUCCESS;
	}
	public String deletecategorie() throws Exception{
		categoryManager.delete(category.getCid());
		findallcategory();
		return SUCCESS;
	}
	public String findallcategory() throws Exception{
		categories=categoryManager.findallcategory();
		return SUCCESS;
	}
}
