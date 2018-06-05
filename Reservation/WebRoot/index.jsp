<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="title.jsp" />

<div class="content">

	<div class="landing-logo">
    	<img class="replace-2x" src="<%=basePath %>images/logo.png" alt="img" width="100" />
    </div>
    
    <div class="welcome-text">
    	<h3>Welcome to E-Classroom System</h3>
        <p></p>    
    </div>
    
    <div class="navigation-icons">
    	<a href="<%=basePath %>pro_list.action" class="nav-icon icon-red home-nav"></a>
    	<a href="<%=basePath %>user_info.action" class="nav-icon icon-green video-nav"></a>
        <a href="<%=basePath %>register.jsp" class="nav-icon icon-magenta blog-nav"></a>   
        <a href="<%=basePath %>manage/" class="nav-icon icon-blue about-nav"></a>
    </div>
    
</div>
<jsp:include page="bottom.jsp" />


