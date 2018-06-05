<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<jsp:include page="../../title.jsp" />
<jsp:include page="../manageBanner.jsp" />
<script> 
  function IsNum(e) { 
       var key = window.event ? e.keyCode:e.which; 
       var keychar = String.fromCharCode(key); 
       reg = /\d/; 
       return reg.test(keychar); 
  } 
</script> 
<div class="content">
	<div class="container no-bottom">
            <div class="heading">
                <div class="heading-left">
                    <em>choose your button to operate</em>
                    <h3>Course Update Page</h3>
                </div>
	             <div class="heading-right">
	                  <span class="icon icon-pencil"></span>
	              </div>
            </div>
        </div>
        
        <div class="decoration"></div>
	<div class="container no-bottom">
		<div class="contact-form no-bottom form-center">

			<form action="manage/Product_update.action" method="post">
			<input type="hidden" name="product.id" value='<s:property value="product.id"/>'/>
				<fieldset>
					<div class="formFieldWrap">
						<label class="field-title contactNameField">Course Name:</label>
						<input type="text" name="product.proName" value='<s:property value="product.proName"/>' class="contactField" >
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactEmailField">Course Credit: </label>
						<input type="text" name="product.proPrice" value='<s:property value="product.proPrice"/>' class="contactField" onkeypress="return IsNum(event)" />
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactEmailField">Start time: </label>
						<input type="time" name="product.proStartTime" value='<s:property value="product.proStartTime"/>' class="contactField" />
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactEmailField">End time: </label>
						<input type="time" name="product.proEndTime" value='<s:property value="product.proEndTime"/>' class="contactField" />
					</div>
					<div class="formFieldWrap">
						<label class="field-title contactNameField">Course Details:</label>
						<textarea id="content" class="product-textarea" name="product.proIntro"><s:property value="product.proIntro"/></textarea>
		                <script type="text/javascript">  
		                    CKEDITOR.replace('content',{filebrowserUploadUrl : 'ckeditor/uploader?Type=File',  
		                        filebrowserImageUploadUrl : 'ckeditor/uploader?Type=Image',  
		                        filebrowserFlashUploadUrl : 'ckeditor/uploader?Type=Flash'  
		                    });  
		                </script>
					</div>
					
					<p class="text-center"><button type="submit" class="no-bottom demo-button button-minimal green-minimal">Submit</button></p>

				</fieldset>
			</form>
		</div>
	</div>


	<div class="decoration"></div>
</div>

<jsp:include page="../../bottom.jsp" />