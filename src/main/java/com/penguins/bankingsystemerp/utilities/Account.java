/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp.utilities;

/**
 *
 * @author dgitonga
 */
public class Account {
    
    private String account_type, id_number, user_name, account_number, account_status,branch, date_added;
    double balance;  
    private int account_id, user_id, branch_id,account_type_id;

    public Account(int account_id, String account_type, String id_number, String user_name, double balance, String account_number, String account_status, String branch, String date_added) {
        this.account_id = account_id;
        this.account_type = account_type;
        this.id_number = id_number;
        this.user_name = user_name;
        this.balance = balance;
        this.account_number = account_number;
        this.account_status = account_status;
        this.branch = branch;
        this.date_added = date_added;
    }
    
    public Account(int account_id, int account_type_id, String id_number, int user_id, double balance, String account_number, String account_status, int branch_id, String date_added) {
        this.account_id = account_id;
        this.account_type_id = account_type_id;
        this.id_number = id_number;
        this.user_id = user_id;
        this.balance = balance;
        this.account_number = account_number;
        this.account_status = account_status;
        this.branch_id = branch_id;
        this.date_added = date_added;
    }
    
    public int getAccount_id() {
        return account_id;
    }

    public String getAccount_type() {
        return account_type;
    }
    
    public int getAccount_type_id() {
    	
    	return account_type_id;
    }

	public String getId_number() {
		return id_number;
	}

    public String getUser_name() {
        return user_name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccount_number() {
        return account_number;
    }

    public String getAccount_status() {
        return account_status;
    }

    public String getBranch() {
        return branch;
    }

    public String getDate_added() {
        return date_added;
    }
    
    public int getUser_id() {
        return user_id;
    }
    public int getBranch_id() {
        return branch_id;
    }

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public void setId_number(String id_number) {
		this.id_number = id_number;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public void setAccount_type_id(int account_type_id) {
		this.account_type_id = account_type_id;
	}
    
    
    
    
}
