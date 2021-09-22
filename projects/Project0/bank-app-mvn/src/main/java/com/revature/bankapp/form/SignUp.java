package com.revature.bankapp.form;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.DaoImpl.CustomerDaoImpl;
import com.revature.bankapp.dao.CustomerDao;
import com.revature.bankapp.model.Customer;

public class SignUp extends Form {
	
	private String firstName;
	private String lastName;
	private String userId;
	private String password;

	public SignUp(String name) {
		super(name);
		
	}

	@Override
	public void captureData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("FirstName : ");
		firstName = sc.nextLine();
		
		System.out.println("LastName : ");
		lastName = sc.nextLine();

		System.out.println("userId : ");
		userId = sc.nextLine();

		System.out.println("Password : ");
		password = sc.nextLine();
	}

	@Override
	public void action() {
		
		CustomerDaoImpl dao = new CustomerDaoImpl();
		try {
			dao.create(new Customer(firstName,lastName,userId,password));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Registeration succesfully");
		success = true;
		
	}
	

}
