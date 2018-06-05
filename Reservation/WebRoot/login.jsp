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
                  <em>input your username and password</em>
                  <h3>Student Login</h3>
              </div>
              <div class="heading-right">
                  <span class="icon icon-pencil"></span>
              </div>
          </div>
      </div>
      
      <div class="decoration"></div>
      <div class="container no-bottom">
            <div class="contact-form no-bottom form-center"> 
              
                <form action="login.action" method="post">
                    <fieldset>
                        <div class="formFieldWrap">
                            <label class="field-title contactNameField" for="contactNameField">UserName:</label>
                            <input type="text" name="user.userName" value="" class="contactField requiredField" >
                        </div>
                        <div class="formFieldWrap">
                            <label class="field-title contactEmailField" for="contactEmailField">PassWord: </label>
                            <input type="password" name="user.password" value="" class="contactField " />
                        </div>
                        <input type="hidden" checked name="autoLogin" value="true"/>
                        <p class="text-center"><button type="submit" class="no-bottom demo-button button-minimal green-minimal">Login</button></p>
                        
                    </fieldset>
                </form>       
            </div>
        </div>              
       
              
    <div class="decoration"></div>
</div>

<jsp:include page="bottom.jsp" />
