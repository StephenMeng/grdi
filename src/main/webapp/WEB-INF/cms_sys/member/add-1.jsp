<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="u-toadd-2.do" method="post">
		id：<input name="userId" type="number" id="userId"> <br>
		name：<input name="username" type="text" id="username"> <br>
		gender：<input name="gender" type="radio" id="gender"> <br>
		birthday：<input name="birthday" type="date" id="birthday">
		intro：<input name="intro" type="text" id="intro"> <br>
		comefrom：<input name="comefrom" type="text" id="comefrom"> <br>
		qq：<input name="qq" type="text" id="qq"> <br> msn：<input
			name="msn" type="text" id="msn"> <br> phone：<input
			name="phone" type="text" id="phone"> <br> mobile：<input
			name="mobile" type="text" id="mobile"> <br> userImg：<input
			name="userImg" type="text" id="userImg"> <br> userSig：<input
			name="userSignature" type="text" id="userSignature"> <br>
		<input type="submit" name="提交" title="提交">
	</form>
</body>
</html>