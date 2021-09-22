package com.revature.bankapp.accounts;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.DaoImpl.AcccountDaoImpl;

public class Account {
	private int id;
	private String accountNumber;
	private double balance;
	private int customerId;
	private char approved;
	boolean success = true;

	AcccountDaoImpl accdao = new AcccountDaoImpl();
	Scanner sc = new Scanner(System.in);
	
	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Account() {

	}
	
	
	public char getApproved() {
		return approved;
	}

	public void setApproved(char approved) {
		this.approved = approved;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

	public double getBalance() {
		return balance;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String printId() {
		return "Account Id: "+ id +" Account Number: " + accountNumber + ", Balance:" + balance;
	}
	
	public String print() {
		return "Account Number: " + accountNumber + ", Balance:" + balance;
	}

	@Override
	public String toString() {
		return "Customer Id: " + customerId + " Account Number: " + accountNumber + ", Balance:" + balance;
	}

	public double withdraw(double withdrawAmount) {
		while (success) {
//			System.out.println("Enter amount: ");
//			double withdrawAmount = sc.nextDouble();
			if (withdrawAmount < 0) {
				System.out.println("Enter Amount greater than 0");
			} else if (withdrawAmount <= balance) {
				balance -= withdrawAmount;
				success = false;
				try {
					accdao.insert(new Transactions('D', withdrawAmount));
					accdao.update(this);
					System.out.println("Successfull");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Insufficient funds");
			}

		}
		return balance;
	}

	public double deposit(double depositAmount) {
		while (success) {
			if (depositAmount < 0) {
				System.out.println("Enter Amount greater than 0");
			} else {
				balance += depositAmount;
				success = false;
				try {
					accdao.insert(new Transactions('C', depositAmount));
					accdao.update(this);
					System.out.println("Successfull");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return balance;
	}

	
	public void transfer(double amount) {
		balance += amount;
		try {
			accdao.insertTransfer(new Transactions('C', amount));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			accdao.updateTransfer(this);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	
}
