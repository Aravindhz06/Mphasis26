<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agent Show</title>
</head>
<body bgcolor='orange'>
	<sql:setDataSource var="conn" driver="com.mysql.cj.jdbc.Driver" 
		url="jdbc:mysql://localhost:3306/exam"
		user="root" 
		password="root@39"
	/>
	<sql:query var="agentQuery" dataSource="${conn}">
		select * from Agent
	</sql:query>
	
	<c:forEach var="agent" items="${agentQuery.rows}">
		Agent Id:
		<c:out value="${agent.agentId }"/><br/>
		Agent Name:
		<c:out value="${agent.name }" /><br/>
		Agent's City:
		<c:out value="${agent.gender }"/><br/>
		Maritals Status:
		<c:out value="${agent.maritalStatus }"/><br/>
		Agent's Premium
		<c:out value="${agent.premium }"/><br/><b><hr></b>
	</c:forEach>
</body>
</html>