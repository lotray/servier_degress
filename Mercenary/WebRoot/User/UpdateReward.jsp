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
    
    <title>My JSP 'UpdateReward.jsp' starting page</title>
    
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
  	  <s:form action="updateReward?reward.Rid=%{reward.Rid}">
    	<s:textfield name="reward.title" label="电话"/>
    	<s:hidden name="reward.starttime"/>
    	<s:hidden name="reward.endtime"/>
    	<s:textfield name="time"  label="等级">
    		<s:param name="value"><s:date name="reward.starttime" format="yyyy/MM/dd"/></s:param>
    	</s:textfield>
    	<s:textfield name="time1" label="等级" >
    		<s:param name="value"><s:date name="reward.endtime" format="yyyy/MM/dd"/></s:param>
    	</s:textfield>
    	<s:textfield name="reward.level" label="等级"/>
    	<s:textfield name="reward.money" label="金钱"/>
    	<s:textfield name="reward.content" label="内容"/>
    	<s:textfield name="reward.category" label="悬赏"/>
    	<s:textfield name="reward.RUid" label="接收人id"/>
    	<s:submit value="修改">
    	</s:submit>
    </s:form>
  </body>
</html>
