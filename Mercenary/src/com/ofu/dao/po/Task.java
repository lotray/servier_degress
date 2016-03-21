package com.ofu.dao.po;

public class Task {
	private int Tid;
	private String name;
	private String Rid;
	private String Uid;
	private String State;
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {  
		Tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRid() {
		return Rid;
	}
	public void setRid(String rid) {
		Rid = rid;
	}
	public String getUid() {
		return Uid;
	}
	public void setUid(String uid) {
		Uid = uid;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
}
