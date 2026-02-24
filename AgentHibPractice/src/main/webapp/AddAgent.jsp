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
	<form method="post" action="AddAgent.jsp">
		<center>
			Agent Id: 
			<input type="number" name="agentId" /> <br/>
			Agent Name :
			<input type="text" name="name" /> <br/>
			City:
			<input type="text" name="city" /> <br/>
			Gender : 
			<select name="gender">
				<option value="MALE">MALE</option> 
				<option value="FEMALE">FEMALE</option>
			</select> <Br/>
			MaritalStatus:
			<input type="number" name="maritalStatus" /><br/> 
			Premium:
			<input type="number" name="premium" /><br/>
			
			<input type="submit" value="Add Agent" />
		</center>
	</form>
	<c:if test="${param.agentId !=null && param.premium !=null}">
	<jsp:useBean id="agentDao" class="com.java.hib.dao.AgentDaoImpl" />
	<jsp:useBean id="agent" class="com.java.hib.model.Agent" />
	<jsp:setProperty property="*" name="agent"/>
	<c:out value="${agentDao.addAgent(agent)}" />
	<jsp:forward page="AgentShow.jsp" />
	</c:if>
	
</body>
</html>