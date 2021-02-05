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
public class Transactions {
    
    private String transaction_type, user_name, date_of_transaction, transaction_code;
    private double amount;
    private int served_by_id,user_id;

    public Transactions(String transaction_type, String user_name, int served_by_id, String date_of_transaction, double amount, String transaction_code) {
        this.transaction_type = transaction_type;
        this.user_name = user_name;
        this.served_by_id = served_by_id;
        this.date_of_transaction = date_of_transaction;
        this.amount = amount;
        this.transaction_code = transaction_code;
    }
    
    public Transactions(String transaction_type, int user_id, int served_by_id, String date_of_transaction, double amount, String transaction_code) {
        this.transaction_type = transaction_type;
        this.user_id = user_id;
        this.served_by_id = served_by_id;
        this.date_of_transaction = date_of_transaction;
        this.amount = amount;
        this.transaction_code = transaction_code;
    }

    
    public String getTransaction_type() {
        return transaction_type;
    }
    
    public int getUser_id() {
    	
    	return user_id;
    }
    public String getUser_name() {
        return user_name;
    }

    public int getServed_by_id() {
        return served_by_id;
    }

    public String getDate_of_transaction() {
        return date_of_transaction;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransaction_code() {
        return transaction_code;
    }
    
    
}
