/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp.Dao.AccountsDao;

import com.penguins.bankingsystemerp.utilities.Account;

/**
 *
 * @author dgitonga
 */
public class AdminAccountDao extends SuperAccountDao{
    
    
    public AdminAccountDao(float account_no) {
        super(account_no);
    }
    
    public Account searchAccount() {
        
        
        Account account = null;
        
        
        return account;
    }
    
    public boolean suspendAccount() {
        
        return false;
    }
    
    public boolean activateAccount() {
        
        return false;
    }
    public Account getUserAccount(String user_detail) {
         Account account = null;
        
        
        return account;
    }
    
    
}
