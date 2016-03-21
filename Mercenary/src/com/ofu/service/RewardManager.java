package com.ofu.service;

import java.util.List;

import com.ofu.dao.po.Category;
import com.ofu.dao.po.Reward;

public interface RewardManager {
	public void addReward(Reward reward) throws Exception;
	//查询所有用户
	public List<Reward> findallreward() throws Exception;
	//根据id查找用户
	public Reward findById(int id)throws Exception;
	//更新用户信息
	public void update(Reward reward)throws Exception;
	//删除用户
	public void delete(int id) throws Exception;
	//根据类别查找悬赏
	public List<Reward> findbycategory(String category) throws Exception;
	//根据类别查找悬赏
	public List<Reward> findreward() throws Exception;
	//根据类别查找悬赏
	public List<Reward> findrewardbyUid(int Uid) throws Exception;
	//根据时间段查找悬赏
	public List<Reward> findrewardbytime(String stime,String etime) throws Exception;
	//根据类别查找悬赏
	public List<Reward> findrewardbytitle(String title) throws Exception;
	//根据类别统计悬赏
	public List countreward(int id) throws Exception;
}
