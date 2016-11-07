<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>succeed</title>
</head>
<body>
		欢迎你的光临！${sessionUser.uname }<br/>
		上下文：${ctxUser.uname }<br/>
		
		<hr>
		欢迎你的光临！${doUser2.uname }<br/>
		doUser=${doUser}<br/>
		<hr>
		message=${param.message}<br>
		message=${sessionScope['org.springframework.web.servlet.support.SessionFlashMapManager.FLASH_MAPS'][0]['message'] }<br>
		
</body>
</html>