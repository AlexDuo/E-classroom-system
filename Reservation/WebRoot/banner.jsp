<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="header">
    <a class="logo-home" href="<%=basePath %>index.jsp"><img src="images/logob.png" alt="img" width="40"></a>
    <div class="header-text">
        <strong>E-Classroom</strong>
    </div>
</div>
<div class="header-clear"></div>