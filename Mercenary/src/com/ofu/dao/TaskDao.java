package com.ofu.dao;

import java.util.List;

import com.ofu.dao.po.Task;



public interface TaskDao {
	//��ѯ��������
	public List<Task> findList(String query) throws Exception;
	//����id������
	public Task findById(int id)throws Exception;
	//�������
	public void addtask(Task category)throws Exception;
	//��������
	public void update(Task Category)throws Exception;
	//ɾ������
	public void delete(Task Category) throws Exception;
}
