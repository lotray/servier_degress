<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Selectrewards.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
  	<p>佣兵详细信息</p>
    <table border="1">
    		<tr>
	    	<td>编号</td>
	    	<td>姓名</td>
	    	<td>等级</td>
	    	<td>电话</td>
	    	<td>金额</td>
   		 	</tr>
   			<tr>
   			<td><s:property value="user.Uid"/></td>
   			<td><s:property value="user.name"/></td>
   			<td><s:property value="user.level"/></td>
   			<td><s:property value="user.tel"/></td>
   			<td><s:property value="user.money"/></td>
   			<td><s:a action="jumpUser">修改
   					<s:param name="user.Uid" value="user.Uid"/>
   			</s:a></td>
   			</tr>
   	</table>
   	<br>
   	<br>
   	<br>
   	<p>发布悬赏信息</p>
    <!-- 按标题查询 -->
  	<table border="1">
  		<tr>
	    	<td>编号</td>
	    	<td>标题</td>
	    	<td>开始时间</td>
	    	<td>结束时间</td>
	    	<td>等级</td>
	    	<td>悬赏金额</td>
	    	<td>悬赏内容</td>
	    	<td>悬赏类别</td>
	    	<td>悬赏人</td>
   		 </tr>
  		<s:iterator value="rewards" id="rewards">
   			<tr>
   			<td><s:property value="#rewards.Rid"/></td>
   			<td><s:property value="#rewards.title"/></td>
   			<td><s:date name="#rewards.starttime" format="yyyy/MM/dd"/></td>
   			<td><s:date name="#rewards.endtime" format="yyyy/MM/dd"/></td>
   			<td><s:property value="#rewards.level"/></td>
   			<td><s:property value="#rewards.money"/></td>
   			<td><s:property value="#rewards.content"/></td>
   			<td><s:property value="#rewards.category"/></td>
   			<td><s:property value="#rewards.RUid"/></td>
   			<td><s:a action="jumpReward">修改
   					<s:param name="reward.Rid" value="#rewards.Rid"/>
   			</s:a></td>
   			<td><s:a action="deleteReward">删除
   					<s:param name="reward.Rid" value="#rewards.Rid"/>
   			</s:a></td>
   			</tr>
   		</s:iterator>
   	</table>
   	<br>
   	<br>
   	<br>
   	<!-- 按标题查询 -->
   	<p>接受任务信息</p>
  	<table border="1">
  		<tr>
	    	<td>编号</td>
	    	<td>标题</td>
	    	<td>悬赏ID</td>
	    	<td>任务结束人</td>
	    	<td>状态</td>
   		 </tr>
  		<s:iterator value="tasks" id="tasks">
   			<tr>
   			<td><s:property value="#tasks.Tid"/></td>
   			<td><s:property value="#tasks.name"/></td>
   			<td><s:property value="#tasks.Rid"/></td>
   			<td><s:property value="#tasks.Uid"/></td>
   			<td><s:property value="#tasks.State"/></td>
   			<td><s:a action="jumpTask">修改
   					<s:param name="task.Tid" value="#tasks.Tid"/>
   			</s:a></td>
   			<td><s:a action="deleteTask">删除
   					<s:param name="task.Tid" value="#tasks.Tid"/>
   			</s:a></td>
   			</tr>
   		</s:iterator>
   		</table>
  </body>
</html>
