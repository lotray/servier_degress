package com.ofu.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.ofu.dao.po.Category;
import com.ofu.dao.po.User;
import com.ofu.service.CategoryManager;
import com.ofu.service.UserManager;
import com.opensymphony.xwork2.ActionSupport;

public class AppCategoryAction extends ActionSupport{
private static final long serialVersionUID = 1L;  
    
    //将会被Struts2序列化为JSON字符串的对象  
    private List<Category> categories;
    @Resource private CategoryManager categoryManager;
    public AppCategoryAction() {
        //初始化Map对象  
    	categories =new ArrayList<Category>();  
    }
    
	public void setCategoryManager(CategoryManager categoryManager) {
		this.categoryManager = categoryManager;
	}

	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}  
    public String findallcategories(){
    	try {
			categories=categoryManager.findallcategory();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
    }
}
