<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
				<em>course details</em>
				<h3>Details Page</h3>
			</div>
			<div class="heading-right">
				<span class="icon icon-pencil"></span>
			</div>
		</div>
	</div>

	<div class="decoration"></div>
	<div class="column no-bottom">
		<form action="addUserProduct.action" method="post">
	  	<input type="hidden" name="proId" value='<s:property value="product.id"/>'/>
	    <table>
	    	<tr>
	    		<td>Name:</td><td><s:property value="product.proName" /></td>
	    	</tr>
	    	<tr>
	    		<td>Credit:</td><td><s:property value="product.proPrice"/></td>
	    	</tr>
	    	<tr>
	    		<td>Number</td>
	    		<td>
    				<input type="text" name="amount" class="amount-input" value="1"/>
    				<button type="submit" class="amount-button">Confirm</button>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>Details:</td><td><s:property value="product.proIntro" escapeHtml="false"/></td>
	    	</tr>
	    	<tr>
	    		<td>Hours:</td><td><s:property value="product.proStartTime"/>&nbsp;&nbsp;—&nbsp;&nbsp;<s:property value="product.proEndTime"/></td>
	    	</tr>
	    </table>
	    </form>
	    <div class="text-center">
   	    	<a href="<%=basePath %>sct_add.action?id=<s:property value='product.id'/>" class="no-bottom demo-button button-minimal yellow-minimal">Enroll</a>
	    </div>
     </div>
	
	<div class="decoration"></div>
</div>

<jsp:include page="bottom.jsp" />