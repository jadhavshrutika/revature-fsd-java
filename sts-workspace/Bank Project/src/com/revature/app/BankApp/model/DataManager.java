package com.revature.app.BankApp.model;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
private static List<Customer> customerList = new ArrayList<>();
	
	static {
		boolean add = customerList.add(new Customer("John", "Smith", "john", "123"));
	}

	public static void addCustomer(Customer customer) {
		customerList.add(customer);
	}
	
	public static Customer getCustomerByEmail(String email) {
		for (Customer customer : customerList) {
			if (customer.getEmail().equals(email)) {
				return customer;
			}
		}
		return null;
	}
}

