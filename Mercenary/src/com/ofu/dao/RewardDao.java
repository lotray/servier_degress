package com.ofu.dao;

import java.util.List;

import com.ofu.dao.po.Reward;



public interface RewardDao {
	//������������
	public List<Reward> findAllRewarys() throws Exception;
	//����query������
	public List<Reward> findList(String query) throws Exception;
	//public int count(String query) throws Exception;
	//����id��������
	public Reward findById(int id)throws Exception;
	//�������
	public void addreward(Reward category)throws Exception;
	//��������
	public void update(Reward Category)throws Exception;
	//ɾ������
	public void delete(Reward Category) throws Exception;
}
