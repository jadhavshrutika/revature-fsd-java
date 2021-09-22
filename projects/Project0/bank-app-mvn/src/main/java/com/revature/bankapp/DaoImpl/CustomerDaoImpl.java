package com.revature.bankapp.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.bankapp.dao.CustomerDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.menu.CustomerMainMenu;
import com.revature.bankapp.model.Customer;


public class CustomerDaoImpl implements CustomerDao {
	
	public static int currentCustomerId;

	public Customer get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void create(Customer customer) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into customer (firstName,lastName,email,password) values (?,?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, customer.getFirstName());
			statement.setString(2,  customer.getLastName());
			statement.setString(3, customer.getEmail());
			statement.setString(4, customer.getPassword());
			statement.executeUpdate();
		}

	}

	public void update(Customer customer) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub

	}
	
	public Customer getCustomerUserId(String userId) throws SQLException {
		Customer customer = null;
		
		try (Connection connection = Util.getConnection()){
			String sql = "select * from customer where email = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, userId);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				
				String name = resultSet.getString("firstName");
				String email = resultSet.getString("email");
				String password = resultSet.getString("password");
				
				customer = new Customer( name, email, password);
			}
		}
		return customer;
		
	}}
