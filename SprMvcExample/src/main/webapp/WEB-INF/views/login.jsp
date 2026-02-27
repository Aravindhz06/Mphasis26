<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
	<form method="post" action="loginauth">
		<center>
			User Name:
			<input type="text" name="userName" /><br><br>
			Password:
			<input type="password" name="passCode"/><br><br>
			<input type="submit" value="login"/>
		</center>
	</form>
	<p style="color:red">${error}</p>
</body>
</html>