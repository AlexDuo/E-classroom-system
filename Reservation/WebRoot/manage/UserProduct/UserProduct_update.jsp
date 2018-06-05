<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
                    <h3>User Product Update Page</h3>
                </div>
	             <div class="heading-right">
	                  <span class="icon icon-pencil"></span>
	              </div>
            </div>
        </div>
        
        <div class="decoration"></div>
	<div class="container no-bottom">
		<div class="contact-form no-bottom form-center">

			<form action="manage/UserProduct_update.action" method="post">
			<input type="hidden" name="userProduct.id" value='<s:property value="userProduct.id"/>' />
				<fieldset>
					<div class="formFieldWrap">
						<label class="field-title contactNameField">UserName:</label>
						<p><s:property value="userProduct.user.userName"/></p>
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactEmailField">CourseName: </label>
						<p><s:property value="userProduct.product.proName"/></p>
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactEmailField">TimesOfEnroll: </label>
						<input type="number" name="userProduct.amount" value="<s:property value="userProduct.amount"/>" class="contactField" >
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactNameField">Enroll Time:</label>
						<p><s:date name="userProduct.createTime" format="yyyy-MM-dd HH:mm:ss"/></p>
					</div>
					
					<p class="text-center"><button type="submit" class="no-bottom demo-button button-minimal green-minimal">Submit</button></p>

				</fieldset>
			</form>
		</div>
	</div>


	<div class="decoration"></div>
</div>

<jsp:include page="../../bottom.jsp" />