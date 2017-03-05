<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="${resSys}/css/login/loginDialog.css">
<script type="text/javascript" src="${resSys}/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function($) {
		//弹出登录
		$("#toLogin").hover(function() {
			$(this).stop().animate({
				opacity : '1'
			}, 600);
		}, function() {
			$(this).stop().animate({
				opacity : '0.6'
			}, 1000);
		}).on('click', function() {
			$("body").append("<div id='mask'></div>");
			$("#mask").addClass("mask").fadeIn("slow");
			$("#LoginBox").fadeIn("slow");
		});
		//
		//按钮的透明度
		$("#loginbtn").hover(function() {
			$(this).stop().animate({
				opacity : '1'
			}, 600);
		}, function() {
			$(this).stop().animate({
				opacity : '0.8'
			}, 1000);
		});
		//文本框不允许为空---按钮触发
		$("#loginbtn").on('click', function() {
			var txtName = $("#txtName").val();
			var txtPwd = $("#txtPwd").val();
			if (txtName == "" || txtName == undefined || txtName == null) {
				if (txtPwd == "" || txtPwd == undefined || txtPwd == null) {
					$(".warning").css({
						display : 'block'
					});
				} else {
					$("#warn").css({
						display : 'block'
					});
					$("#warn2").css({
						display : 'none'
					});
				}
			} else {
				if (txtPwd == "" || txtPwd == undefined || txtPwd == null) {
					$("#warn").css({
						display : 'none'
					});
					$(".warn2").css({
						display : 'block'
					});
				} else {
					$(".warning").css({
						display : 'none'
					});
				}
			}
		});
		//文本框不允许为空---单个文本触发
		$("#txtName").on('blur', function() {
			var txtName = $("#txtName").val();
			if (txtName == "" || txtName == undefined || txtName == null) {
				$("#warn").css({
					display : 'block'
				});
			} else {
				$("#warn").css({
					display : 'none'
				});
			}
		});
		$("#txtName").on('focus', function() {
			$("#warn").css({
				display : 'none'
			});
		});
		//
		$("#txtPwd").on('blur', function() {
			var txtName = $("#txtPwd").val();
			if (txtName == "" || txtName == undefined || txtName == null) {
				$("#warn2").css({
					display : 'block'
				});
			} else {
				$("#warn2").css({
					display : 'none'
				});
			}
		});
		$("#txtPwd").on('focus', function() {
			$("#warn2").css({
				display : 'none'
			});
		});
		//关闭
		$(".close_btn").hover(function() {
			$(this).css({
				color : 'black'
			})
		}, function() {
			$(this).css({
				color : '#999'
			})
		}).on('click', function() {
			$("#LoginBox").fadeOut("fast");
			$("#mask").css({
				display : 'none'
			});
		});
	});
</script>
<div id="LoginBox">
	<div class="row1">
		登录<a href="javascript:void(0)" title="关闭窗口" class="close_btn"
			id="closeBtn">×</a>
	</div>
	<div class="row">
		用户名: <span class="inputBox"> <input type="text" id="userId"
			placeholder="学号/邮箱" />
		</span><a href="javascript:void(0)" title="提示" class="warning" id="warn">*</a>
	</div>
	<div class="row">
		密&nbsp;&nbsp;&nbsp;&nbsp;码: <span class="inputBox"> <input
			type="text" id="password" placeholder="密码" />
		</span><a href="javascript:void(0)" title="提示" class="warning" id="warn2">*</a>
	</div>
	<div class="row">
		<a href="/shangshi/cms/admin/login.do" id="loginbtn">登录</a>
	</div>

</div>
<div class="header">
	<div class="container">
		<!-- Logo -->
		<a class="logo" href="/index.html"> <img
			src="${resSys	}/recent/bt-default.png" alt="Logo">
		</a>
		<!-- End Logo -->

		<!-- Topbar -->
		<div class="topbar">
			<ul class="loginbar pull-right">
				<li class="hoverSelector"><i class="fa fa-globe"></i> <a>语言</a>
					<ul class="languages hoverSelectorBlock">
						<li class="active"><a href="#">中文 <i class="fa fa-check"></i></a>
						</li>
						<li><a href="#">English</a></li>
					</ul></li>
				<li class="topbar-devider"></li>
				<li><a href="page_faq.html">帮助</a></li>
				<li class="topbar-devider"></li>
				<li><a href="#" id="toLogin">登录</a></li>
			</ul>
		</div>
		<!-- End Topbar -->

		<!-- Toggle get grouped for better mobile display -->
		<button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target=".navbar-responsive-collapse">
			<span class="sr-only">Toggle navigation</span> <span
				class="fa fa-bars"></span>
		</button>
		<!-- End Toggle -->
	</div>
	<!--/end container-->

	<div
		class="collapse navbar-collapse mega-menu navbar-responsive-collapse">
		<div class="container">
			<ul class="nav navbar-nav">
				<!-- Home -->
				<li class="active"><a href="${projname}"
					class="dropdown-toggle"> 首页 </a></li>
				<!-- End Home -->

				<!-- Pages -->
				<li class="dropdown"><a href="${projname}zxdt/index.html"
					class="dropdown-toggle"> 最新动态 </a>
					<ul class="dropdown-menu">
						<li><a href="${projname}ggtz/index.html">公告通知</a></li>
						<li><a href="${projname}xsdt/index.html">学术动态</a></li>
						<li><a href="${projname}jlhz/index.html">交流合作</a></li>
						<li><a href="${projname}hwhd/index.html">户外活动</a></li>
					</ul></li>
				<!-- End Pages -->

				<!-- Blog -->
				<li class="dropdown"><a href="${projname}cyjs/index.html"
					class="dropdown-toggle"> 成员介绍 </a>
					<ul class="dropdown-menu">
						<li><a href="${projname}js/index.html">教授</a></li>
						<li><a href="${projname}fjs/index.html">副教授</a></li>
						<li><a href="${projname}bs/index.html">博士</a></li>
						<li><a href="${projname}ss/index.html">硕士</a></li>
						<li><a href="${projname}xs/index.html">学士</a></li>
					</ul></li>
				<!-- End Blog -->

				<!-- Portfolio -->
				<li class="dropdown"><a href="${projname}xmdt/index.html"
					class="dropdown-toggle" data-toggle="dropdown"> 项目动态 </a>
					<ul class="dropdown-menu">
						<li class="dropdown-submenu"><a
							href="${projname}xmjz/index.html">项目进展</a></li>
						<li class="dropdown-submenu"><a
							href="${projname}hynr/index.html">会议内容</a></li>
						<li class="dropdown-submenu"><a
							href="${projname}xmcg/index.html">项目成果</a>
							<ul class="dropdown-menu">
								<li><a href="#">论文发表</a></li>
								<li><a href="#">项目报告</a></li>
								<li><a href="#">专利申请</a></li>
							</ul></li>

					</ul></li>
				<!-- End Portfolio -->

				<!-- Features -->
				<li><a href="${projname}yjsjs/index.html"
					class="dropdown-toggle" data-toggle="dropdown"> 研究所介绍 </a></li>
				<!-- End Features -->

				<!-- Shortcodes -->
				<li><a href="${projname}rczp/index.html;"
					class="dropdown-toggle" data-toggle="dropdown"> 人才招聘 </a></li>
				<!-- End Shortcodes -->

				<!-- Demo Pages -->
				<li><a href="${projname}lxwm/index.html"
					class="dropdown-toggle"> 联系我们 </a></li>
				<!-- End Demo Pages -->
			</ul>
		</div>
		<!--/end container-->
	</div>
	<!--/navbar-collapse-->
</div>
<c:forEach items="${channel.nodeList}" var="channel" varStatus="vs">
	<a href="${channel.url }">${channel.name }</a>>
	</c:forEach>