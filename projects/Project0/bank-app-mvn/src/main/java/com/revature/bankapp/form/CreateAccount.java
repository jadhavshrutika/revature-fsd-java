package com.revature.bankapp.form;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.DaoImpl.AcccountDaoImpl;
import com.revature.bankapp.accounts.Account;
import com.revature.bankapp.dao.AccountDao;

public class CreateAccount extends Form {

	private String accountNumber;
	private double initialAmount;

	public CreateAccount(String name) {
		super(name);

	}

	@Override
	public void captureData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number: ");
		accountNumber = sc.nextLine();

		System.out.print("Enter the intial deposit amount: ");
		initialAmount = sc.nextDouble();

	}

	@Override
	public void action() {
		AccountDao adao = new AcccountDaoImpl();
		try {
			adao.create(new Account(accountNumber, initialAmount));
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Account not created");
		}
		System.out.println("Account created successfully ");
		success = true; 
		captureDataAndPerformAction();

	}


}
