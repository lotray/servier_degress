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
    
    <title>My JSP 'SelectUser.jsp' starting page</title>
    
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
    <!-- 按标题查询 -->
  	<div id="title">
  		<s:form action="findUsersbyname">
    		<s:textfield name="key" label="按佣兵名查询："/>
    		<s:submit value="查询"/>
    	</s:form>
  	</div>
  	<table border="1">
  	<s:if test="key!=null">
  	<tr>
	    	<td>编号</td>
	    	<td>姓名</td>
	    	<td>等级</td>
   	</tr>
  	<s:iterator value="users" id="users">
   			<tr>
   			<td><s:property value="#users.Uid"/></td>
   			<td><s:property value="#users.name"/></td>
   			<td><s:property value="#users.level"/></td>
   			<td><s:a action="finduserinfo">详细信息
   				<s:param name="user.Uid" value="#users.Uid"/>
   			</s:a></td>
   			<td><s:a action="deleteUser">删除
   					<s:param name="user.Uid" value="#users.Uid"/>
   			</s:a></td>
   			</tr>
   		</s:iterator>
   		</s:if>
   		</table>
  </body>
</html>
