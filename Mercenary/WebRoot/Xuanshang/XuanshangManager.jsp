<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
    <table border="1">
    <tr>
    	<td>用户ID</td>
    	<td>用户姓名</td>
    	<td>用户等级</td>
    	<td>发布信息</td>
    	<td>悬赏金额</td>
    </tr>
    	<s:iterator value="checks2" id="checks2">
   			<tr>
   			<td><s:property value="#checks2.Uid"/></td>
   			<td><s:date name="#checks2.Ctime"/></td>
   			<td><s:property value="#checks2.Pesition"/></td>
   			<td><s:date name="#checks2.Ctime"/></td>
   			<td><s:property value="#checks2.Pesition"/></td>
   			<td><s:a action>编辑</s:a></td>
   			<td><s:a action>删除</s:a></td>
   			</tr>
   		</s:iterator>
   		</table>
  </body>
</html>
