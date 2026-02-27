<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
 <center>
        <h2>Forgot Password</h2>

        <form method="post" action="resetpassword" />
        	User Name :
            <input type="text" name="userName" required />
            <br/><br/>

            <input type="submit" value="Next" />
        </form>
        <p style="color:red">${error}</p>
    </center>
	
</body>
</html>