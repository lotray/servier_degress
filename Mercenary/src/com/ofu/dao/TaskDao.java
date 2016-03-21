package com.ofu.dao;

import java.util.List;

import com.ofu.dao.po.Task;



public interface TaskDao {
	//查询所有任务
	public List<Task> findList(String query) throws Exception;
	//根据id查任务
	public Task findById(int id)throws Exception;
	//添加任务
	public void addtask(Task category)throws Exception;
	//更新任务
	public void update(Task Category)throws Exception;
	//删除任务
	public void delete(Task Category) throws Exception;
}
