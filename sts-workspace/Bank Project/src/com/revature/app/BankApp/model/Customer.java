package com.revature.app.BankApp.model;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	private static long counter =0;
	
	public Customer(long id, String firstName, String lastName, String email, String password) {
		super();
		counter++;
		this.id =counter;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		
		
		
	}

	public Customer(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

}
