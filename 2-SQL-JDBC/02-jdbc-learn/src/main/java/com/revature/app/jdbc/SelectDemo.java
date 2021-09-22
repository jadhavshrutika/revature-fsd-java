package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SelectDemo {

	public static void main(String[] args) {
		Connection connection=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		connection=	DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb",
				"root",
				"Shrutika@123");
		String sql="select * from employee";
		
		PreparedStatement statement=connection.prepareStatement(sql);
		
		ResultSet resultset =statement.executeQuery();
		while(resultset.next()) {
			System.out.println(resultset.getString("name"));
		}
		
		
		connection.close();
		
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
		
		
		
		}
		}

	}


	}


