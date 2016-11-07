<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SMVC_02</title>
</head>
<body>
	<h2>用户登录</h2>
	<form action="userAction/doLogin" method="post">
		用户姓名:<input name="uname"/><br/>
		用户密码:<input name="upwd"/><br/>
			<input type="submit" value="登录"/>
	</form>
	<hr>
	
	<h2>用户登录2</h2>
	<form action="userAction/doLogin2" method="post">
		用户姓名:<input name="uname"/><br/>
		用户密码:<input name="upwd"/><br/>
			<input type="submit" value="登录"/>
	</form>
	<hr>
	<a href="userAction/testOne">action跳转</a>
</body>
</html>