<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Patient</title>
</head>
<body bgcolor="orange">
	<form method="post" action="savepatient" modelAttribute="patient">
        <center>
            Patient ID :
            <input type="number" name="patientId" /> <br/><br/>

            Patient Name :
            <input type="text" name="patientName" /> <br/><br/>

            Gender :
            <input type="text" name="gender" /> <br/><br/>

            Bill Amount :
            <input type="number" step="0.01" name="billAmount" /> <br/><br/>

            City :
            <input type="text" name="city" /> <br/><br/>

            State :
            <input type="text" name="state" /> <br/><br/>

            Policy Number :
            <input type="text" name="policyNumber" /> <br/><br/>

            Claim Amount :
            <input type="number" name="claimAmount" /> <br/><br/>

            Insurance Name :
            <input type="text" name="insuranceName" /> <br/><br/>

            Pending Amount :
            <input type="number"  name="pendingAmount" /> <br/><br/>

            <input type="submit" value="Add Patient" />
        </center>
    </form>
</body>
</html>