package com.ofu.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.apache.struts2.json.annotations.JSON;

import com.ofu.dao.po.User;
import com.ofu.service.UserManager;
import com.opensymphony.xwork2.ActionSupport;

public class TestjsonAction extends ActionSupport{
    private static final long serialVersionUID = 1L;  
    
    //将会被Struts2序列化为JSON字符串的对象  
    private List<User> users;
    public TestjsonAction() {  
        //初始化Map对象  
    	users =new ArrayList<User>();  
    }  
	public List<User> getUsers() {
		return users;
	}
	public String findalluser(){
		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据  
		//users.clear();  
        User user = new User();  
        user.setName("JSONActionStruts2");  
        user.setPassword("123");
        User user1 = new User();  
        user1.setName("JSONActionStruts2");  
        user1.setPassword("123");
        users.add(user);
        users.add(user1);
        // 返回结果  
        return SUCCESS;  
	}
}
