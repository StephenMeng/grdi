<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link rel="shortcut icon" href="${res}/recent/G.ico">

<!-- Web Fonts -->
<link rel='stylesheet' type='text/css' href="${res}/css2/webcss.css">

<!-- CSS Global Compulsory -->
<link rel="stylesheet"
	href="${res}/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${res}/css/style.css">

<!-- CSS Header and Footer -->
<link rel="stylesheet" href="${res}/css/headers/header-default.css">
<link rel="stylesheet" href="${res}/css/footers/footer-v1.css">

<!-- CSS Implementing Plugins  -->
<link rel="stylesheet" href="${res}/plugins/animate.css">
<link rel="stylesheet" href="${res}/plugins/line-icons/line-icons.css">
<link rel="stylesheet"
	href="${res}/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${res}/plugins/parallax-slider/css/parallax-slider.css">
<link rel="stylesheet"
	href="${res}/plugins/owl-carousel/owl-carousel/owl.carousel.css">

<!-- CSS Customization -->
<link rel="stylesheet" href="${res}/css/custom.css">

</head>
<body>
	<c:import url="../include/navi.jsp"></c:import>
	
	<a href="content/147.do">content</a>
	<form action="user-save.do" method="post">
		<br> 姓名：<input name="username" type="text" id="username">
		密碼：<input name="password" type="text" id="password"> <input
			type="submit" name="提交">
	</form>

	<form action="detail-save.do" method="post">
		id：<input name="userId" type="number" id="userId"> <br>
		name：<input name="realname" type="text" id="realname"> <br>
		id：<input name="userId" type="number" id="userId"> <br>
		name：<input name="username" type="text" id="username"> <br>
		<!--  gender：<input name="gender" type="radio" id="gender"> <br>
		birthday：<input name="birthday" type="date" id="birthday">
		intro：<input name="intro" type="text" id="intro"> <br>
		comefrom：<input name="comefrom" type="text" id="comefrom"> <br>
		qq：<input name="qq" type="text" id="qq"> <br> msn：<input
			name="msn" type="text" id="msn"> <br> phone：<input
			name="phone" type="text" id="phone"> <br> mobile：<input
			name="mobile" type="text" id="mobile"> <br> userImg：<input
			name="userImg" type="text" id="userImg"> <br> userSig：<input
			name="userSignature" type="text" id="userSignature"> <br>
			-->
		<input type="submit" name="提交" title="提交">
	</form>

	<form action="user-delete.do" method="post">
		<br> id：<input name="userId" type="text" id="userId"> <input
			type="submit" name="提交">
	</form>
</body>

</html>
