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
                    <h3>Course Detail Page</h3>
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
				<h5>Course Name：<s:property value="product.proName" /></h5>
				<h5>Course Credit：<s:property value="product.proPrice"/></h5>
			</div>
			<div class="heading-left margin-student ">
				<h5>Course Details：<s:property value="product.proIntro" escapeHtml="false" /></h5>
				<h5>Class hours：<s:property value="product.proStartTime"/>&nbsp;—&nbsp;<s:property value="product.proEndTime"/></h5>
			</div>
		</div>
	</div>
	<div class="decoration"></div>
</div>

<jsp:include page="../../bottom.jsp" />
