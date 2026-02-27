<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!DOCTYPE html>
<html>
<head>
<title>Reset Password</title>
</head>
<body>
    <center>
        <h2>Create New Password</h2>

        <form method="post" action="resetpasswordfinal">

            <input type="hidden" name="userName" value="${userName}" />

            New Password :
            <input type="password" name="newPassword" required />
            <br/><br/>

            Confirm Password :
            <input type="password" name="confirmPassword" required />
            <br/><br/>

            <input type="submit" value="Update Password" />
        </form>
        <p style="color:red">${error}</p>
    </center>
</body>
</html>
</body>
</html>