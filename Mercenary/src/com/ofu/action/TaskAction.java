package com.ofu.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.ofu.dao.po.Reward;
import com.ofu.dao.po.Task;
import com.ofu.service.TaskManager;
import com.opensymphony.xwork2.ActionSupport;

public class TaskAction extends ActionSupport{
	boolean key1 = false;
	private String key;
	private Task task;
	private List<Task> tasks;
	@Resource private TaskManager taskManager;
	public TaskAction() {
        //初始化Map对象  
		tasks =new ArrayList<Task>();
    }
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public boolean isKey1() {
		return key1;
	}

	public void setKey1(boolean key1) {
		this.key1 = key1;
	}

	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public TaskManager getTaskManager() {
		return taskManager;
	}
	public void setTaskManager(TaskManager taskManager) {
		this.taskManager = taskManager;
	}
	public String addTask() throws Exception{
		taskManager.addTask(task);
		return SUCCESS;
	}
	public String findtaskbytitle() throws Exception{
		key = task.getName();
		tasks = taskManager.findtaskbytitle(task.getName());
		key1 = true;
		return SUCCESS;	
	}
}
