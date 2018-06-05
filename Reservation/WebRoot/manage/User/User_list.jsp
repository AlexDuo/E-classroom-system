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
                    <h3>User Management Page</h3>
                </div>
	             <div class="heading-right">
	                  <span class="icon icon-pencil"></span>
	              </div>
            </div>
        </div>
        
        <div class="decoration"></div>
        
        <div class="container no-bottom">
        <a href="<%=basePath %>manage/User/User_add.jsp" class="no-bottom demo-button button-minimal yellow-minimal">Add Users(Students)</a>
           <table cellspacing='0' class="table">
                <tr>
                    <th class="table-title">Name</th>
                    <th class="table-title">Regist Time</th>
                    <th class="table-title">Operate</th>
                </tr>
                <s:iterator value="page.data" var="user" status="st">
                <tr>
                    <td class="table-sub-title"><s:property value="#user.userName"/></td>
                    <td><s:date name="#user.regTime" format="yyyy-MM-dd HH:mm:ss"/></td>
                    <td>
                    	<a href="<%=basePath %>manage/User_detail.action?id=<s:property value="#user.id" />" class="no-bottom demo-button button-minimal yellow-minimal">&nbsp;Detail&nbsp;</a>
                   		<a href="<%=basePath %>manage/User_viewUpdate.action?id=<s:property value="#user.id" />" class="no-bottom demo-button button-minimal green-minimal">Updatre</a>
                   		<a href="<%=basePath %>manage/User_delete.action?id=<s:property value="#user.id" />" class="no-bottom demo-button button-minimal red-minimal">&nbsp;Delete&nbsp;</a>
                   	</td>
                </tr>
                </s:iterator>        
            </table>
        </div> 
        
        <div class="decoration"></div>
</div>

<jsp:include page="../../bottom.jsp" />


