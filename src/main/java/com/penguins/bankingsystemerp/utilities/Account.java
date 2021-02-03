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
    
    private String account_type, user_name, account_number, account_status,branch, date_added;
    double balance;
    private int account_id;

    public Account(int account_id, String account_type, String user_name, double balance, String account_number, String account_status, String branch, String date_added) {
        this.account_id = account_id;
        this.account_type = account_type;
        this.user_name = user_name;
        this.balance = balance;
        this.account_number = account_number;
        this.account_status = account_status;
        this.branch = branch;
        this.date_added = date_added;
    }

    public int getAccount_id() {
        return account_id;
    }

    public String getAccount_type() {
        return account_type;
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
    
}
