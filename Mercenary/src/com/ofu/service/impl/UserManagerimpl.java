package com.ofu.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ofu.dao.UserDao;
import com.ofu.dao.po.User;
import com.ofu.service.UserManager;
@Transactional(readOnly=false)
public class UserManagerimpl implements UserManager{
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void addUser(User user) {
		//添加用户
		try {
			userDao.adduser(user);
		} catch (Exception e) {
			// 异常处理
			e.printStackTrace();
		}
	}
	
	public User findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	public void update(User user) throws Exception {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		userDao.delete(userDao.findById(id));
	}

	public List<User> findbyname(String key) throws Exception {
		// TODO Auto-generated method stub
		String queryString ="from User u where u.name like '%"+key+"%'";
		return userDao.findList(queryString);
	}

	public int login(int id,String password){
		// TODO Auto-generated method stub
		User user;
		try {
			user = userDao.findById(id);
			if(password.equals(user.getPassword())){
				return 1;
			}
			else {
				return 0;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	public List<User> findallUser() throws Exception {
		// TODO Auto-generated method stub
		String queryString ="from User";
		return userDao.findList(queryString);
	}
}
