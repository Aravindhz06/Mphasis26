<%@page import="com.java.jsp.Hotel"%>
<%@page import="java.util.List"%>
<%@page import="com.java.jsp.dao.HotelDaoImpl"%>
<%@page import="com.java.jsp.dao.HotelDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor='orange'>
	<center>
	<%
		HotelDao dao = new HotelDaoImpl();
		List<Hotel> hotelList = dao.showHotel();
		for(Hotel hotel : hotelList) {
			out.println("Hotel Id: <b>"+hotel.getHotelId()+"</b><br><br>");
			out.println("Hotel Name: <b>"+hotel.getHotelName()+"</b><br><br>");
			out.println("Hotel type: <b>"+hotel.getHotelType()+"</b><br><br>");
			out.println("City: <b>"+hotel.getCity()+"</b><br><br>");
			out.println("State: <b>"+hotel.getState()+"</b><br><br>");
			out.println("Email: <b>"+hotel.getEmail()+"</b><br><br>");
			out.println("Contact Number: <b>"+hotel.getContactNumber()+"</b><br><br>");
			out.println("Facilities: <b>"+hotel.getFacilities()+"</b><br><br>");
			out.println("Capacity: <b>"+hotel.getCapacity()+"</b><br><br>");
			out.println("Address: <b>"+hotel.getAddress()+"</b><br><br>");
			out.println("<hr>");
		}
	%>
	</center>
</body>
</html>
