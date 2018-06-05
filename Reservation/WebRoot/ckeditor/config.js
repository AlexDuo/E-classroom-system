/*
Copyright (c) 2003-2011, CKSource - Frederico Knabben. All rights reserved.
For licensing, see LICENSE.html or http://ckeditor.com/license
*/

CKEDITOR.editorConfig = function( config )
{
	config.skin = 'office2003';
	config.language = 'zh-cn';
	config.filebrowserBrowseUrl = location.hash + '/ckfinder/ckfinder.html'; 
	config.filebrowserImageBrowseUrl = location.hash + '/ckfinder/ckfinder.html?Type=Images'; 
	config.filebrowserFlashBrowseUrl = location.hash+'/ckfinder/ckfinder.html?Type=Flash'; 
	config.filebrowserUploadUrl = location.hash + '/ckfinder/core/connector/aspx/connector.aspx?command=QuickUpload&type=Files'; 
	config.filebrowserImageUploadUrl = location.hash + '/ckfinder/core/connector/aspx/connector.aspx?command=QuickUpload&type=Images'; 
	config.filebrowserFlashUploadUrl = location.hash + '/ckfinder/core/connector/aspx/connector.aspx?command=QuickUpload&type=Flash'; 
};
