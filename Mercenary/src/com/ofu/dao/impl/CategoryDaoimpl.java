package com.ofu.dao.impl;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.ofu.dao.CategoryDao;
import com.ofu.dao.po.Category;
import com.ofu.dao.po.Reward;


public class CategoryDaoimpl implements CategoryDao{
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public Category findById(int id) throws Exception {
		//����id�������
		return hibernateTemplate.get(Category.class, id);
	}
	public void update(Category Category) throws Exception {
		//�������
		hibernateTemplate.update(Category);
	}
	public void delete(Category Category) throws Exception {
		//ɾ�����
		hibernateTemplate.delete(Category);
	}
	public void addcategory(Category category) throws Exception {
		//������
		hibernateTemplate.save(category);
	}
	public List<Category> findList(String query) throws Exception {
		// TODO Auto-generated method stub
		return (List<Category>) hibernateTemplate.find(query);
	}
}
