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
    
    //���ᱻStruts2���л�ΪJSON�ַ����Ķ���  
    private List<User> users;
    public TestjsonAction() {  
        //��ʼ��Map����  
    	users =new ArrayList<User>();  
    }  
	public List<User> getUsers() {
		return users;
	}
	public String findalluser(){
		// dataMap�е����ݽ��ᱻStruts2ת����JSON�ַ�������������Ҫ��������е�����  
		//users.clear();  
        User user = new User();  
        user.setName("JSONActionStruts2");  
        user.setPassword("123");
        User user1 = new User();  
        user1.setName("JSONActionStruts2");  
        user1.setPassword("123");
        users.add(user);
        users.add(user1);
        // ���ؽ��  
        return SUCCESS;  
	}
}
