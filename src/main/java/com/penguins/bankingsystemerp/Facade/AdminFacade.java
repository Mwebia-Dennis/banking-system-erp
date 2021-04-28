package com.penguins.bankingsystemerp.Facade;

import java.util.ArrayList;

import com.penguins.bankingsystemerp.Dao.AccountsDao.AdminAccountDao;
import com.penguins.bankingsystemerp.Dao.TransactionDao.AdminTransactionDao;
import com.penguins.bankingsystemerp.Dao.User_Dao.AdminDao;
import com.penguins.bankingsystemerp.utilities.Account;
import com.penguins.bankingsystemerp.utilities.Transactions;
import com.penguins.bankingsystemerp.utilities.User;


/**
 *
 * @author dgitonga
 */
public class AdminFacade extends SuperFacade {
	
	AdminDao admin_dao;
	AdminAccountDao admin_account_dao;
	AdminTransactionDao admin_transaction_dao;
	String user_detail;
	String account_no;
	
	public AdminFacade(String user_detail, String account_no) {
		
		super(new AdminDao(user_detail), new AdminAccountDao(account_no), new AdminTransactionDao());
		
		this.admin_dao = (AdminDao) super_dao;
		this.admin_account_dao = (AdminAccountDao) superAccountDao;
		this.admin_transaction_dao = (AdminTransactionDao) superTransactionDao;
		this.user_detail = user_detail;
		this.account_no = account_no;
	}
	
	public boolean authenticate(String password) {
		return admin_dao.login(password);
	}
	public boolean registerNewUser(User user) {
		//TODO check if email or phone number or id exists in db
		return admin_dao.registerNewUser(user);
	}
	public boolean updateUser(User user) {
		
		return admin_dao.updateUserInfo(user);
	}

	public ArrayList<User> getAllUsers() {
		
		return admin_dao.getListOfUsers();
		
	}
		
	public ArrayList<Transactions> getAllTransactions() {
		return admin_transaction_dao.getListOfAllTransactions();
	}
	
	public Transactions getTransaction(String transaction_code ) {
		return admin_transaction_dao.getTransaction(transaction_code);
	}
	
	public ArrayList<Transactions> searchTransaction(String transaction_code) {
		
		return admin_transaction_dao.searchTransaction(transaction_code);
	}
	
	
	public ArrayList<Account> getAllAccounts() {
		return admin_account_dao.getListOfAllAccounts();
	}
	
	public boolean activateAccount() {
		return admin_account_dao.activateAccount();
	}
	
	public boolean setNewAccount(Account account) {
		return admin_account_dao.setNewAccount(account);
	}
	
	public ArrayList<Account> searchAccounts(String query) {
		return admin_account_dao.searchAccounts(query);
	}
	 
}
