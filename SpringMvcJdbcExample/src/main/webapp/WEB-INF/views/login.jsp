<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body bgcolor="orange">
	<form method="post" action="loginresult">
		<center>
			User Name:
			<input type="text" name="userName"/><br><br>
			Password:
			<input type="password" name="passCode"/><br><br>
			<input type="submit" value="Login"/>
		</center>
	</form>
	<br><br>
	<center>
	<p style="color:red">${error}</p>
	<p style="color:red">${msg}</p>
	<a href="forgetpassword">Forget Password??</a>
	</center>
</body>
</html>