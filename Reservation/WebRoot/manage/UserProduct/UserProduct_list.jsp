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
                    <h3>Course Management Page</h3>
                </div>
	             <div class="heading-right">
	                  <span class="icon icon-pencil"></span>
	              </div>
            </div>
        </div>
        
        <div class="decoration"></div>
        
        <div class="container no-bottom">
           <table cellspacing='0' class="table">
                <tr>
                    <th>User</th>
                    <th class="table-title">Course</th>
                    <th class="table-title">Operate</th>
                </tr>
                <s:iterator value="page.data" var="up" status="st"> 
                <tr>
                    <td><s:property value="#up.user.userName"/></td>
                    <td><s:property value="#up.product.proName"/></td>
                    <td>
                    	<a href="<%=basePath %>manage/UserProduct_detail.action?id=<s:property value="#up.id" />" class="no-bottom demo-button button-minimal yellow-minimal">&nbsp;Detail&nbsp;</a>
                   		<a href="<%=basePath %>manage/UserProduct_viewUpdate.action?id=<s:property value="#up.id" />" class="no-bottom demo-button button-minimal green-minimal">Updatre</a>
                   		<a href="<%=basePath %>manage/UserProduct_delete.action?id=<s:property value="#up.id" />" class="no-bottom demo-button button-minimal red-minimal">&nbsp;Delete&nbsp;</a>
                   	</td>
                </tr>
                </s:iterator>        
            </table>
        </div> 
        
        <div class="decoration"></div>
</div>

<jsp:include page="../../bottom.jsp" />
