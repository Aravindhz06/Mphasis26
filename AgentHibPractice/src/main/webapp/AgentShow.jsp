<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="agentDao" class="com.java.hib.dao.AgentDaoImpl" />
	<c:set var="agentList" value="${agentDao.showAgent()}" />
	<table border='3' align="center">
		<tr>
			<th>Agent Id</th>
			<th>Agent Name</th>
			<th>City</th>
			<th>Gender</th>
			<th>Marital Status</th>
			<th>Premium</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="agent" items="${agentList}">
			<tr>
				<td>${agent.agentId}</td>
				<td>${agent.name}</td>
				<td>${agent.city}</td>
				<td>${agent.gender}</td>
				<td>${agent.maritalStatus}</td>
				<td>${agent.premium}</td>
				<td>
				<a href=UpdateAgent.jsp?agentId=${agent.agentId}>Update</a>
				</td>
				<td>
				<a href=DeleteAgent.jsp?agentId=${agent.agentId}>Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>