package com.ofu.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ofu.dao.TaskDao;
import com.ofu.dao.po.Task;
import com.ofu.service.TaskManager;
@Transactional(readOnly=false)
public class TaskManagerimpl implements TaskManager{
	private TaskDao taskDao;
	public TaskDao getTaskDao() {
		return taskDao;
	}
	public void setTaskDao(TaskDao taskDao) {
		this.taskDao = taskDao;
	}
	public void addTask(Task task) throws Exception{
		// TODO Auto-generated method stub
		taskDao.addtask(task);
	}
	public List<Task> findalltask() throws Exception {
		// TODO Auto-generated method stub
		String queryString ="from Task";
		return taskDao.findList(queryString);
	}
	public Task findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return taskDao.findById(id);
	}
	public void update(Task task) throws Exception {
		// TODO Auto-generated method stub
		taskDao.update(task);
	}
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		taskDao.delete(taskDao.findById(id));
	}
	public List<Task> findtaskbyUid(int Uid) throws Exception {
		// TODO Auto-generated method stub
		String queryString ="from Task t where t.Uid ="+Uid+"and t.State !='3'";
		return taskDao.findList(queryString);
	}
	public List<Task> findtaskbyRid(int Rid) throws Exception {
		// TODO Auto-generated method stub
		String queryString ="from Task t where t.Rid ="+Rid+"and t.State ='1'";
		return taskDao.findList(queryString);
	}
	public List<Task> findalltaskbyUid(int Uid) throws Exception {
		// TODO Auto-generated method stub
		String queryString ="from Task t where t.Uid ="+Uid+"";
		return taskDao.findList(queryString);
	}
	public List<Task> findtaskbytitle(String name) throws Exception {
		// TODO Auto-generated method stub
		String queryString ="from Task t where t.name like '%"+name+"%'";
		return taskDao.findList(queryString);
	}
	public List<Task> findtaskbyRid1(int Rid) throws Exception {
		// TODO Auto-generated method stub
		String queryString ="from Task t where t.Rid ="+Rid+"and t.State <'2' ";
		return taskDao.findList(queryString);
	}

}
