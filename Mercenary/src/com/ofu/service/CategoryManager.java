package com.ofu.service;

import java.util.List;

import com.ofu.dao.po.Category;
import com.ofu.dao.po.User;

public interface CategoryManager {
	public void addCategory(Category category) throws Exception ;
	//��ѯ�����û�
	public List<Category> findallcategory() throws Exception;
	//����id�����û�
	public Category findById(int id)throws Exception;
	//�����û���Ϣ
	public void update(Category category)throws Exception;
	//ɾ���û�
	public void delete(int id) throws Exception;
	//�������������
	public Category findbyname(String name) throws Exception;
}
