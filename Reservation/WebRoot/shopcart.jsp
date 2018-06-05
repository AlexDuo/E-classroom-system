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
						<em>course Enrollment Cart</em>
						<h3>Cart Page</h3>
					</div>
					<div class="heading-right">
						<span class="icon icon-pencil"></span>
					</div>
				</div>
			</div>
		
		<div class="decoration"></div>
        <div class="container no-bottom">
           <h4 class="uppercase">Course info list</h4>
           <table cellspacing='0' class="table">
                <tr>
                    <th>Course</th>
                    <th class="table-title">Credit</th>
                    <th class="table-title">Operate</th>
                </tr>
                <s:iterator value="data" var="pro" status="st">
                <tr>
                    <td class="table-sub-title"><s:property value="#pro.proName"/></td>
                    <td><s:property value="#pro.proPrice"/></td>
                    <td>
                    	<a href="<%=basePath %>sct_delete.action?id=<s:property value="#pro.id" />" class="no-bottom demo-button button-minimal red-minimal">Drop</a>
                    	<a href="<%=basePath %>sct_clear.action?id=<s:property value="#pro.id" />" class="no-bottom demo-button button-minimal green-minimal">Enroll</a>
                    </td>
                </tr>
                </s:iterator>        
            </table>
        </div> 
		<a href="<%=basePath %>pro_list.action" class="no-bottom demo-button button-minimal yellow-minimal">Course List</a>
		<a href="<%=basePath %>user_info.action" class="no-bottom demo-button button-minimal yellow-minimal">Student Center</a>
        <div class="decoration"></div>
        
</div>
<jsp:include page="bottom.jsp" />
