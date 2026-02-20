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
<c:set var="agentId" value="${param.agentId}" />
<c:set var="agent" value="${agentDao.searchAgent(agentId)}"/>
<form method="post" action="UpdateAgent.jsp">
	<center>
		Agent Id: 
		<input type="number" name="agentId" value="${agent.agentId}" />
		<br/><br/>
		Agent Name : 
		<input type="text" name="name" value="${agent.name}" />
		<br/><br/>
		City:
		<input type="text" name="city" value="${agent.city }" />
		<br/><br/>
		Gender : 
		<input type="text" name="gender" value="${agent.gender}" />
		<br/><br/>
		Marital Status: 
		<input type="number" name="maritalStatus" value="${agent.maritalStatus}" />
		<br/><br/>
		Premium: 
		<input type="number" name="premium" value="${agent.premium}" />
		<br/><br/>
		<input type="submit" value="Update" />
	</center>
</form>

	<c:if test="${param.agentId!=null && param.premium!=null }">
		<jsp:useBean id="agent" class="com.java.hib.model.Agent" />
		<jsp:setProperty property="*" name="agent" />
		<c:out value="${agentDao.updateAgent(agent) }"/>
		<jsp:forward page="AgentShow.jsp"/>
	</c:if>
</body>
</html>