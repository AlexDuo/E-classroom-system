<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<jsp:include page="../../title.jsp" />
<jsp:include page="../manageBanner.jsp" />

<div class="content">
	<div class="container no-bottom">
            <div class="heading">
                <div class="heading-left">
                    <em>choose your button to operate</em>
                    <h3>User Product Detail Page</h3>
                </div>
	             <div class="heading-right">
	                  <span class="icon icon-pencil"></span>
	              </div>
            </div>
        </div>
        
        <div class="decoration"></div>
        
        <div class="container no-bottom">
		<div class="heading">
			<div class="heading-left margin-student">
				<h5>UserName：<s:property value="userProduct.user.userName" /></h5>
				<h5>CourseName：<s:property value="userProduct.product.proName"/></h5>
			</div>
			<div class="heading-left margin-student ">
				<h5>TimesOfEnroll：<s:property value="userProduct.amount"/></h5>
				<h5>Enroll Time：<s:date name="userProduct.createTime" format="yyyy-MM-dd HH:mm:ss"/></h5>
			</div>
			<div class="heading-left margin-student ">
				<h5>Hours：<s:property value="userProduct.hours"/></h5>
				<h5>Last Day：<s:property value="userProduct.lastDay"/></h5>
			</div>
		</div>
	</div>
	<div class="decoration"></div>
</div>

<jsp:include page="../../bottom.jsp" />
