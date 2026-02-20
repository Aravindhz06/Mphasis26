<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanDemo" class="com.java.jsp.DemoBean"/>
	<jsp:setProperty property="*" name="beanDemo"/>
	Student Name is:
	<b><jsp:getProperty property="sname" name="beanDemo"/></b>
</body>
</html>