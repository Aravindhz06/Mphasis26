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
	<form method='get' action="SearchAgent.jsp">
		<center>
			Agent Id: 
		<input type="number" name="agentId" /> <br/><br/>
		<input type="submit" value="Search" />
		</center>
	</form>
	<c:if test="${param.agentId !=null}">
		<c:set var="agentId" value="${param.agentId}" />
		<sql:setDataSource var="conn" driver="com.mysql.cj.jdbc.Driver" 
		url="jdbc:mysql://localhost:3306/exam"
		user="root" 
		password="root@39"
	/>
	<sql:query var="agentQuery" dataSource="${conn}">
		select * from Agent where agentId = ? 
		<sql:param value="${agentId}" />
	</sql:query>
	<c:set var="flag" value="false" />
	<c:forEach var="agent" items="${agentQuery.rows}">
		Employ No : 
		<c:out value="${agent.agentId}" /> <br/>
		Employ Name : 
		<c:out value="${agent.name}" /> <br/>
		Gender : 
		<c:out value="${agent.city}" /> <br/>
		Department :
		<c:out value="${agent.gender}" /> <br/>
		Designation : 
		<c:out value="${agent.maritalStatus}" /> <br/>
		Basic : 
		<c:out value="${agent.premium}" /> <br/><hr/>
		<c:set var="flag" value="true" />
	</c:forEach>
	<c:if test="${flag==false}">
		<c:out value="Record Not Found..." />
	</c:if>
	</c:if>
</body>
</html>