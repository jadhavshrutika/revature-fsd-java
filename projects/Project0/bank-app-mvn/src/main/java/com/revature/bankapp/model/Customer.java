package com.revature.bankapp.model;

import java.util.ArrayList;

import com.revature.bankapp.accounts.Account;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private ArrayList<Account> accountList;
	
	
	
	
	public Customer(int id, String firstName, String lastName, String email, String password,
			ArrayList<Account> accountList) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.accountList = accountList;
	}
	


	public Customer(String firstName, String email, String password) {
		super();
		this.firstName = firstName;
		this.email = email;
		this.password = password;
	}



	public Customer(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}



	public Customer() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", accountList=" + accountList + "]";
	}


}