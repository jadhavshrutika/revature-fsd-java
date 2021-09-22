package com.revature.app.BankApp.model;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	private static long counter =0;
	
	public Customer( String firstName, String lastName, String email, String password) {
		super();
		counter++;
		this.id =counter;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		
		
		
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
