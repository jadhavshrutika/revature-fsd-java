package com.revature.bankapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class Util {
	// private static final  LOGGER = LoggerFactory.getLogger(Util.class);
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp",
				"root","Shrutika@123");
	}

}
