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
                    <h3>User Update Page</h3>
                </div>
	             <div class="heading-right">
	                  <span class="icon icon-pencil"></span>
	              </div>
            </div>
        </div>
        
        <div class="decoration"></div>
        
	<div class="container no-bottom">
		<div class="contact-form no-bottom form-center">

			<form action="manage/User_update.action" method="post">
				<fieldset>
					<div class="formFieldWrap">
						<label class="field-title contactNameField">UserName:</label>
						<input type="text" name="user.userName" value='<s:property value="user.userName"/>' class="contactField" >
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactEmailField">PassWord: </label>
						<input type="password" name="user.password" value='<s:property value="user.password"/>' class="contactField " />
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactNameField">Mobile:</label>
						<input type="number" name="user.phone" value='<s:property value="user.phone"/>' class="contactField" >
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactEmailField">E-mail: </label>
						<input type="email" name="user.email" value='<s:property value="user.email"/>' class="contactField " />
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactEmailField">Address: </label>
						<input type="text" name="user.addr" value='<s:property value="user.addr"/>' class="contactField " />
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactEmailField">Condition: </label>
						<select name="user.status" class="user-select">
		                    <option value="1">Activate
		                    <option value="2">Deactivate                
		                </select>
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactEmailField">Regist Time: </label>
						<p><s:date name="user.regTime" format="yyyy-MM-dd HH:mm:ss"/></p>
					</div>
				
					<input type="hidden" name="user.id" value='<s:property value="user.id"/>'/>
				    <input type="hidden" name="user.regTime" value='<s:property value="user.regTime"/>'/>
					<p class="text-center"><button type="submit" class="no-bottom demo-button button-minimal green-minimal">Submit</button></p>

				</fieldset>
			</form>
		</div>
	</div>


	<div class="decoration"></div>
        
        
</div>

<jsp:include page="../../bottom.jsp" />
