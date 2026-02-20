<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanGreeting" class="com.java.jsp.Greeting"/>
	Default Message:
	<jsp:getProperty property="message" name="beanGreeting"/>
	
	<jsp:setProperty property="message" name="beanGreeting" value="Good Afternoon..."/>
	
	<br>
	New Message:
	<b>
		<jsp:getProperty property="message" name="beanGreeting"/>
	</b>
</body>
</html>