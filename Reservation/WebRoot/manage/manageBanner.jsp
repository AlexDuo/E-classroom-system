<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="header">
    <a class="logo-home" href="<%=basePath %>index.jsp"><img src="<%=basePath %>images/logob.png" alt="img" width="40"></a>
    <div class="header-text">
        <strong>Manager Control System(MCS)</strong>
    </div>
</div>
<div class="header-clear"></div>
<a href="<%=basePath %>manage/User_list.action" class="content-tab tab-one">User</a>
<a href="<%=basePath %>manage/Product_list.action" class="content-tab tab-two">Course</a>
<a href="<%=basePath %>manage/UserProduct_list.action" class="content-tab tab-three">S&O</a>
<div class="decoration"></div>