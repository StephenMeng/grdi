<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user</title>
<link rel="shortcut icon" href="${resSys}/recent/G.ico">

<!-- Web Fonts -->
<link rel='stylesheet' type='text/css' href="${resSys}/css2/webcss.css">

<!-- CSS Global Compulsory -->
<link rel="stylesheet"
	href="${resSys}/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${resSys}/css/style.css">

<!-- CSS Header and Footer -->
<link rel="stylesheet" href="${resSys}/css/headers/header-default.css">
<link rel="stylesheet" href="${resSys}/css/footers/footer-v1.css">

<!-- CSS Implementing Plugins  -->
<link rel="stylesheet" href="${resSys}/plugins/animate.css">
<link rel="stylesheet"
	href="${resSys}/plugins/line-icons/line-icons.css">
<link rel="stylesheet"
	href="${resSys}/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${resSys}/plugins/parallax-slider/css/parallax-slider.css">
<link rel="stylesheet"
	href="${resSys}/plugins/owl-carousel/owl-carousel/owl.carousel.css">

<!-- CSS Customization -->
<link rel="stylesheet" href="${resSys}/css/custom.css">

</head>

<body>
	<div class="boxed-layout">wrapper</div>
	${resSys}/css/style.css ${resSys }/plugins/animate.css ${res }
	<c:import url="../include/navi.jsp"></c:import>

	${res } ${user.username } ${user.userExt.realname } ${user.userId }
	${user.userExt.qq } ${user.test} ${user.attr.gender }
	<br>
	<c:forEach items="${user.userAttr}" var="attr" varStatus="vs">
		<a href="#">${attr.attrName }</a>
		<a href="#">${attr.attrValue }</a>
		<br>
	</c:forEach>
</body>
</html>