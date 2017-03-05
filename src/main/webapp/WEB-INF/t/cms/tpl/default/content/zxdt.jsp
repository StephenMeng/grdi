<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
	<!-- Profile Content -->
	<div class="col-md-9">
		<!-- News v3 -->
		<div class="news-v3 bg-color-white margin-bottom-30">
			<img class="img-responsive full-width" src="${resSys }/recent/2.jpg"
				alt="">
			<div class="news-v3-in">
				<ul class="list-inline posted-info">
					<li>编辑： <a href="#">${content.author }</a></li>
					<li>来源 <a href="#">${content.type }</a></li>
					<li>${content.editDate }</li>
				</ul>
				<h2>
					<a href="#">${content.title }</a>
				</h2>
				<p>${content.description }
				<ul class="post-shares post-shares-lg">
					<li><a href="#"> <i class="rounded-x icon-speech"></i> <span>8</span>
					</a></li>
					<li><a href="#"> <i class="rounded-x icon-share"></i> <span>20</span>
					</a></li>
					<li><a href="#"> <i class="rounded-x icon-heart"></i> <span>10</span>
					</a></li>
				</ul>
			</div>
		</div>
		<!-- End Profile Content -->
		<!--/end row-->
	</div>

</body>
</html>