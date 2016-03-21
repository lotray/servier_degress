package com.ofu.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.ofu.dao.po.Reward;
import com.ofu.dao.po.Task;
import com.ofu.dao.po.User;
import com.ofu.service.RewardManager;
import com.ofu.service.TaskManager;
import com.ofu.service.UserManager;
import com.opensymphony.xwork2.ActionSupport;

public class AppTaskAction extends ActionSupport{
	@Resource private TaskManager taskManager;
	@Resource private RewardManager rewardManager;
	@Resource private UserManager userManager;
	private Task task;
	private Map<String, Object> dataMap;
	private List<Task> tasks;
	public AppTaskAction() {  
	        //初始化Map对象  
	    	dataMap = new HashMap<String, Object>();
	    	tasks =new ArrayList<Task>();
	    }
	
	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public RewardManager getRewardManager() {
		return rewardManager;
	}

	public void setRewardManager(RewardManager rewardManager) {
		this.rewardManager = rewardManager;
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
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	public TaskManager getTaskManager() {
		return taskManager;
	}
	public void setTaskManager(TaskManager taskManager) {
		this.taskManager = taskManager;
	}
	public String findTaskbyUid(){
		
		return null;	
	}
	public String addtask() throws Exception{
		task.setState("0");
		task.setName(new String(task.getName().getBytes("ISO8859-1"),"UTF-8"));
		System.out.println(task.getUid());
		System.out.println("-----");
		System.out.println(rewardManager.findById(Integer.parseInt(task.getRid())).getRUid().equals(task.getUid()));
		if (!rewardManager.findById(Integer.parseInt(task.getRid())).getRUid().equals(task.getUid())) {
			taskManager.addTask(task);
			dataMap.put("message", "任务接取成功！");
		}
		else {
			dataMap.put("message", "任务接取失败，本人不能接取自己发布的任务！");
		}
		return SUCCESS;
	}
	public String findtaskbyUid() throws NumberFormatException, Exception{
		tasks=taskManager.findtaskbyUid(Integer.parseInt(task.getUid()));
		return SUCCESS;	
	}
	public String giveuptask() throws Exception{
		System.out.println(task.getTid());
		System.out.println(taskManager.findById(task.getTid()).getName());
		task=taskManager.findById(task.getTid());
		task.setState("3");
		taskManager.update(task);
		dataMap.put("message", "任务已放弃！");
		return SUCCESS;
	}
	public String finishtask() throws Exception{
		System.out.println(task.getTid());
		System.out.println(taskManager.findById(task.getTid()).getName());
		task=taskManager.findById(task.getTid());
		User user = userManager.findById(Integer.parseInt(task.getUid()));
		System.out.println(user.getMoney()+rewardManager.findById(Integer.parseInt(task.getRid())).getMoney());
		user.setMoney(user.getMoney()+rewardManager.findById(Integer.parseInt(task.getRid())).getMoney());
		userManager.update(user);
		task.setState("2");
		taskManager.update(task);
		//rewardManager.delete(Integer.parseInt(task.getRid()));
		tasks = taskManager.findtaskbyRid1(Integer.parseInt(task.getRid()));
		for (int i = 0; i < tasks.size(); i++) {
			tasks.get(i).setState("3");
			System.out.println(tasks.get(i).getState());
			taskManager.update(tasks.get(i));
		}
		
		dataMap.put("message", "任务已确认完成！");
		return SUCCESS;
	}
	public String uptask() throws Exception{
		System.out.println(task.getTid());
		System.out.println(taskManager.findById(task.getTid()).getName());
		task=taskManager.findById(task.getTid());
		task.setState("1");
		taskManager.update(task);
		dataMap.put("message", "任务已提交！");
		return SUCCESS;
	}
}
