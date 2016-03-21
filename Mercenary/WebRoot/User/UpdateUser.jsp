s<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
  	  <s:form action="updateUser?user.Uid=%{user.Uid}">
    	<s:textfield name="user.name" label="用户名字"/>
    	<s:textfield name="user.tel" label="电话"/>
    	<s:textfield name="user.password" label="mima"/>
    	<s:textfield name="user.level" label="等级"/>
    	<s:textfield name="user.money" label="金钱"/>
    	<s:submit value="修改">
    	</s:submit>
    </s:form>
   	</body>
</html>