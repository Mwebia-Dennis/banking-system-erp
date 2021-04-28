package com.penguins.bankingsystemerp.utilities;


/**
 *
 * @author dgitonga
 */
public class AccountType {
	
	private int id;
	private String account_name;
	public AccountType(int id, String account_name) {
		super();
		this.id = id;
		this.account_name = account_name;
	}
	public int getId() {
		return id;
	}
	public String getAccount_name() {
		return account_name;
	}
	
	
}
