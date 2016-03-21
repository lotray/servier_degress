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
		//根据id查找用户
		return hibernateTemplate.get(User.class, id);
	}
	public void update(User user) throws Exception {
		//更新用户信息
		hibernateTemplate.update(user);
	}
	public void delete(User user) throws Exception {
		//删除用户
		hibernateTemplate.delete(user);
	}
	public void adduser(User user) throws Exception {
		//增加用户user
		hibernateTemplate.save(user);
	}
	public List<User> findList(String query) throws Exception {
		// TODO Auto-generated method stub
		return (List<User>) hibernateTemplate.find(query);
	}
}
