package com.ofu.dao;

import java.util.List;

import com.ofu.dao.po.User;

public interface UserDao {
	//查询所有用户
	public List<User> findList(String query) throws Exception;
	//根据id查找用户
	public User findById(int id)throws Exception;
	//增加用户
	public void adduser(User user)throws Exception;
	//更新用户信息
	public void update(User user)throws Exception;
	//删除用户
	public void delete(User user) throws Exception;
}
