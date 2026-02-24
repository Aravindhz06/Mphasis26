package com.java.jsp.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.jsp.Hotel;

public interface HotelDao {
	List<Hotel> showHotel() throws ClassNotFoundException, SQLException;

}
