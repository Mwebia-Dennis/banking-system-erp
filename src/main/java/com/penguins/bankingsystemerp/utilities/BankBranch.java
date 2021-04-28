package com.penguins.bankingsystemerp.utilities;


/**
 *
 * @author dgitonga
 */
public class BankBranch {
	
	private int id;
	private String branch_name;
	public BankBranch(int id, String branch_name) {
		super();
		this.id = id;
		this.branch_name = branch_name;
	}
	public int getId() {
		return id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	
	
}
