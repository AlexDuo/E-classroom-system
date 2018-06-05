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
                    <h3>User Detail Page</h3>
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
				<h5>UserName：<s:property value="user.userName" /></h5>
				<h5>PassWord：<s:property value="user.password"/></h5>
			</div>
			<div class="heading-left margin-student ">
				<h5>Mobile：<s:property value="user.phone"/></h5>
				<h5>E-mail：<s:property value="user.email"/></h5>
			</div>
			<div class="heading-left margin-student">
				<h5>Address：<s:property value="user.addr"/></h5>
				<h5>Regist Time：<s:date name="user.regTime" format="yyyy-MM-dd HH:mm:ss"/></h5>
			</div>
			<div class="heading-left margin-student">
				<h5>Condition：<s:if test="user.status==1">Activate</s:if><s:else>Deactivate</s:else></h5>
			</div>
		</div>
	</div>
	<div class="decoration"></div>
                
</div>

<jsp:include page="../../bottom.jsp" />


