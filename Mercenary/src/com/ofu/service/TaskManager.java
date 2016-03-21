package com.ofu.service;

import java.util.List;

import com.ofu.dao.po.Reward;
import com.ofu.dao.po.Task;


public interface TaskManager {
	public abstract void addTask(Task task) throws Exception;
	//查询所有用户
	public List<Task> findalltask() throws Exception;
	//根据id查找用户
	public Task findById(int id)throws Exception;
	//更新用户信息
	public void update(Task task)throws Exception;
	//删除用户
	public void delete(int id) throws Exception;
	//查询TaskbyUid
	public List<Task> findtaskbyUid(int Uid) throws Exception;
	//查询TaskbyUid
	public List<Task> findtaskbyRid(int Rid) throws Exception;
	//查询TaskbyUid
	public List<Task> findalltaskbyUid(int Uid) throws Exception;
	//根据姓名查询Task
	public List<Task> findtaskbytitle(String name) throws Exception;
	//查询TaskbyUid
	public List<Task> findtaskbyRid1(int Rid) throws Exception;
	
}
