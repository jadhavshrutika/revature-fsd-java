package com.revature.bankapp.accounts;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.DaoImpl.AcccountDaoImpl;
import com.revature.bankapp.menu.CustomerMainMenu;

public class ViewAccounts {

	public ViewAccounts(String string) {
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<Account> accountsList() {

		AcccountDaoImpl accdao = new AcccountDaoImpl();
		try {
			List<Account> accounts = accdao.accountList();
			for (int i = 0; i < accounts.size(); i++) {
				System.out.println((i + 1) + ") " + accounts.get(i).print());
			}
			CustomerMainMenu cm = new CustomerMainMenu("Customer Menu");
		
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Cannot display accounts");
		}
		return null;
	}

	public static ArrayList<Transactions> transactionsList() {

		AcccountDaoImpl accdao = new AcccountDaoImpl();
		try {
			List<Transactions> transaction = accdao.transactionList();
			for (int i = 0; i < transaction.size(); i++) {
				System.out.println((i + 1) + ") " + transaction.get(i).print());
			}
			CustomerMainMenu cm = new CustomerMainMenu("Customer Menu");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Cannot display accounts");
		}
		return null;
	}

	public void displayMenuAndCapture() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
