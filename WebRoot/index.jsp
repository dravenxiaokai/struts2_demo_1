<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
	<form
		action="<%=request.getContextPath()%>/control/employee/list_execute.action"
		method="post">
		id:<input type="text" name="id"><br> name:<input
			type="text" name="name"><br> <input type="submit"
			value="发送">
	</form>
</body>
</html>