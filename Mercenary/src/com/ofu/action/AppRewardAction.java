package com.ofu.action;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.ofu.dao.po.Category;
import com.ofu.dao.po.Reward;
import com.ofu.dao.po.Task;
import com.ofu.dao.po.User;
import com.ofu.service.CategoryManager;
import com.ofu.service.RewardManager;
import com.ofu.service.TaskManager;
import com.ofu.service.UserManager;
import com.opensymphony.xwork2.ActionSupport;

public class AppRewardAction extends ActionSupport{
	private String category;
	private int Uid;
	private Category category2;
	private Reward reward;
	private List<Reward> rewards;
	private List<Task> tasks;
	private Map<String, Object> dataMap;
	@Resource private RewardManager rewardManager;
	@Resource private CategoryManager categoryManager;
	@Resource private TaskManager taskManager;
	@Resource private UserManager userManager;
	public AppRewardAction() {
        //初始化Map对象  
		rewards =new ArrayList<Reward>();
		tasks = new ArrayList<Task>();
		dataMap = new HashMap<String, Object>(); 
		reward = new Reward();
    }
	
	public Category getCategory2() {
		return category2;
	}

	public void setCategory2(Category category2) {
		this.category2 = category2;
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
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

	public CategoryManager getCategoryManager() {
		return categoryManager;
	}

	public void setCategoryManager(CategoryManager categoryManager) {
		this.categoryManager = categoryManager;
	}

	public int getUid() {
		return Uid;
	}

	public void setUid(int uid) {
		Uid = uid;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public List<Reward> getRewards() { 
		return rewards;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	public String findrewardbycategory(){
		try {
			rewards=rewardManager.findbycategory(category);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String addreward(){
		try {
			System.out.println(new String(category.getBytes("ISO8859-1"),"UTF-8"));
			reward.setCategory(Integer.toString(categoryManager.findbyname(new String(category.getBytes("ISO8859-1"),"UTF-8")).getCid()));
			System.out.println(reward.getCategory());
			System.out.println(reward.getMoney());
			reward.setTitle(new String(reward.getTitle().getBytes("ISO8859-1"),"UTF-8"));
			reward.setContent(new String(reward.getContent().getBytes("ISO8859-1"),"UTF-8"));
			reward.setRUid(Integer.toString(Uid));
			reward.setLevel(getlevel(reward.getMoney()));
			reward.setStarttime(new Date(System.currentTimeMillis()));
			if (userManager.findById(Uid).getMoney()>reward.getMoney()) {
				rewardManager.addReward(reward);
				User user =userManager.findById(Uid);
				user.setMoney(user.getMoney()-reward.getMoney());
				userManager.update(user);
				dataMap.put("message", "悬赏发布成功！");
			}
			else {
				dataMap.put("message", "悬赏发布失败，余额不足！");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String getlevel(float money){
		String level="F";
		if (money>=1000) {
			level = "SS";
		}else if (800<=money&&money<1000) {
			level ="S";
		}
		else if (600<=money&&money<800) {
			level ="A";
		}
		else if (500<=money&&money<600) {
			level ="B";
		}
		else if (400<=money&&money<500) {
			level ="C";
		}else if (200<=money&&money<300) {
			level ="D";
		}
		else if (100<=money&&money<200) {
			level ="E";
		}
		else if (100<money) {
			level ="F";
		}
		return level;
	}
	public String findreward(){
		try {
			rewards=rewardManager.findreward();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String findrewardbyid(){
		try {
			//System.out.println(rid);
			reward=rewardManager.findById(reward.getRid());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String findrewardbyUid(){
		try {
			//System.out.println(Uid);
			//System.out.println(rewardManager.findrewardbyUid(Uid));
			rewards=rewardManager.findrewardbyUid(Uid);
			//System.out.println(rewards.get(0).getTitle());
			for (int i = 0; i < rewards.size(); i++) {
				//System.out.println(taskManager.findtaskbyRid(rewards.get(i).getRid()).get(0).getName());
				//System.out.println(taskManager.findtaskbyRid(rewards.get(i).getRid()).get(0).getName());
				for (int j = 0; j < taskManager.findtaskbyRid(rewards.get(i).getRid()).size(); j++) {
					if (!taskManager.findtaskbyRid(rewards.get(i).getRid()).get(j).equals(null)) {
						tasks.add(taskManager.findtaskbyRid(rewards.get(i).getRid()).get(j));
					}
					
				}
			}
			//System.out.println(tasks.get(0).getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
