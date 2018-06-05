<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="../title.jsp" />
<jsp:include page="manageBanner.jsp" />

<div class="content">
	<div class="container no-bottom">
            <div class="heading">
                <div class="heading-left">
                    <em>choose your button to operate</em>
                    <h3>Manager Index Page</h3>
                </div>
                <div class="heading-right">
				<span class="icon icon-user1"></span>
			</div>
            </div>
        </div>
        
        <div class="decoration"></div>
</div>

<jsp:include page="../bottom.jsp" />
