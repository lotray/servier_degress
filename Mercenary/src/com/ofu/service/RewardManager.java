package com.ofu.service;

import java.util.List;

import com.ofu.dao.po.Category;
import com.ofu.dao.po.Reward;

public interface RewardManager {
	public void addReward(Reward reward) throws Exception;
	//��ѯ�����û�
	public List<Reward> findallreward() throws Exception;
	//����id�����û�
	public Reward findById(int id)throws Exception;
	//�����û���Ϣ
	public void update(Reward reward)throws Exception;
	//ɾ���û�
	public void delete(int id) throws Exception;
	//��������������
	public List<Reward> findbycategory(String category) throws Exception;
	//��������������
	public List<Reward> findreward() throws Exception;
	//��������������
	public List<Reward> findrewardbyUid(int Uid) throws Exception;
	//����ʱ��β�������
	public List<Reward> findrewardbytime(String stime,String etime) throws Exception;
	//��������������
	public List<Reward> findrewardbytitle(String title) throws Exception;
	//�������ͳ������
	public List countreward(int id) throws Exception;
}
