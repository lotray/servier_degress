package com.ofu.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ofu.dao.RewardDao;
import com.ofu.dao.po.Reward;
import com.ofu.service.RewardManager;
@Transactional(readOnly=false)
public class RewardManagerimpl implements RewardManager{
	private RewardDao rewardDao;
	public RewardDao getRewardDao() {
		return rewardDao;
	}
	public void setRewardDao(RewardDao rewardDao) {
		this.rewardDao = rewardDao;
	}
	public void addReward(Reward reward) throws Exception {
		// TODO Auto-generated method stub
		rewardDao.addreward(reward);
	}
	public List<Reward> findallreward() throws Exception {
		// TODO Auto-generated method stub
		return rewardDao.findAllRewarys();
	}
	public Reward findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return rewardDao.findById(id);
	}
	public void update(Reward reward) throws Exception {
		// TODO Auto-generated method stub
		rewardDao.update(reward);
	}
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		rewardDao.delete(rewardDao.findById(id));
	}
	public List<Reward> findbycategory(String category) throws Exception {
		// TODO Auto-generated method stub
		String queryString ="from Reward r where r.category like '"+category+"'";
		return rewardDao.findList(queryString);
	}
	public List<Reward> findreward() throws Exception {
		// TODO Auto-generated method stub
		String queryString ="from Reward r order by r.money desc,r.level desc";
		return rewardDao.findList(queryString);
	}
	public List<Reward> findrewardbyUid(int Uid) throws Exception {
		// TODO Auto-generated method stub
		String queryString ="from Reward r where r.RUid= '"+Uid+"'";
		return rewardDao.findList(queryString);
	}
	public List<Reward> findrewardbytime(String stime, String etime)
			throws Exception {
		String queryString ="from Reward r where r.starttime between '"+stime+"' and '"+etime+"'";
		return rewardDao.findList(queryString);
	}
	public List<Reward> findrewardbytitle(String title) throws Exception {
		String queryString ="from Reward r where r.title like '%"+title+"%'";
		return rewardDao.findList(queryString);
	}
	public List countreward(int id) throws Exception {
		// TODO Auto-generated method stub
		String queryString ="from Reward r where r.category = '"+id+"'";
		return rewardDao.findList(queryString);
	}
}
