package com.revature.bankapp.menu;

import com.revature.bankapp.accounts.ViewAccounts;
import com.revature.bankapp.form.CreateAccount;
import com.revature.bankapp.form.ViewCustomerAccountsForm;
import com.revature.bankapp.main.BankApp;

public class CustomerMainMenu extends Menu{
	
	public  CustomerMainMenu(String name) {
		super(name);
		addMenuItems("Create Account");
		addMenuItems("View Accounts");
		addMenuItems("LogOut");
	}


	


	@Override
	void handleSelection(){
		switch(selection) {
		case 1:
		
			
		CreateAccount createAccountForm = new CreateAccount("Create Account");
		//displayMenuAndCapture();
		createAccountForm.captureDataAndPerformAction();
		displayMenuAndCapture();
		break;
		
		case 2:
	ViewCustomerAccountsForm form=new ViewCustomerAccountsForm("view accounts");
	form.captureDataAndPerformAction();
	
			displayMenuAndCapture();
			break;
		case 3:
			BankApp.setCurrentCustomer(null);
			MainMenu mainMenu = new MainMenu("Menu");
			mainMenu.displayMenuAndCapture();
		}
	}
	}
