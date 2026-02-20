<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method='get' action="DeleteAgent.jsp">
		<center>
			Agent Id : 
		<input type="number" name="agentId" /> <br/><br/>
		<input type="submit" value="Delete" />
		</center>
	</form>
	<c:if test="${param.agentId !=null}">
		<c:set var="agentId" value="${param.agentId}" />
		<sql:setDataSource var="conn" driver="com.mysql.cj.jdbc.Driver" 
		url="jdbc:mysql://localhost:3306/exam"
		user="root" 
		password="root@39"
	/>
	
	<sql:update var="conn" dataSource="${conn}">
		Delete from Agent where agentId = ?
		<sql:param value="${param.agentId}" />
	</sql:update>
	<c:out value="Agent Record Deleted..." />
	</c:if>
</body>
</html>