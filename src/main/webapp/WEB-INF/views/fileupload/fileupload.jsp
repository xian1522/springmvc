<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>  
<%@ page isELIgnored="false"%>
<html>
<body>
<div>
	<div>spring multipart</div>
	<form action="processUpload" method="post" enctype="multipart/form-data">
		<input type="file" name="file">
		<input type="submit" value="submit">
	</form>
	<c:if test="${not empty filename}">${filename}</c:if><br>
	<c:if test="${not empty content}">${content}</c:if><br>
</div>
</body>
</html>
