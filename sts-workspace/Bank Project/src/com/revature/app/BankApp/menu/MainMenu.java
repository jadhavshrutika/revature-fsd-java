package com.revature.app.BankApp.menu;

import java.util.Scanner;

import com.revature.app.BankApp.form.LoginForm;
import com.revature.app.BankApp.model.Customer;
import com.revature.app.BankApp.model.DataManager;

public class MainMenu extends Menu {

	public MainMenu(String name) {
		super(name);
		addMenuItem("Register new Customer");
		addMenuItem("Login as Customer");
		addMenuItem("Login as Employee");
		addMenuItem("Exit");
	}

	@Override
	void handleAction() {
		Scanner scanner = new Scanner(System.in);
		switch (selection) {
		case 1:
			System.out.println("\n===");
			System.out.println("Register new customer");
			System.out.println("====\n");
			
			System.out.print("First Name: ");
			String firstName = scanner.nextLine();
			
			System.out.print("Last Name: ");
			String lastName = scanner.nextLine();

			System.out.print("Email: ");
			String email = scanner.nextLine();

			System.out.print("Password: ");
			String password = scanner.nextLine();
			
			DataManager.addCustomer(new Customer(firstName, lastName, email, password));
			System.out.println("Customer added successfully.");
			displayMenuAndCaptureSelection();
			break;
		case 2:
			LoginForm loginForm = new LoginForm("Login Form");
			loginForm.captureDataAndPerformAction();
			break;
		}
	}
	
}