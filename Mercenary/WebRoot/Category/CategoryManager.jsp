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
    
    <title>My JSP 'CategoryManager.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <script type="text/javascript"> 
		function show(){
      	if(document.getElementById("title").style.display=='none'){
                    document.getElementById("title").style.display='block';
        }else{
        	document.getElementById("title").style.display='none';
        }
        }

	</script>
  </head>
  
  <body>
	  <button onClick="show()">添加类别</button>
	  	<!-- 按标题查询 -->
	  	<div id="title" style="display:none">
	  		<s:form action="addcategory">
	    		<s:textfield name="category.name" label="类别名"/>
	    		<s:submit value="添加"/>
	    	</s:form>
	  	</div>
	  	<br>
	  	<br>
	  	<br>
	  <table border="1">
		  	<s:iterator value="categories" id="categories">
		   			<tr>
		   			<td><s:property value="#categories.Cid"/></td>
		   			<td><s:property value="#categories.name"/></td>
		   			<td><s:a action="deletecategorie">删除
		   				<s:param name="category.Cid" value="#categories.Cid"></s:param>
		   			</s:a></td>
		   			</tr>
		   	</s:iterator>
	  </table>   
  </body>
</html>
