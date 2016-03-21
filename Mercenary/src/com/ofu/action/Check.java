package com.ofu.action;

import java.sql.Date;
import java.util.List;
import java.util.TimerTask;

import javax.annotation.Resource;

import com.ofu.dao.po.Reward;
import com.ofu.dao.po.Task;
import com.ofu.service.RewardManager;
import com.ofu.service.TaskManager;

public class Check extends TimerTask{
	@Resource private RewardManager rewardManager;
	@Resource private TaskManager taskManager;
	private List<Reward> rewards;
	private List<Task> tasks;
	public List<Reward> getRewards() {
		return rewards;
	}

	public void setRewards(List<Reward> rewards) {
		this.rewards = rewards;
	}

	public RewardManager getRewardManager() {
		return rewardManager;
	}

	public void setRewardManager(RewardManager rewardManager) {
		this.rewardManager = rewardManager;
	}

	public TaskManager getTaskManager() {
		return taskManager;
	}

	public void setTaskManager(TaskManager taskManager) {
		this.taskManager = taskManager;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 Date date = new Date(System.currentTimeMillis());
		 try {
			rewards = rewardManager.findallreward();
			for (int i = 0; i < rewards.size(); i++) {
				if (date.after(rewards.get(i).getEndtime())) {
					tasks = taskManager.findtaskbyRid1(rewards.get(i).getRid());
					for (int j = 0; j < tasks.size(); j++) {
						tasks.get(j).setState("3");
						taskManager.update(tasks.get(j));
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
