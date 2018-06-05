<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!--Declare page as mobile friendly --> 
<meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0"/>
<!-- Declare page as iDevice WebApp friendly -->
<meta name="apple-mobile-web-app-capable" content="yes"/>
<!-- iDevice WebApp Splash Screen, Regular Icon, iPhone, iPad, iPod Retina Icons -->
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=basePath %>images/splash/splash-icon.png"> 
<!-- iPhone 3, 3Gs -->
<link rel="apple-touch-startup-image" href="<%=basePath %>images/splash/splash-screen.png" 			media="screen and (max-device-width: 320px)" /> 
<!-- iPhone 4 -->
<link rel="apple-touch-startup-image" href="<%=basePath %>images/splash/splash-screen_402x.png" 		media="(max-device-width: 480px) and (-webkit-min-device-pixel-ratio: 2)" /> 
<!-- iPhone 5 -->
<link rel="apple-touch-startup-image" sizes="640x1096" href="<%=basePath %>images/splash/splash-screen_403x.png" />

<!-- Stylesheet Load -->
<link href="<%=basePath %>styles/style.css"				rel="stylesheet" type="text/css">
<link href="<%=basePath %>styles/framework-style.css" 	rel="stylesheet" type="text/css">
<link href="<%=basePath %>styles/framework.css" 			rel="stylesheet" type="text/css">
<link href="<%=basePath %>styles/bxslider.css"			rel="stylesheet" type="text/css">
<link href="<%=basePath %>styles/swipebox.css"			rel="stylesheet" type="text/css">
<link href="<%=basePath %>styles/icons.css"				rel="stylesheet" type="text/css">
<link href="<%=basePath %>styles/retina.css" 				rel="stylesheet" type="text/css" media="only screen and (-webkit-min-device-pixel-ratio: 2)" />


<!--Page Scripts Load -->
<script src="<%=basePath %>scripts/jquery.min.js"		type="text/javascript"></script>	
<script src="<%=basePath %>scripts/hammer.js"			type="text/javascript"></script>	
<script src="<%=basePath %>scripts/jquery-ui-min.js"  type="text/javascript"></script>
<script src="<%=basePath %>scripts/subscribe.js"		type="text/javascript"></script>
<script src="<%=basePath %>scripts/contact.js"		type="text/javascript"></script>
<script src="<%=basePath %>scripts/jquery.swipebox.js" type="text/javascript"></script>
<script src="<%=basePath %>scripts/bxslider.js"		type="text/javascript"></script>
<script src="<%=basePath %>scripts/retina.js"			type="text/javascript"></script>
<script src="<%=basePath %>scripts/custom.js"			type="text/javascript"></script>
<script src="<%=basePath %>scripts/framework.js"		type="text/javascript"></script>

<!-- Page Title -->
<title> E-Classroom System </title>
</head>
<body>
<div id="preloader">
	<div id="status">
    	<p class="center-text">
			Loading the content...
            <em>Loading depends on your connection speed!</em>
        </p>
    </div>
</div>