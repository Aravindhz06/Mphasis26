<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
	<table border="2" align="center">
		<tr>
			<th>Patient ID</th>
			<th>Patient's Name</th>
			<th>Gender</th>
			<th>Bill Amount</th>
			<th>City</th>
			<th>State</th>
			<th>Policy Number</th>
			<th>Claim Amount</th>
			<th>Insurance Name</th>
			<th>Pending Amount</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		
		<c:forEach var="patient" items="${patientList}">
			<tr>
				<td>${patient.patientId }</td>
				<td>${patient.patientName }</td>
				<td>${patient.gender }</td>
				<td>${patient.billAmount }</td>
				<td>${patient.city }</td>
				<td>${patient.state }</td>
				<td>${patient.policyNumber }</td>
				<td>${patient.claimAmount }</td>
				<td>${patient.insuranceName }</td>
				<td>${patient.pendingAmount }</td>
				<td> 
					<a href=updatepatient?patientId=${patient.patientId}>Update</a>
				</td>
				<td> 
					<a href=deletepatient?patientId=${patient.patientId}>Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<hr/>
	<a href="addpatient">Add Patient</a>
</body>
</html>