package com.ofu.dao.po;

import java.sql.Date;

public class Reward {
	private int Rid;//���
	private String title;//����
	private Date starttime;//��ʼʱ��
	private Date endtime;//����ʱ��
	private String level;//�ȼ�
	private float money;//���ͽ��
	private String type;//���ͷ�ʽ
	private String content;//��������
	private String category;//�������
	private String RUid;//������
	public String getRUid() {
		return RUid;
	}
	public void setRUid(String rUid) {
		RUid = rUid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getRid() {
		return Rid;
	}
	public void setRid(int rid) {
		Rid = rid;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
