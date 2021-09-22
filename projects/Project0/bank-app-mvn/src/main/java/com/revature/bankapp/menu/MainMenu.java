package com.revature.bankapp.menu;

import com.revature.bankapp.form.EmployeeLogin;
import com.revature.bankapp.form.LoginForm;
import com.revature.bankapp.form.SignUp;
import com.revature.bankapp.model.Customer;

public class MainMenu extends Menu {

	public MainMenu(String name) {
		super(name);
		addMenuItems("Customer Signup");
		addMenuItems("Customer Login");
		addMenuItems("Employee Login");
		addMenuItems("Exit");

	}

	@Override
	void handleSelection() {
		switch (selection) {

		case 1:
			
			SignUp s= new SignUp("Loginform");
			s.captureDataAndPerformAction();
			MainMenu mainMenu = new MainMenu("Main Menu");
			displayMenuAndCapture();
			break;

		case 2:
			
			LoginForm loginForm = new LoginForm("Customer Login");
			loginForm.captureDataAndPerformAction();
			CustomerMainMenu customerMenu = new CustomerMainMenu("Customer Menu");
			displayMenuAndCapture();
			break;
			
		case 3:
			EmployeeLogin empLogin = new EmployeeLogin("Admin Login");
			empLogin.captureDataAndPerformAction();
			break;
		
		case 4:
			System.out.println("********Thank you Visit Again **********");
			break;
		}
	
	}

}
