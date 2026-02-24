<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="UpdateAgent.jsp">
		<center>
			Agent Id : 
			<input type="number" name="agentId"/> <br/>
			Agent Name :
			<input type="text" name="name" /> <br/>
			City:
			<input type="text" name="city"/><br/>
			Gender : 
			<select name="gender">
				<option value="MALE">MALE</option> 
				<option value="FEMALE">FEMALE</option>
			</select> <Br/>
			Marital Status: 
			<input type="number" name="maritalStatus" /><br/>
			Premium:
			<input type="number" name="premium"/><br/>
			<input type="submit" value="Update Agent" />
		</center>
	</form>
	<c:if test="${param.agentId !=null && param.premium !=null}">
		<sql:setDataSource var="conn" driver="com.mysql.cj.jdbc.Driver" 
		url="jdbc:mysql://localhost:3306/exam"
		user="root" 
		password="root@39"
	/>
	<sql:update var="agentUpdate" dataSource="${conn}">
		Update Agent Set Name=?,City=?,Gender=?,MaritalStatus=?,Premium=? WHERE AgentId=?
		
		<sql:param value="${param.name}" />
		<sql:param value="${param.city}" />
		<sql:param value="${param.gender}" />
		<sql:param value="${param.maritalStatus}" />
		<sql:param value="${param.premium}" />
		<sql:param value="${param.agentId}" />
		
	</sql:update>
	<c:out value="Agent Record Updated..." />
	</c:if>
</body>
</html>