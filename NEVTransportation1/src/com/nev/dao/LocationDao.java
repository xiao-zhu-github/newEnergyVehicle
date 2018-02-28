package com.nev.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.nev.utils.DBUtil;


public class LocationDao {
	private static final String LOCATION = "location";

	public void addDevice(String carNum, double carLng,double carLat, Timestamp times) {
		String sql = "insert into " + LOCATION + " (carNum,carLng,carLat,times) values(?,?,?,?)";
		Connection conn = DBUtil.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, carNum);
			ps.setDouble(2, carLng);
			ps.setDouble(3, carLat);
			ps.setTimestamp(4, times);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
