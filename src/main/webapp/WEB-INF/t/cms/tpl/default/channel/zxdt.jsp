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
	<!--=== Profile ===-->
	<div class="container content profile">
		<div class="row">
			<div class="col-md-3 md-margin-bottom-40">
				<ul class="list-group sidebar-nav-v1 margin-bottom-40"
					id="sidebar-nav-1">
					<c:forEach items="${leftChannel.child}" var="channel"
						varStatus="vs">
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

			<!-- Profile Content -->
			<div class="col-md-9">
				<div class="profile-body margin-bottom-20">
					<c:forEach items="${page.list}" var="content" varStatus="vs">
						<div class="inner-results">
							<h3>
								<a
									href="${projname}${channel.channelPath }/${content.contentId}.html">${content.title }</a>
							</h3>
							<ul class="list-inline up-ul">
								<li><small>${content.keywords }</small></li>
								<li><small>地点：${content.attr.location }</small></li>

							</ul>
							<p>
								<strong>${content.description }</strong>
							</p>
							<ul class="list-inline down-ul">
								<li>${content.editDate }</li>
								<li>编辑：${content.author }</li>
								<li>信息来源：${content.type }</li>
							</ul>
						</div>
						<hr>
					</c:forEach>

					<!-- Begin Inner Results -->
					<div class="margin-bottom-30"></div>

					<div class="text-left">
						<ul class="pagination">
							<li><a href="#">«</a></li>
							<li class="active"><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">...</a></li>
							<li><a href="#">14</a></li>
							<li><a href="#">15</a></li>
							<li><a href="#">»</a></li>
						</ul>
					</div>

				</div>
			</div>
			<!-- End Profile Content -->
		</div>
		<!--/end row-->
	</div>

	<c:import url="../include/footer.jsp"></c:import>
	<br>

</body>
</html>