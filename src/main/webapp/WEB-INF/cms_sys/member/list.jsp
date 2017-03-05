<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${page.list}" var="user" varStatus="vs">
		<div class="inner-results">
			<h3>
				<a href="${projname}${channel.channelPath }/${user.userId}.html">${user.username }</a>
			</h3>
			<ul class="list-inline up-ul">
				<li><small>${user.email }</small></li>
				<li><small>时间：${user.registerTime }</small></li>
			</ul>
			<a href="u-delete.do?uesrId=${user.userId}">删除</a> <a
				href="u-toupdate.do?userId=${user.userId}">修改</a> <a
				href="u-detail.do?userId=${user.userId}">查看</a>
			<hr>
		</div>
	</c:forEach>
	<a href="u-list.do?page=${page.prePage }">上一页</a>当前第${page.currentPage }页
	<a href="u-list.do?page=${page.nextPage }">下一页</a> 共 ${page.totalPage }
	页
</body>
</html>