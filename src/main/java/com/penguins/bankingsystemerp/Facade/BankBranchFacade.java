package com.penguins.bankingsystemerp.Facade;

import java.util.ArrayList;

import com.penguins.bankingsystemerp.Dao.BankBranchDao;
import com.penguins.bankingsystemerp.utilities.BankBranch;


/**
 *
 * @author dgitonga
 */
public class BankBranchFacade {
	
	private BankBranchDao bankBranchDao;

	public BankBranchFacade() {
		
		bankBranchDao = new BankBranchDao();
	}
	
	public ArrayList<BankBranch> getBranchList(){
		
		return bankBranchDao.getBranchList();
	}
	
}
