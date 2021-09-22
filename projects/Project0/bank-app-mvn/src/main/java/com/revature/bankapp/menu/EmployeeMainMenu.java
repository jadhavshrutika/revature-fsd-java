package com.revature.bankapp.menu;

import com.revature.bankapp.form.ApproveAccountForm;
import com.revature.bankapp.form.RejectAccountForm;
import com.revature.bankapp.form.TransactionsForm;
import com.revature.bankapp.form.ViewCustomerAccountsForm;

public class EmployeeMainMenu extends Menu{

	public EmployeeMainMenu(String name) {
		super(name);
		addMenuItems("Approve Account");
		addMenuItems("Reject Account");
		addMenuItems("View Customer Accounts");
		addMenuItems("View Transaction");
	}

	@Override
	void handleAction() {
		switch(selection) {
		case 1:
			ApproveAccountForm approveAccountForm = new ApproveAccountForm("Approve Account");
			approveAccountForm.captureDataAndPerformAction();
			break;
		case 2:
			RejectAccountForm rejectAccountForm = new RejectAccountForm("Reject Account");
			rejectAccountForm.captureDataAndPerformAction();
			break;
		case 3:
			ViewCustomerAccountsForm viewCustomerAccountsForm = new ViewCustomerAccountsForm("View Accounts");
			viewCustomerAccountsForm.captureDataAndPerformAction();
			break;
		case 4:
			TransactionsForm transactionsForm = new TransactionsForm("Transaction Form");
			transactionsForm.captureDataAndPerformAction();
			break;
		case 5:
			System.out.println("Back to Main Menu");
			EmployeeMainMenu employeeMenu = new EmployeeMainMenu("Menu");
			employeeMenu.captureSelection();
			break;
		}
	}

	@Override
	void handleSelection() {
		// TODO Auto-generated method stub
		
	}



}
