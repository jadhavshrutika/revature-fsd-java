package com.revature.app.dao.impl;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.app.jdbc.EmployeeDao;

class EmployeeDaoimplTest {

	@Test
	void test() {
		EmployeeDao dao=new EmployeeDaoImpl();
		
			try {
				assertTrue(dao.list().size()>0);
			} catch (SQLException e) {
			e.printStackTrace();
				fail("Getting files ");
			}
		}
	

}
