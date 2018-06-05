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
        <a href="<%=basePath %>manage/Product/Product_add.jsp" class="no-bottom demo-button button-minimal yellow-minimal">Add a course</a>
           <table cellspacing='0' class="table">
                <tr>
                    <th>Name</th>
                    <th class="table-title">Credit</th>
                    <th class="table-title">Operate</th>
                </tr>
                <s:iterator value="page.data" var="pro" status="st">    
                <tr>
                    <td class="table-sub-title"><s:property value="#pro.proName"/></td>
                    <td><s:property value="#pro.proPrice"/></td>
                    <td>
                    	<a href="<%=basePath %>manage/Product_detail.action?id=<s:property value="#pro.id" />" class="no-bottom demo-button button-minimal yellow-minimal">&nbsp;Detail&nbsp;</a>
                   		<a href="<%=basePath %>manage/Product_viewUpdate.action?id=<s:property value="#pro.id" />" class="no-bottom demo-button button-minimal green-minimal">Updatre</a>
                   		<a href="<%=basePath %>manage/Product_delete.action?id=<s:property value="#pro.id" />" class="no-bottom demo-button button-minimal red-minimal">&nbsp;Delete&nbsp;</a>
                   	</td>
                </tr>
                </s:iterator>        
            </table>
        </div> 
        
        <div class="decoration"></div>
</div>

<jsp:include page="../../bottom.jsp" />


