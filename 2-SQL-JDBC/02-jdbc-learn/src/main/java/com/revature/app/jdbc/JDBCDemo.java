package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
	
public class JDBCDemo {

	public static void main(String[] args) {
		
		Connection connection=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		connection=	DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb",
				"root",
				"Shrutika@123");
		System.out.println(connection.getClass());
		System.out.println("connection sucessful");
		String sql ="insert into department (name) values ('Innovation')";
		Statement statement=connection.createStatement();
		System.out.println(statement.getClass().getName());
		connection.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}
			catch(SQLException e) {
		
		}
		}

	}

}
