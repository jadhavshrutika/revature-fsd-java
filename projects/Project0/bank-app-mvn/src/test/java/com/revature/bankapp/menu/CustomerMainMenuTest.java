package com.revature.bankapp.menu;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.bankapp.DaoImpl.CustomerDaoImpl;
import com.revature.bankapp.model.Customer;

class CustomerMainMenuTest {

	@Test
	void test() {
		CustomerDaoImpl dao = new CustomerDaoImpl();
		try {
			dao.create(new Customer("abc","cdf","abcd","123"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
