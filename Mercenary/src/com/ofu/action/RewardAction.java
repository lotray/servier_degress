package com.ofu.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.ofu.dao.RewardDao;
import com.ofu.dao.po.Reward;
import com.ofu.dao.po.Task;
import com.ofu.dao.po.User;
import com.ofu.service.RewardManager;
import com.opensymphony.xwork2.ActionSupport;

public class RewardAction extends ActionSupport{
	private boolean key1 = false;
	private Reward reward;
	private String stime;
	private String etime;
	List<Reward> rewards;
	@Resource private RewardManager rewardManager;
	public RewardAction() {
        //初始化Map对象  
		rewards =new ArrayList<Reward>();
    }
	
	public boolean isKey1() {
		return key1;
	}

	public void setKey1(boolean key1) {
		this.key1 = key1;
	}

	public String getStime() {
		return stime;
	}

	public void setStime(String stime) {
		this.stime = stime;
	}

	public String getEtime() {
		return etime;
	}

	public void setEtime(String etime) {
		this.etime = etime;
	}

	public List<Reward> getRewards() {
		return rewards;
	}

	public void setRewards(List<Reward> rewards) {
		this.rewards = rewards;
	}

	public Reward getReward() {
		return reward;
	}
	public void setReward(Reward reward) {
		this.reward = reward;
	}
	
	public RewardManager getRewardManager() {
		return rewardManager;
	}
	public void setRewardManager(RewardManager rewardManager) {
		this.rewardManager = rewardManager;
	}
	public String addreward() throws Exception{
		rewardManager.addReward(reward);
		return SUCCESS;
	}
	public String findrewardbytime() throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟   
		java.util.Date etime1=sdf.parse(etime);
		 java.util.Date stime1=sdf.parse(stime); 
		    String test1;
		   if (stime1.after(etime1)) {
			   test1 = etime;
			   etime = stime;
			   stime =test1;
		   }
		rewards = rewardManager.findrewardbytime(stime,etime);
		key1 = true;
		return SUCCESS;
	}
	public String deletreward() throws Exception{
		rewardManager.delete(reward.getRid());
		return SUCCESS;
	}
	public String findrewardbytitle() throws Exception{
		rewards = rewardManager.findrewardbytitle(reward.getTitle());
		key1 = true;
		return SUCCESS;
	}
	public String findrewardbyid() throws Exception{
		reward = rewardManager.findById(reward.getRid());
		return SUCCESS;
	}
}
