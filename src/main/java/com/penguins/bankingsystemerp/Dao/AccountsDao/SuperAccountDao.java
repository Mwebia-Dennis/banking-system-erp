/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp.Dao.AccountsDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.penguins.bankingsystemerp.Dao.DbConfigs;
import com.penguins.bankingsystemerp.utilities.Account;
import com.penguins.bankingsystemerp.utilities.AccountStatus;

/**
 *
 * @author dgitonga
 */
public class SuperAccountDao {
    
    protected String account_no;
    protected Connection conn = null;
    protected Statement statement = null; 

    public SuperAccountDao(String account_no) {
        this.account_no = account_no;
    }
    
    public Account getAccountInfo() {
        
    	Account account = null;
    	
    	try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
            
            ResultSet result = statement.executeQuery("SELECT TOP (1) * FROM "+DbConfigs.TableAccount.VIEW_NAME+" where "+DbConfigs.TableAccount.ACCOUNT_NUMBER
            		+" = '"+account_no+"' order by "+DbConfigs.TableAccount.DATE_ADDED);
            
            while(result.next()) {
                
            	account = new Account(result.getInt(DbConfigs.TableAccount._ID),
            			result.getString(DbConfigs.TableAccountType.ACCOUNT_NAME),
            			result.getString(DbConfigs.TableUsers.ID_NUMBER),
            			result.getString(DbConfigs.TableUsers.F_NAME) + " " +result.getString(DbConfigs.TableUsers.L_NAME),
            			result.getDouble(DbConfigs.TableAccount.BALANCE_AMOUNT),
            			result.getString(DbConfigs.TableAccount.ACCOUNT_NUMBER),
            			result.getString(DbConfigs.TableAccount.ACCOUNT_STATUS),
            			result.getString(DbConfigs.TableBankBranch.BRANCH_NAME),
            			result.getString(DbConfigs.TableAccount.DATE_ADDED)
        			);
                break;
                
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
    	return account;
    }   
   
    public Account getUserAccount (String user_credential) {
    	
    	Account account = null;
    	
    	try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
            
            ResultSet result = statement.executeQuery("SELECT TOP (1) * FROM "+DbConfigs.TableAccount.VIEW_NAME+" where "+DbConfigs.TableAccount.USER_ID
            		+" = '"+user_credential+"' or "+DbConfigs.TableUsers.EMAIL+" = '"+user_credential+"' or "+DbConfigs.TableUsers.PHONE_NO+" = '"
            		+user_credential+"' or "+DbConfigs.TableUsers.ID_NUMBER+" = '"+user_credential+"' order by "+DbConfigs.TableAccount.DATE_ADDED);
            
            while(result.next()) {
                
            	account = new Account(result.getInt(DbConfigs.TableAccount._ID),
            			result.getString(DbConfigs.TableAccountType.ACCOUNT_NAME),
            			result.getString(DbConfigs.TableUsers.ID_NUMBER),
            			result.getString(DbConfigs.TableUsers.F_NAME) + " " +result.getString(DbConfigs.TableUsers.L_NAME),
            			result.getDouble(DbConfigs.TableAccount.BALANCE_AMOUNT),
            			result.getString(DbConfigs.TableAccount.ACCOUNT_NUMBER),
            			result.getString(DbConfigs.TableAccount.ACCOUNT_STATUS),
            			result.getString(DbConfigs.TableBankBranch.BRANCH_NAME),
            			result.getString(DbConfigs.TableAccount.DATE_ADDED)
        			);
                break;
                
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
    	return account;
    }
    
    public boolean lockAccount() {
    	return updateAccountStatus(AccountStatus.LOCKED);
    }
    
    
    public boolean updateAccountStatus(String status) {
    	boolean hasAccountBeenUpdated = false;
        try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
            
            int affectedRows = statement.executeUpdate("update "+DbConfigs.TableAccount.TABLE_NAME+" set "
                    +DbConfigs.TableAccount.ACCOUNT_STATUS +" = '"+status+"'"
                    + " where "+DbConfigs.TableAccount.ACCOUNT_NUMBER+" = '"+account_no+"'");
            
            hasAccountBeenUpdated = (affectedRows > 0);
            
            statement.close();
            conn.close();
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception ex) {
            
        }finally{
            closeDbResources();
        }
        
        return hasAccountBeenUpdated;
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

	
