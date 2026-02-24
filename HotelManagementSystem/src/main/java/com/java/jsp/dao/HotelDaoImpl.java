package com.java.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.jsp.Hotel;
import com.java.jsp.util.ConnectionHelper;

public class HotelDaoImpl implements HotelDao {

	Connection connection;
	PreparedStatement psmt;
	
	@Override
	public List<Hotel> showHotel() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Hotel";
		psmt = connection.prepareStatement(cmd);
		ResultSet rs = psmt.executeQuery();
		List<Hotel> hotelList = new ArrayList<Hotel>();
		Hotel hotel = null;
		while(rs.next()) {
			hotel = new Hotel();
			hotel.setHotelId(rs.getInt("hotelId"));
			hotel.setHotelName(rs.getString("hotelName"));
			hotel.setHotelType(rs.getString("hotelType"));
			hotel.setCity(rs.getString("city"));
			hotel.setState(rs.getString("state"));
			hotel.setEmail(rs.getString("email"));
			hotel.setContactNumber(rs.getLong("contactNumber"));
			hotel.setFacilities(rs.getString("facilities"));
			hotel.setCapacity(rs.getInt("capacity"));
			hotel.setAddress(rs.getString("address"));
			hotelList.add(hotel);
		}
		return hotelList;
	}

}
