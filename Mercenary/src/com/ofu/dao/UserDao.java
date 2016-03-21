package com.ofu.dao;

import java.util.List;

import com.ofu.dao.po.User;

public interface UserDao {
	//��ѯ�����û�
	public List<User> findList(String query) throws Exception;
	//����id�����û�
	public User findById(int id)throws Exception;
	//�����û�
	public void adduser(User user)throws Exception;
	//�����û���Ϣ
	public void update(User user)throws Exception;
	//ɾ���û�
	public void delete(User user) throws Exception;
}
