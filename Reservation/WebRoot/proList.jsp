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
						<em>course info list</em>
						<h3>Course Page</h3>
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
                    <th>Name</th>
                    <th class="table-title">Credit</th>
                    <th class="table-title">Operate</th>
                </tr>
                <s:iterator value="page.data" var="pro" status="st">    
                <tr>
                    <td class="table-sub-title"><s:property value="#pro.proName"/></td>
                    <td><s:property value="#pro.proPrice"/></td>
                    <td><a href="<%=basePath %>pro_detail.action?id=<s:property value="#pro.id" />" class="no-bottom demo-button button-minimal yellow-minimal">Detail</a></td>
                </tr>
                </s:iterator>        
            </table>
        </div> 

        <div class="decoration"></div>
</div>
<jsp:include page="bottom.jsp" />
