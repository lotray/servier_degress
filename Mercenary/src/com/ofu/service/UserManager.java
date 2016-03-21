package com.ofu.service;

import java.util.List;

import com.ofu.dao.po.User;

public interface UserManager {
	public void addUser(User user);
	//�����û�����ѯ�����û�
	public List<User> findbyname(String key) throws Exception;
	//����id�����û�
	public User findById(int id)throws Exception;
	//�����û���Ϣ
	public void update(User user)throws Exception;
	//ɾ���û�
	public void delete(int id) throws Exception;
	//�û���½
	public int login(int id,String password);
	//��ѯ�����û�
	public List<User> findallUser() throws Exception;
}
