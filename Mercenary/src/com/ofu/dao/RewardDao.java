package com.ofu.dao;

import java.util.List;

import com.ofu.dao.po.Reward;



public interface RewardDao {
	//查找所有悬赏
	public List<Reward> findAllRewarys() throws Exception;
	//根据query找悬赏
	public List<Reward> findList(String query) throws Exception;
	//public int count(String query) throws Exception;
	//根据id查找悬赏
	public Reward findById(int id)throws Exception;
	//添加悬赏
	public void addreward(Reward category)throws Exception;
	//更新悬赏
	public void update(Reward Category)throws Exception;
	//删除悬赏
	public void delete(Reward Category) throws Exception;
}
