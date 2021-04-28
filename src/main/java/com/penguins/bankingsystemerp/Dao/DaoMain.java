package com.penguins.bankingsystemerp.Dao;


import com.penguins.bankingsystemerp.Dao.AccountsDao.AdminAccountDao;
import com.penguins.bankingsystemerp.utilities.LogMessages;

/*
import java.util.ArrayList;
import com.penguins.bankingsystemerp.utilities.Account;
import com.penguins.bankingsystemerp.utilities.AccountStatus;
import com.penguins.bankingsystemerp.Dao.TransactionDao.*;
import com.penguins.bankingsystemerp.utilities.LogMessages;
import com.penguins.bankingsystemerp.utilities.TransactionType;
import com.penguins.bankingsystemerp.utilities.Transactions;
import com.penguins.bankingsystemerp.utilities.User;
import com.penguins.bankingsystemerp.utilities.UserRoles;

*/


public class DaoMain {
	
	public static void main(String [] args) {
		
		//AdminTransactionDao adminTransactionDao = new AdminTransactionDao();
		//User user = new User(1003, "Ben", "mwangi","bazu@fintech.ke", "0712345678", "21345678", "098765", UserRoles.CUSTOMER);
		//LogMessages.log(String.valueOf(adminTransactionDao.getListOfAllTransactions().size()));
		//LogMessages.log(String.valueOf(adminTransactionDao.getTransaction("D46ABCBF-5D80-4081-A4C5-6639D6D95416").getUser_name()));
		//LogMessages.log((adminTransactionDao.setTransaction(new Transactions(TransactionType.WITHDRAW, 1, 2, null, 1000.00, null)))?'1':'0');
		//LogMessages.log(adminTransactionDao.getUserTransaction(1).get(0).getTransaction_code());
		
		
		
		AdminAccountDao adminAccountDao = new AdminAccountDao("8E995804-494E-47C8-9671-0A5CABDD326E");
		//LogMessages.log((adminAccountDao.setNewAccount(new Account(0, 2, "122112121", 4, 20000.00, "", AccountStatus.ACTIVE, 1, "")))?"1":"0");
		//LogMessages.log(adminAccountDao.searchAccounts("FBCBEEA5").get(0).getBranch());
		//LogMessages.log(adminAccountDao.getListOfAllAccounts().get(0).getBranch());
		//LogMessages.log(adminAccountDao.getListOfAllAccounts().get(1).getBranch());
		//LogMessages.log(adminAccountDao.getListOfAllAccounts().get(2).getBranch());
		//LogMessages.log((adminAccountDao.suspendAccount())?"1":"0");
		//LogMessages.log((adminAccountDao.lockAccount())?"1":"0");
		//LogMessages.log((adminAccountDao.activateAccount())?"1":"0");

		//LogMessages.log(adminAccountDao.getAccountInfo().getUser_name());
		LogMessages.log(adminAccountDao.getUserAccount("4").getUser_name());
		
		
		
		
	}

}
