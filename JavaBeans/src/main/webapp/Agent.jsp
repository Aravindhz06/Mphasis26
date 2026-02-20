<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanAgent" class="com.java.jsp.Agent"/>
	<jsp:setProperty property="*" name="beanAgent"/>
	Agent Id:
	<b>
	<jsp:getProperty property="agentId" name="beanAgent"/>
	</b></br>
	
	First Name:
	<b>
	<jsp:getProperty property="firstName" name="beanAgent"/>
	</b></br>
	
	Last Name:
	<b>
	<jsp:getProperty property="lastName" name="beanAgent"/>
	</b></br>
	
	City:
	<b>
	<jsp:getProperty property="city" name="beanAgent"/>
	</b></br>
	
	State:
	<b>
	<jsp:getProperty property="state" name="beanAgent"/>
	</b></br>
	
	Country:
	<b>
	<jsp:getProperty property="country" name="beanAgent"/>
	</b></br>
	
	Gender:
	<b>
	<jsp:getProperty property="gender" name="beanAgent"/>
	</b></br>
	
	Premium Amount:
	<b>
	<jsp:getProperty property="premiumAmount" name="beanAgent"/>
	</b></br>
</body>
</html>