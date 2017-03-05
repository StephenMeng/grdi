<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
<title>Powered by Stephen</title>
</head>
<body>
	<a href="/shangshi/content/2.do">content1</a>
	<br> ${content.userId}
	<br> ${content.contentId}
	<br> ${content.sortDate }
	<br> ${content.contentExt.title }

	<c:forEach items="${s}" var="data" varStatus="vs">
		<a href="#">${data }</a>
	</c:forEach>
	<br>
</body>
</html>