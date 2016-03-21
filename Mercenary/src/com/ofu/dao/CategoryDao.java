package com.ofu.dao;

import java.util.List;

import com.ofu.dao.po.Category;



public interface CategoryDao {
	//�����������
	public List<Category> findList(String query) throws Exception;
	//����id�������
	public Category findById(int id)throws Exception;
	//������
	public void addcategory(Category category)throws Exception;
	//�������
	public void update(Category Category)throws Exception;
	//ɾ�����
	public void delete(Category Category) throws Exception;
}
