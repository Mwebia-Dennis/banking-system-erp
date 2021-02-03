/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp.Dao.TransactionDao;

import com.penguins.bankingsystemerp.utilities.Transactions;
import java.util.ArrayList;

/**
 *
 * @author dgitonga
 */
public class AdminTransactionDao extends SuperTransactionDao{
    
    public ArrayList getListOfAllTransactions () {
        
        ArrayList<Transactions> listOfTransactions = new ArrayList<>();
        
        return listOfTransactions;
    }
    public Transactions searchTransaction(String transaction_id) {
        
        Transactions transaction = null;
        
        
        return transaction;
    }
    
    
}
