package com.ofu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.ofu.dao.UserDao;
import com.ofu.dao.po.Reward;
import com.ofu.dao.po.User;

public class UserDaoimpl implements UserDao{
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public User findById(int id) throws Exception {
		//����id�����û�
		return hibernateTemplate.get(User.class, id);
	}
	public void update(User user) throws Exception {
		//�����û���Ϣ
		hibernateTemplate.update(user);
	}
	public void delete(User user) throws Exception {
		//ɾ���û�
		hibernateTemplate.delete(user);
	}
	public void adduser(User user) throws Exception {
		//�����û�user
		hibernateTemplate.save(user);
	}
	public List<User> findList(String query) throws Exception {
		// TODO Auto-generated method stub
		return (List<User>) hibernateTemplate.find(query);
	}
}
