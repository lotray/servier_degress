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
    
    <title>My JSP 'SelectTask.jsp' starting page</title>
    
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
  		<s:form action="findtaskbytitle">
    		<s:textfield name="task.name" label="标题关键字查询"/>
    		<s:submit value="查询"/>
    	</s:form>
  </body>
    	<table border="1">
  	<s:if test="key1==true">
  	<tr>
	    	<td>编号</td>
	    	<td>姓名</td>
	    	<td>悬赏ID</td>
	    	<td>接受人ID</td>
	    	<td>状态</td>
   	</tr>
  	<s:iterator value="tasks" id="tasks">
   			<tr>
   			<td><s:property value="#tasks.Uid"/></td>
   			<td><s:property value="#tasks.name"/></td>
   			<td><s:property value="#tasks.Rid"/></td>
   			<td><s:property value="#tasks.Uid"/></td>
   			<td><s:property value="#tasks.State"/></td>
   			<td><s:a action="jumpTask1">修改
   					<s:param name="task.Tid" value="#tasks.Tid"/>
   					<s:param name="key" value="key"/>
   			</s:a></td>
   			<td><s:a action="deleteTask1">删除
   					<s:param name="task.Tid" value="#tasks.Tid"/>
   					<s:param name="key" value="key"/>
   			</s:a></td>
   			</tr>
   	</s:iterator>
   		</s:if>
   	</table>
</html>
