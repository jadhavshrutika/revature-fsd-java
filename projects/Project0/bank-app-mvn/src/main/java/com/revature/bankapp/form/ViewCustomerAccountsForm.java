package com.revature.bankapp.form;

import java.sql.SQLException;
import java.util.List;
import com.revature.bankapp.DaoImpl.AcccountDaoImpl;
import com.revature.bankapp.dao.AccountDao;
import com.revature.bankapp.menu.CustomerMainMenu;
import com.revature.bankapp.accounts.Account;

public class ViewCustomerAccountsForm extends Form{

	public ViewCustomerAccountsForm(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void captureData() {
		
	}

	@Override
	public void action() {
		AccountDao dao = new AcccountDaoImpl();
		List<Account> accountList = null;
		try {
			accountList = dao.list();
		} catch (SQLException e) {
			System.out.println("Failed getting Customer.");
		}
		accountList.forEach(System.out::println);
		
		success = true;
	}

}
