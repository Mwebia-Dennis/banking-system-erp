/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp.Dao.TransactionDao;

import com.penguins.bankingsystemerp.Dao.DbConfigs;
import com.penguins.bankingsystemerp.utilities.LogMessages;
import com.penguins.bankingsystemerp.utilities.Transactions;
import com.penguins.bankingsystemerp.utilities.User;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author dgitonga
 */
public class SuperTransactionDao {
    
    
    protected Connection conn = null;
    protected Statement statement = null;
    
    protected boolean setTransaction(Transactions transaction, int user_id, int served_by) {
        
        
        boolean hasTransactionBeenSet = false;
        try{
            
                Class.forName(DbConfigs.JDBC_DRIVER);            
                conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
                statement = conn.createStatement();
        
                int affectedRows = statement.executeUpdate("insert into "+DbConfigs.TableTransactions.TABLE_NAME+" "
                        + "("+DbConfigs.TableTransactions.AMOUNT+","+DbConfigs.TableTransactions.TRANSACTION_TYPE+","+DbConfigs.TableTransactions.USER_ID
                        +","+DbConfigs.TableTransactions.SERVED_BY+", "+DbConfigs.TableTransactions.TRANSACTION_CODE+") "
                                + "values ("+transaction.getAmount()+", '"+transaction.getTransaction_type()+"', "+user_id+", "+served_by+", DEFAULT); ");

                hasTransactionBeenSet = (affectedRows > 0);

                statement.close();
                conn.close();

            }catch(SQLException se){
                //Handle errors for JDBC
                se.printStackTrace();
            }catch(Exception ex) {
                LogMessages.log(ex.getMessage());
            }finally{
                closeDbResources();
            }

        return hasTransactionBeenSet;
    }
    
    protected ArrayList getUserTransaction(int user_id) {
        
        ArrayList<Transactions> listOfAllUserTransactions = new ArrayList<>();
        try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
            
            ResultSet result = statement.executeQuery("select * from "+DbConfigs.TableTransactions.VIEW_NAME+" where "
                    +DbConfigs.TableTransactions.USER_ID+" = "+user_id+" order by "+DbConfigs.TableTransactions.DATE_ADDED);
            
            while(result.next()) {
                
                listOfAllUserTransactions.add(new Transactions(result.getString(DbConfigs.TableTransactions.TRANSACTION_TYPE),
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
            
        }finally{
            closeDbResources();
        }
        
        return listOfAllUserTransactions;
        
    }
    //function to release jdbc resources
    public void closeDbResources() {
        try{
            if(statement!=null)
               statement.close();
         }catch(SQLException se2){
         }// nothing we can do
         try{
            if(conn!=null)
               conn.close();
         }catch(SQLException se){
            se.printStackTrace();
         }
    }
    
}
