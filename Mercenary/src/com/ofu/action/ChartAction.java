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
        //设置数据
        DefaultPieDataset data = new DefaultPieDataset();
        categories = categoryManager.findallcategory();
        for (int i = 0; i < categories.size(); i++) {
        	data.setValue(categories.get(i).getName()+":"+rewardManager.countreward(categories.get(i).getCid()).size(),rewardManager.countreward(categories.get(i).getCid()).size());
		}
        //生成JFreeChart对象
        chart = ChartFactory.createPieChart("各类别悬赏数", data, true,true, false);
        chart.getTitle().setFont(new Font("黑体",Font.BOLD,20));//设置标题字体
        PiePlot piePlot= (PiePlot) chart.getPlot();//获取图表区域对象
        piePlot.setLabelFont(new Font("黑体",Font.BOLD,10));
        chart.getLegend().setItemFont(new Font("黑体",Font.BOLD,10));
        
        return SUCCESS;
    }
}
