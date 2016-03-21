<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Simpla Admin</title>
<link rel="stylesheet" href="resources/css/reset.css" type="text/css" media="screen" />
<link rel="stylesheet" href="resources/css/style.css" type="text/css" media="screen" />
<link rel="stylesheet" href="resources/css/invalid.css" type="text/css" media="screen" />	
<script type="text/javascript" src="resources/scripts/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="resources/scripts/simpla.jquery.configuration.js"></script>
<script type="text/javascript" src="resources/scripts/facebox.js"></script>
<script type="text/javascript" src="resources/scripts/jquery.wysiwyg.js"></script>
<script type="text/javascript" src="resources/scripts/jquery.datePicker.js"></script>
<script type="text/javascript" src="resources/scripts/jquery.date.js"></script>
</head>
<body id="main">
<div id="sidebar"><div id="sidebar-wrapper"> <!-- Sidebar with logo and menu -->
			
			<h1 id="sidebar-title"><a href="#">Simpla</a></h1>
		  
			<!-- Logo (221px wide) -->
			<a href="#"><img id="logo" src="resources/images/logo.png" alt="Simpla Admin logo" /></a>
		  
			<!-- Sidebar Profile links -->
			<div id="profile-links">
				您好, <a href="#" title="修改个人信息">username</a>, 你有 <a href="#messages" rel="modal" title="您有新信息">3 条信息</a><br />
				<br />
				<a href="#" title="登出">注销登录</a>
			</div>        
			
			<ul id="main-nav">  <!-- 手风琴菜单 -->
				
				<li>
					<a href="JFreeChartAction" class="nav-top-item no-submenu" target="iframe"> <!-- 加入no-submenu类可以取消子菜单 -->
						首页
					</a>       
				</li>
				
				<li>
					<a href="#" class="nav-top-item">
						佣兵管理
					</a>
					<ul>
						<li><a href="User/SelectUser.jsp" target="iframe">佣兵管理</a></li>
					</ul>
				</li>
				
				<li>
					<a href="#" class="nav-top-item">
						悬赏管理
					</a>
					<ul>
						<li><a href="Xuanshang/SelectXuanshang.jsp" target="iframe">悬赏管理</a></li>
					</ul>
				</li>
				
				<li>
					<a href="#" class="nav-top-item">
						任务管理
					</a>
					<ul>
						<li><a href="Task/SelectTask.jsp" target="iframe">任务管理</a></li>
					</ul>
				</li>
				<li>
					<a href="#" class="nav-top-item">
						类别管理
					</a>
					<ul>
						<li><a href="findallcategory1" target="iframe">类别管理</a></li>
					</ul>
				</li>
                <li>
					<a href="#" class="nav-top-item">
						操作日志
					</a>
					<ul>
						<li><a href="http://www.baidu.com" target="iframe">查询日志</a></li>
					</ul>
				</li>       
			</ul> <!-- End #main-nav -->
			
			<div id="messages" style="display: none"> <!-- Messages are shown when a link with these attributes are clicked: href="#messages" rel="modal"  -->
				
				<h3>3 Messages</h3>
			 
				<p>
					<strong>17th May 2009</strong> by Admin<br />
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus magna. Cras in mi at felis aliquet congue.
					<small><a href="#" class="remove-link" title="Remove message">Remove</a></small>
				</p>
			 
				<p>
					<strong>2nd May 2009</strong> by Jane Doe<br />
					Ut a est eget ligula molestie gravida. Curabitur massa. Donec eleifend, libero at sagittis mollis, tellus est malesuada tellus, at luctus turpis elit sit amet quam. Vivamus pretium ornare est.
					<small><a href="#" class="remove-link" title="Remove message">Remove</a></small>
				</p>
			 
				<p>
					<strong>25th April 2009</strong> by Admin<br />
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus magna. Cras in mi at felis aliquet congue.
					<small><a href="#" class="remove-link" title="Remove message">Remove</a></small>
				</p>
				
				<form action="#" method="post">
					
					<h4>New Message</h4>
					
					<fieldset>
						<textarea class="textarea" name="textfield" cols="79" rows="5"></textarea>
					</fieldset>
					
					<fieldset>
					
						<select name="dropdown" class="small-input">
							<option value="option1">Send to...</option>
							<option value="option2">Everyone</option>
							<option value="option3">Admin</option>
							<option value="option4">Jane Doe</option>
						</select>
						
						<input class="button" type="submit" value="Send" />
						
					</fieldset>
					
				</form>
				
			</div> <!-- End #messages -->
			
		</div></div> <!-- End #sidebar -->
		
        <div id="main-content">
        	<iframe name="iframe" class="iframe" src="JFreeChartAction" scrolling="no"></iframe>
            <div id="footer">
            	<small> <!-- Remove this notice or replace it with whatever you want -->
						&#169; apiao copy by simpla admin   <a href="#">回到顶部</a>
				</small>
            </div>
        </div>
    </div>
</body>
</html>