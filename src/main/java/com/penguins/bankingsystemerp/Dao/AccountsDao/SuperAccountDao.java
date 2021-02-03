/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp.Dao.AccountsDao;

/**
 *
 * @author dgitonga
 */
public class SuperAccountDao {
    
    private float account_no;  

    public SuperAccountDao(float account_no) {
        this.account_no = account_no;
    }
    
    public void getAccountInfo() {
        
    }   
    
    public boolean lockAccount() {
        
        return false;
    }
    
}
