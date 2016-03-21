<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
		<meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <title>登陆</title>
        <meta name="description" content="Custom Login Form Styling with CSS3" />
        <meta name="keywords" content="css3, login, form, custom, input, submit, button, html5, placeholder" />
        <link rel="stylesheet" type="text/css" href="assets/css/lanrenzhijia.css" />
		<script src="assets/js/modernizr.custom.63321.js"></script>
		<!--[if lte IE 7]><style>.main{display:none;} .support-note .note-ie{display:block;}</style><![endif]-->
    </head>
  
  <body>
  <div class="container">
			
			<header>
			</header>
			
			<section class="main">
			<!--  <s:form class="form-1" action="login" method ="post">
		    	<s:textfield name="user.id" label="佣兵编号"/>
		    	<s:textfield name="user.password" label="密码"/>
		    	<p class="submit">
						<button type="submit" name="submit"><i class="icon-arrow-right icon-large"></i></button>
					</p>
    			</s:form> -->
				<form class="form-1" action="login" method ="post">
					<p class="field">
						<input type="text" name="user.Uid" placeholder="佣兵ID">
						<i class="icon-user icon-large"></i>
					</p>
						<p class="field">
						    <input type="password" name="user.password" placeholder="密码">
							<i class="icon-lock icon-large"></i>
					</p>
					<p class="submit">
						<button type="submit" name="submit"><i class="icon-arrow-right icon-large"></i></button>
					</p>
				</form>
			</section>
        </div>
  </body>
</html>
