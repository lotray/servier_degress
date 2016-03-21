package com.ofu.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.json.annotations.JSON;

import com.ofu.dao.po.User;
import com.ofu.service.UserManager;
import com.opensymphony.xwork2.ActionSupport;

public class AppUserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private int Uid;
	private User user;

	private String password;
	private Map<String, Object> dataMap;
	@Resource private UserManager userManager;
    public AppUserAction() {  
        //初始化Map对象  
    	dataMap = new HashMap<String, Object>();  
    }
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserManager getUserManager() {
		return userManager;
	}
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String applogin() {
		try {
//			System.out.println(userManager.findById(Uid).getPassword());
			dataMap.clear();
			if (password.equals(userManager.findById(Uid).getPassword())) {
				dataMap.put("message","1");
			}else {
				dataMap.put("message","0");
			}
		} catch (Exception e) {
			e.printStackTrace();
			dataMap.put("message","0");
		}
		return SUCCESS;
	}
	public String finduserbyid() throws Exception{
		user=userManager.findById(Uid);
		return SUCCESS;
	}
	public String appadduser(){
		dataMap.clear();
		try {	
			String name = new String(user.getName().getBytes("ISO8859-1"),"UTF-8");
			user.setName(name);
			user.setLevel("F");
			System.out.println(user.getName());
			userManager.addUser(user);
			dataMap.put("message",userManager.findbyname(user.getName()).get(0).getUid());
		} catch (Exception e) {
			// TODO: handle exception
			dataMap.put("message","0");
		}
		return SUCCESS;
	}

}
