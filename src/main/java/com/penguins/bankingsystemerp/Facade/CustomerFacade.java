package com.penguins.bankingsystemerp.Facade;

import com.penguins.bankingsystemerp.Dao.AccountsDao.SuperAccountDao;
import com.penguins.bankingsystemerp.Dao.TransactionDao.SuperTransactionDao;
import com.penguins.bankingsystemerp.Dao.User_Dao.CustomerDao;
import com.penguins.bankingsystemerp.Exceptions.AuthenticationException;
import com.penguins.bankingsystemerp.utilities.Account;


/**
 *
 * @author dgitonga
 */
public class CustomerFacade extends SuperFacade {
	
	String user_detail;
	String account_no;
	CustomerDao customerDao;
	
	public CustomerFacade(String user_detail, String account_no) {

		super(new CustomerDao(user_detail), new SuperAccountDao(account_no), new SuperTransactionDao());
		
		this.user_detail = user_detail;
		this.account_no = account_no;
		this.customerDao = (CustomerDao) super_dao;
	}
	public boolean authenticate(String password) throws AuthenticationException {
		
		//check if both email/id number/phone and password are not empty
		if(customerDao.getUser_credential() == "" || password == "") {
			
			throw new AuthenticationException("All user credential are needed");
		}
		
		return customerDao.login(password);
	}
	
	public boolean resetPassword(String new_pass) {
		return customerDao.resetPassword(new_pass);
	}
	public Account getUserAccount () {
		return superAccountDao.getUserAccount(user_detail);
	}

	
	
}
