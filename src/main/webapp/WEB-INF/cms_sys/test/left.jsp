<%@page import="com.stephen.core.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${_user.username}
	<br>
	<a href="u-list.do" target="rightFrame">list users</a>
	<br>
	<a href="u-toadd-1.do" target="rightFrame">add user</a>
	<br>
	<a href="c-list.do" target="rightFrame">list content</a>
	<br>
	<a href="c-toadd-1.do" target="rightFrame">add content</a>

</body>
</html>