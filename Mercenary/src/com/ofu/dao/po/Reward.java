package com.ofu.dao.po;

import java.sql.Date;

public class Reward {
	private int Rid;//编号
	private String title;//标题
	private Date starttime;//开始时间
	private Date endtime;//结束时间
	private String level;//等级
	private float money;//悬赏金额
	private String type;//悬赏方式
	private String content;//悬赏内容
	private String category;//悬赏类别
	private String RUid;//悬赏人
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
