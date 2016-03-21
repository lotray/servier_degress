<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'UpdateTsak.jsp' starting page</title>
    
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
     <p>详细信息</p>
  	  <s:form action="updateTask1?task.Tid=%{task.Tid}">
  	  	<s:hidden name="key"/>
    	<s:textfield name="task.name" label="标题"/>
    	<s:textfield name="task.Rid" label="悬赏ID"/>
    	<s:textfield name="task.Uid" label="任务结束人"/>
    	<s:textfield name="task.State" label="状态"/>
    	<s:submit value="修改">
    	</s:submit>
    </s:form>
  </body>
</html>
