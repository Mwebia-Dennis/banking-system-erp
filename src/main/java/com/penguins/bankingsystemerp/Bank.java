/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp;

/**
 *
 * @author dgitonga
 */
public interface Bank {
    
    /**
     *
     * @param account_no required in order to identify specific account to check balance from
     * @param amount amount to be deposited
     * @param amount amount to be withdrawn

     */
    public void checkBalance(String account_no);
    public void depositAmount(double amount);
    public void withdrawCash(double amount);
    
}
