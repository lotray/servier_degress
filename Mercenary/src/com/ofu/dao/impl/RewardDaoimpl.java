package com.ofu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.ofu.dao.RewardDao;
import com.ofu.dao.po.Reward;


public class RewardDaoimpl implements RewardDao{
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public List<Reward> findAllRewarys() throws Exception {
		// 查找所有悬赏
		String queryString ="from Reward";
		return (List<Reward>) hibernateTemplate.find(queryString);
	}
	public Reward findById(int id) throws Exception {
		//根据id查找悬赏
		return hibernateTemplate.get(Reward.class,id);
	}
	public void update(Reward reward) throws Exception {
		//更新悬赏
		hibernateTemplate.update(reward);
	}
	public void delete(Reward reward) throws Exception {
		//删除悬赏
		hibernateTemplate.delete(reward);
	}
	public void addreward(Reward reward) throws Exception {
		//添加悬赏
		hibernateTemplate.save(reward);
	}
	public List<Reward> findList(String query) throws Exception {
		// TODO Auto-generated method stu
		return (List<Reward>) hibernateTemplate.find(query);
	}
}
