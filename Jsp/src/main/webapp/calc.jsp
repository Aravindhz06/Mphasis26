<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="calc.jsp">
		<center>
			First Number:
			<input type="number" name="firstNo"><br><br>
			Second Number:
			<input type="number" name="secondNo"><br><br>
			<input type="submit" value="Calculation">
		</center>
	</form>
	<%
		
		
		if(request.getParameter("firstNo")!=null && request.getParameter("secondNo")!=null){
			
			int num1,num2,result;
			
		    num1=Integer.parseInt(request.getParameter("firstNo"));
			num2=Integer.parseInt(request.getParameter("secondNo"));
			
		    result=num1+num2;
			out.println("Sum is <b> "+result+"</b><br>");
			
			result=num1-num2;
			out.println("Sub is <b> "+result+"</b><br>");
			
			result=num1*num2;
			out.println("Mul is <b> "+result+"</b><br>");
		}
	%>
</body>
</html>