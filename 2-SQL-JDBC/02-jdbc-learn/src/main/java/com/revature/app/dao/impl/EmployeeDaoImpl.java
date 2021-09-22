package com.revature.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.app.jdbc.EmployeeDao;
import com.revature.app.jdbc.Util;
import com.revature.app.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> list() throws SQLException {
		List<Employee> employeeList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * \r\n" + 
					"from employee  e \r\n" + 
					"inner join department d\r\n" + 
					"on e.deptId= d.id";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setId(resultSet.getInt("id"));
				employee.setName(resultSet.getString("name"));
				employee.setSalary(resultSet.getDouble("salary"));
				employee.setGender(resultSet.getString("gender").charAt(0));
				employee.setDepartmentId(resultSet.getInt("deptId"));
				employeeList.add(employee);
			}
		}
		return employeeList; 

	}

	@Override
	public Employee get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
