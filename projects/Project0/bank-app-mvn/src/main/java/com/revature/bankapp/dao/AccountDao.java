package com.revature.bankapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bankapp.accounts.Account;

public interface AccountDao {
	void create(Account account) throws SQLException;
	List<Account> list() throws SQLException;
}

