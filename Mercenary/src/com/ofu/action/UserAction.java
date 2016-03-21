package com.ofu.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import com.ofu.dao.po.Reward;
import com.ofu.dao.po.Task;
import com.ofu.dao.po.User;
import com.ofu.service.RewardManager;
import com.ofu.service.TaskManager;
import com.ofu.service.UserManager;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.bind.v2.model.core.ID;

public class UserAction extends ActionSupport{
	private boolean key1 = false;
	private String key;
	private User user;
	private Reward reward;
	private Task task;
	@Resource private UserManager userManager;
	@Resource private RewardManager rewardManager;
	@Resource private TaskManager taskManager;
	private List<Reward> rewards;
	private List<Task> tasks;
	private List<User> users;
	public UserAction() {
        //初始化Map对象  
		rewards =new ArrayList<Reward>();
		tasks =new ArrayList<Task>();
		users =new ArrayList<User>();

    }
	
	public boolean isKey1() {
		return key1;
	}

	public void setKey1(boolean key1) {
		this.key1 = key1;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<Reward> getRewards() {
		return rewards;
	}

	public void setRewards(List<Reward> rewards) {
		this.rewards = rewards;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserManager getUserManager() {
		return userManager;
	}
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	public Reward getReward() {
		return reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	public String addUser(){
		System.out.println(user.getName());
		userManager.addUser(user);
		return SUCCESS;
	}
	public String login() throws Exception{
		if (user.getUid()==1001&&user.getPassword().equals("123")) {
			//System.out.println(userManager.login(user.getUid(), user.getPassword()));
			this.addFieldError("user.Uid","添加成功！");
			return SUCCESS;
		}
		else{
			return INPUT;
		}
	}
	public String findUsers() throws Exception{
		users = userManager.findallUser();
		return SUCCESS;
	}
	public String findUsersbyname() throws Exception{
		users = userManager.findbyname(key);
		return SUCCESS;
	} 
	public String finduserinfo() throws Exception{
		int id = user.getUid();
		System.out.println(id);
		user = userManager.findById(id);
		rewards = rewardManager.findrewardbyUid(id);
		tasks = taskManager.findtaskbyUid(id);
		return SUCCESS;
	}
	public String deleteUser() throws Exception{
		userManager.delete(user.getUid());
		userManager.findallUser();
		user=userManager.findById(user.getUid());
		return SUCCESS;
	}
	public String updateUser() throws Exception{
		System.out.println(user.getUid());
		userManager.update(user);
		
		user=userManager.findById(user.getUid());
		rewards = rewardManager.findrewardbyUid(user.getUid());
		tasks = taskManager.findtaskbyUid(user.getUid());
		return SUCCESS;
	}
	public String jumpUser() throws Exception{
		user=userManager.findById(user.getUid());
		return SUCCESS;
	}
	
	public String updatereward() throws Exception{
		//reward = rewardManager.findById(reward.getRid());
		System.out.println("111");
		rewardManager.update(reward);
		System.out.println("666");
		user=userManager.findById(Integer.parseInt(reward.getRUid()));
		rewards = rewardManager.findrewardbyUid(Integer.parseInt(reward.getRUid()));
		tasks = taskManager.findtaskbyUid(Integer.parseInt(reward.getRUid()));
		key1 = true;
		return SUCCESS;
	}
	public String deletereward() throws Exception{
		//reward = rewardManager.findById(reward.getRid());
		String RUid=rewardManager.findById(reward.getRid()).getRUid();
		rewardManager.delete(reward.getRid());
		System.out.println("666");
		user=userManager.findById(Integer.parseInt(RUid));
		rewards = rewardManager.findrewardbyUid(Integer.parseInt(RUid));
		tasks = taskManager.findtaskbyUid(Integer.parseInt(RUid));
		key1 = true;
		return SUCCESS;
	}
	public String jumpreward() throws Exception{
		reward=rewardManager.findById(reward.getRid());
		return SUCCESS;
	}
	
	public String updateTask() throws Exception{
		//reward = rewardManager.findById(reward.getRid());
		taskManager.update(task);
		System.out.println("666");
		user=userManager.findById(Integer.parseInt(task.getUid()));
		rewards = rewardManager.findrewardbyUid(Integer.parseInt(task.getUid()));
		tasks = taskManager.findtaskbyUid(Integer.parseInt(task.getUid()));
		key1 =true;
		return SUCCESS;
	}
	public String updateTask1() throws Exception{
		//reward = rewardManager.findById(reward.getRid());
		System.out.println("--------"+key);
		taskManager.update(task);
		System.out.println("666");
		tasks = taskManager.findtaskbytitle(key);
		key1 =true;
		return SUCCESS;
	}
	public String deleteTask() throws Exception{
		//reward = rewardManager.findById(reward.getRid());
		key1 = true;
		String Uid=taskManager.findById(task.getTid()).getUid();
		System.out.println(task.getTid());
		taskManager.delete(task.getTid());
		System.out.println("616");
		user=userManager.findById(Integer.parseInt(Uid));
		rewards = rewardManager.findrewardbyUid(Integer.parseInt(Uid));
		tasks = taskManager.findtaskbyUid(Integer.parseInt(Uid));
		key1 =true;
		return SUCCESS;
	}
	public String deleteTask1() throws Exception{
		//reward = rewardManager.findById(reward.getRid());
		key1 = true;
		String Uid=taskManager.findById(task.getTid()).getUid();
		taskManager.delete(task.getTid());
		System.out.println("616");
		tasks = taskManager.findtaskbytitle(key);
		key1 =true;
		return SUCCESS;
	}
	public String jumpTask() throws Exception{
		System.out.println(key);
		key = key;
		task=taskManager.findById(task.getTid());
		return SUCCESS;
	}
}
