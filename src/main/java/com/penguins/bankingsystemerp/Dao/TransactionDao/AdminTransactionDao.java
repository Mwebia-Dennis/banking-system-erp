/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp.Dao.TransactionDao;

import com.penguins.bankingsystemerp.Dao.DbConfigs;
import com.penguins.bankingsystemerp.utilities.Transactions;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author dgitonga
 */
public class AdminTransactionDao extends SuperTransactionDao{
    
    public ArrayList getListOfAllTransactions () {
        
        ArrayList<Transactions> listOfAllTransactions = new ArrayList<>();
        try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
            
            ResultSet result = statement.executeQuery("select * from "+DbConfigs.TableTransactions.VIEW_NAME+" order by "
                    +DbConfigs.TableTransactions.DATE_ADDED);
            
            while(result.next()) {
                
                listOfAllTransactions.add(new Transactions(result.getString(DbConfigs.TableTransactions.TRANSACTION_TYPE),
                        result.getString(DbConfigs.TableUsers.F_NAME) + " " +result.getString(DbConfigs.TableUsers.L_NAME),
                        result.getInt(DbConfigs.TableTransactions.SERVED_BY),
                        result.getString(DbConfigs.TableTransactions.DATE_ADDED),
                        result.getDouble(DbConfigs.TableTransactions.AMOUNT),
                        result.getString(DbConfigs.TableTransactions.TRANSACTION_CODE)));
                
                
            }
            
            result.close();
            statement.close();
            conn.close();
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception ex) {
            ex.printStackTrace();
        }finally{
            closeDbResources();
        }
        
        return listOfAllTransactions;
    }
    public Transactions searchTransaction(String transaction_id) {
        
        Transactions transaction = null;
                
        return transaction;
    }
    
    
}
