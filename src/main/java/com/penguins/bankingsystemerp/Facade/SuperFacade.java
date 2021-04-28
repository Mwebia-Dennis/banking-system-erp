package com.penguins.bankingsystemerp.Facade;

import java.util.ArrayList;

import com.penguins.bankingsystemerp.Dao.AccountsDao.SuperAccountDao;
import com.penguins.bankingsystemerp.Dao.TransactionDao.SuperTransactionDao;
import com.penguins.bankingsystemerp.Dao.User_Dao.SuperDao;
import com.penguins.bankingsystemerp.Exceptions.AccountException;
import com.penguins.bankingsystemerp.utilities.*;

/*
 * @author dgitonga
 * 
 * facade classes that provide business functionality 
 * super-facade is the root class with general functions shared by different users
 * */
public class SuperFacade{
	
	protected SuperAccountDao superAccountDao;
	protected SuperTransactionDao superTransactionDao;
	protected SuperDao super_dao;

	public SuperFacade(SuperDao super_dao, SuperAccountDao superAccountDao, SuperTransactionDao superTransactionDao) {
		
		this.superAccountDao = superAccountDao;
		this.superTransactionDao = superTransactionDao;
		this.super_dao = super_dao;
	}
	
	//user information
	
	public User getUserDetails() {
		
		return super_dao.getUserDetails();
	}
	
	//transaction functionality
	
	public boolean setTransaction(Transactions transaction) {
		
		return superTransactionDao.setTransaction(transaction);
	}
	public ArrayList<Transactions> getUserTransaction(int user_id) {
		
		return superTransactionDao.getUserTransaction(user_id);
	}
	
	//account functionality
	
	public double checkBalance(String account_no) {
		return superAccountDao.getAccountInfo().getBalance();
	}
	
	public boolean depositAmount(double amount){
		//get the current account balance		
		// add new amount 
		//update db
		
		Account account = superAccountDao.getAccountInfo();
		account.setBalance(account.getBalance() + amount);
		return superAccountDao.updateAccountBalance(account);
	}
	public boolean withdrawCash(double amount) throws AccountException {
		
		Account account = superAccountDao.getAccountInfo();
		
		if(account.getBalance() < amount) {
			
			throw new AccountException("Sorry you have insufficient balance");
		}
		account.setBalance(account.getBalance() - amount);
		return superAccountDao.updateAccountBalance(account);
	}
	
	public boolean lockAccount() {
		return superAccountDao.lockAccount();
	}

	
	
	
	
}
