package com.ofu.service;

import java.util.List;

import com.ofu.dao.po.Reward;
import com.ofu.dao.po.Task;


public interface TaskManager {
	public abstract void addTask(Task task) throws Exception;
	//��ѯ�����û�
	public List<Task> findalltask() throws Exception;
	//����id�����û�
	public Task findById(int id)throws Exception;
	//�����û���Ϣ
	public void update(Task task)throws Exception;
	//ɾ���û�
	public void delete(int id) throws Exception;
	//��ѯTaskbyUid
	public List<Task> findtaskbyUid(int Uid) throws Exception;
	//��ѯTaskbyUid
	public List<Task> findtaskbyRid(int Rid) throws Exception;
	//��ѯTaskbyUid
	public List<Task> findalltaskbyUid(int Uid) throws Exception;
	//����������ѯTask
	public List<Task> findtaskbytitle(String name) throws Exception;
	//��ѯTaskbyUid
	public List<Task> findtaskbyRid1(int Rid) throws Exception;
	
}
