package com.ofu.service;

import java.util.List;

import com.ofu.dao.po.User;

public interface UserManager {
	public void addUser(User user);
	//根据用户名查询所有用户
	public List<User> findbyname(String key) throws Exception;
	//根据id查找用户
	public User findById(int id)throws Exception;
	//更新用户信息
	public void update(User user)throws Exception;
	//删除用户
	public void delete(int id) throws Exception;
	//用户登陆
	public int login(int id,String password);
	//查询所有用户
	public List<User> findallUser() throws Exception;
}
