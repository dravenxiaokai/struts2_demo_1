<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>employeeAdd</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/uploads/list_execute" enctype="multipart/form-data" method="post">
		文件1：<input type="file" name="image"><br>
		文件2：<input type="file" name="image"><br>
		文件3：<input type="file" name="image"><br>
		<button type="submit">上传</button>
	</form>
</body>
</html>