<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:set name="todayDay" value="new java.sql.Date(new java.util.Date().getTime()).toString()"/>
<s:set name="todayTime" value="new java.sql.Time(new java.util.Date().getTime()).toString()"/>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="title.jsp" />
<jsp:include page="banner.jsp" />
<div class="content">

	<div class="container no-bottom">
		<div class="heading">
			<div class="heading-left">
				<em>student info and enroll course info</em>
				<h3>Student Center</h3>			
			</div>
			<div class="heading-right">
				<span class="icon icon-user1"></span>
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
				<a href="<%=basePath %>user_viewUpdate.action?id=${user.id}" class="no-bottom demo-button button-minimal yellow-minimal">Update</a>
				<a href="<%=basePath %>logOff.action" class="no-bottom demo-button button-minimal red-minimal">Logout</a>
			</div>
		</div>
	</div>
	<div class="decoration"></div>

	<div class="container no-bottom">
		<h4 class="uppercase">Enroll Course info list</h4>
		<table cellspacing='0' class="table">
			<tr>
				<th>Course Info</th>
				<th class="table-title">Operate</th>
			</tr>
			<s:iterator value="user.userProduct" var="up" status="st">
				<tr>
					<td class="table-sub-title">
					<p>Name：<s:property value="#up.product.proName"/></p>
					<p>Times：<s:property value="#up.amount"/></p>
					<p>ClassTime：<s:property value="#up.product.proStartTime"/>&nbsp;&nbsp;—&nbsp;&nbsp;<s:property value="#up.product.proEndTime"/></p>
					<p>EnrollTime：<s:date name="#up.createTime" format="yyyy-MM-dd HH:mm:ss"/></p>
					<p>Hours：<s:property value="#up.hours"/></p>
					</td>
					<td>
					<s:if test="#todayDay == #up.lastDay">
						<p>Already Signed In</p>
					</s:if>
					<s:else>
						<s:if test="#todayTime >= #up.product.proStartTime && #todayTime <= #up.product.proEndTime">
							<a href='<%=basePath %>signIn.action?id=<s:property value="#up.id" />' class="no-bottom demo-button button-minimal yellow-minimal">sign in</a>
						</s:if>
						<s:else>
							<p>Not the time for Class</p>
						</s:else>
					</s:else>
					</td>
				</tr>
			</s:iterator>
		</table>
	</div>
	<a href="<%=basePath %>sct_list.action" class="no-bottom demo-button button-minimal yellow-minimal">Search The Enroll Cart</a>
	<div class="decoration"></div>
</div>
<jsp:include page="bottom.jsp" />