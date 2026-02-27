<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Patient</title>
</head>
<body>
    <form method="post" action="updatefinal" modelAttribute="patient">
        <center>
            Patient ID :
            <input type="number" name="patientId" value="${patient.patientId}" />
            <br/>

            Patient Name :
            <input type="text" name="patientName" value="${patient.patientName}" />
            <br/>

            Gender :
            <input type="text" name="gender" value="${patient.gender}" />
            <br/>

            Bill Amount :
            <input type="number"  name="billAmount" value="${patient.billAmount}" />
            <br/>

            City :
            <input type="text" name="city" value="${patient.city}" />
            <br/>

            State :
            <input type="text" name="state" value="${patient.state}" />
            <br/>

            Policy Number :
            <input type="text" name="policyNumber" value="${patient.policyNumber}" />
            <br/>

            Claim Amount :
            <input type="number" name="claimAmount" value="${patient.claimAmount}" />
            <br/>

            Insurance Name :
            <input type="text" name="insuranceName" value="${patient.insuranceName}" />
            <br/>

            Pending Amount :
            <input type="number"  name="pendingAmount" value="${patient.pendingAmount}" />
            <br/>

            <input type="submit" value="Update" />
        </center>
    </form>
</body>
</html>