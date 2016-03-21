package com.ofu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.ofu.dao.TaskDao;
import com.ofu.dao.po.Task;
import com.ofu.dao.po.User;

public class TaskDaoimpl implements TaskDao{
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public Task findById(int id) throws Exception {
		//根据id查任务
		return hibernateTemplate.get(Task.class, id);
	}
	public void update(Task task) throws Exception {
		//更新任务
		hibernateTemplate.update(task);
	}
	public void delete(Task task) throws Exception {
		//删除任务
		hibernateTemplate.delete(task);
	}
	public void addtask(Task task) throws Exception {
		//添加任务
		hibernateTemplate.save(task);
	}
	public List<Task> findList(String query) throws Exception {
		// TODO Auto-generated method stub
		return (List<Task>) hibernateTemplate.find(query);
	}
}
