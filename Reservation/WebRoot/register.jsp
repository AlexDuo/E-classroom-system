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
				<em>input your info</em>
				<h3>Student Register</h3>
			</div>
			<div class="heading-right">
				<span class="icon icon-pencil"></span>
			</div>
		</div>
	</div>

	<div class="decoration"></div>
	<div class="container no-bottom">
		<div class="contact-form no-bottom form-center">

			<form action="register.action" method="post">
				<fieldset>
					<div class="formFieldWrap">
						<label class="field-title contactNameField">UserName:</label>
						<input type="text" name="user.userName" value="" class="contactField requiredField" >
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactEmailField">PassWord: </label>
						<input type="password" name="user.password" value="" class="contactField " />
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactNameField">Mobile:</label>
						<input type="number" name="user.phone" value="" class="contactField requiredField" >
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactEmailField">E-mail: </label>
						<input type="email" name="user.email" value="" class="contactField " />
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactEmailField">Address: </label>
						<input type="text" name="user.addr" value="" class="contactField" />
					</div>
					<input type="hidden" name="user.status" value="1"/>
					<p class="text-center"><button type="submit" class="no-bottom demo-button button-minimal green-minimal">Register</button></p>

				</fieldset>
			</form>
		</div>
	</div>


	<div class="decoration"></div>
</div>

<jsp:include page="bottom.jsp" />
