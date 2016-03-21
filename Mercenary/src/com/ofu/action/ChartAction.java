package com.ofu.action;

import java.awt.Font;
import java.util.List;

import javax.annotation.Resource;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import com.ofu.dao.po.Category;
import com.ofu.dao.po.Reward;
import com.ofu.service.CategoryManager;
import com.ofu.service.RewardManager;
import com.opensymphony.xwork2.ActionSupport;

public class ChartAction extends ActionSupport{
	private JFreeChart chart;
	@Resource private RewardManager rewardManager;
	@Resource private CategoryManager categoryManager;
	private List<Category> categories;
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public JFreeChart getChart() {
		return chart;
	}
	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}
	public RewardManager getRewardManager() {
		return rewardManager;
	}
	public void setRewardManager(RewardManager rewardManager) {
		this.rewardManager = rewardManager;
	}
	public CategoryManager getCategoryManager() {
		return categoryManager;
	}
	public void setCategoryManager(CategoryManager categoryManager) {
		this.categoryManager = categoryManager;
	}
	public String execute() throws Exception {
        //��������
        DefaultPieDataset data = new DefaultPieDataset();
        categories = categoryManager.findallcategory();
        for (int i = 0; i < categories.size(); i++) {
        	data.setValue(categories.get(i).getName()+":"+rewardManager.countreward(categories.get(i).getCid()).size(),rewardManager.countreward(categories.get(i).getCid()).size());
		}
        //����JFreeChart����
        chart = ChartFactory.createPieChart("�����������", data, true,true, false);
        chart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
        PiePlot piePlot= (PiePlot) chart.getPlot();//��ȡͼ���������
        piePlot.setLabelFont(new Font("����",Font.BOLD,10));
        chart.getLegend().setItemFont(new Font("����",Font.BOLD,10));
        
        return SUCCESS;
    }
}
