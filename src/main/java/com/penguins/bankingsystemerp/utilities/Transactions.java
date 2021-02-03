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
    
    private String transaction_type, user_name, served_by_name, date_of_transaction;
    private double amount;
    private int transaction_code;

    public Transactions(String transaction_type, String user_name, String served_by_name, String date_of_transaction, double amount, int transaction_code) {
        this.transaction_type = transaction_type;
        this.user_name = user_name;
        this.served_by_name = served_by_name;
        this.date_of_transaction = date_of_transaction;
        this.amount = amount;
        this.transaction_code = transaction_code;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getServed_by_name() {
        return served_by_name;
    }

    public String getDate_of_transaction() {
        return date_of_transaction;
    }

    public double getAmount() {
        return amount;
    }

    public int getTransaction_code() {
        return transaction_code;
    }
    
    
}
