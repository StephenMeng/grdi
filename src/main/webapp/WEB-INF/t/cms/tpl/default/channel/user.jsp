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
	<c:import url="../include/header.jsp"></c:import>
	<div class="col-md-9">
		<div class="col-md-3 md-margin-bottom-40">
			<ul class="list-group sidebar-nav-v1 margin-bottom-40"
				id="sidebar-nav-1">
				<c:forEach items="${leftChannel.child}" var="channel" varStatus="vs">
					<li class="list-group-item active"><a href="${channel.url }"><i
							class="fa fa-bar-chart-o"></i>${channel.name }</a></li>
				</c:forEach>
			</ul>

			<div class="margin-bottom-50"></div>

			<!--Datepicker-->
			<form action="#" id="sky-form2" class="sky-form">
				<div id="inline-start"></div>
			</form>
			<!--End Datepicker-->
		</div>
		<!--End Left Sidebar-->
		<div class="profile-body margin-bottom-20">
			<c:forEach items="${page.list}" var="user" varStatus="vs">
				<div class="inner-results">
					<h3>
						<a href="${projname}${channel.channelPath }/${user.userId}.html">${user.username }</a>
					</h3>
					<ul class="list-inline up-ul">
						<li><small>${user.email }</small></li>
						<li><small>地点：${user.registerTime }</small></li>

					</ul>

					<hr>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>