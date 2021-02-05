/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp.Dao.AccountsDao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.penguins.bankingsystemerp.Dao.DbConfigs;
import com.penguins.bankingsystemerp.utilities.Account;
import com.penguins.bankingsystemerp.utilities.AccountStatus;
import com.penguins.bankingsystemerp.utilities.LogMessages;

/**
 *
 * @author dgitonga
 */
public class AdminAccountDao extends SuperAccountDao{
    
    
    public AdminAccountDao(String account_no) {
        super(account_no);
    }
    
    public boolean setNewAccount(Account account) {
        //insert into Account (account_type, user_id, balance_amount, account_status, branch_id, account_number) values (1, 1, 10000.00, 'ACTIVE', 1, DEFAULT)
    	
    	boolean hasAccountBeenSet = false;
    	//set Account
        try{
        
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
    
            int affectedRows = statement.executeUpdate("insert into "
                    +DbConfigs.TableAccount.TABLE_NAME+ " ("+DbConfigs.TableAccount.ACCCOUNT_TYPE
                    +", "+DbConfigs.TableAccount.USER_ID +", "+DbConfigs.TableAccount.BALANCE_AMOUNT +", "
                    +DbConfigs.TableAccount.ACCOUNT_STATUS +", "+DbConfigs.TableAccount.BRANCH_ID +", "
                    +DbConfigs.TableAccount.ACCOUNT_NUMBER +")"
                    + " values ("+account.getAccount_type_id()+", "+account.getUser_id()+", "+account.getBalance()+", '"+account.getAccount_status()+"', "+account.getBranch_id()+", DEFAULT)");
            

            hasAccountBeenSet = (affectedRows > 0);

            statement.close();
            conn.close();

        }catch(SQLException se){
            //Handle errors for JDBC
        	System.out.println("insert into "
                    +DbConfigs.TableAccount.TABLE_NAME+ " ("+DbConfigs.TableAccount.ACCCOUNT_TYPE
                    +", "+DbConfigs.TableAccount.USER_ID +", "+DbConfigs.TableAccount.BALANCE_AMOUNT +", "
                    +DbConfigs.TableAccount.ACCOUNT_STATUS +", "+DbConfigs.TableAccount.BRANCH_ID +", "
                    +DbConfigs.TableAccount.ACCOUNT_NUMBER +")"
                    + " values ("+account.getAccount_type_id()+", "+account.getUser_id()+", "+account.getBalance()+", '"+account.getAccount_status()+"', "+account.getBranch_id()+", 'DEFAULT')");

            se.printStackTrace();
        }catch(Exception ex) {
            LogMessages.log(ex.getMessage());
        }finally{
            closeDbResources();
        }
        return hasAccountBeenSet;
    }
    
    public ArrayList<Account> searchAccounts(String query) {
        
        
    	ArrayList<Account> listOfSearchedAccounts = new ArrayList<>();
    	
    	try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
            
            ResultSet result = statement.executeQuery("SELECT TOP (5) * FROM "+DbConfigs.TableAccount.VIEW_NAME+" where "+DbConfigs.TableAccount.ACCOUNT_NUMBER
            		+" like concat('%', TRY_CONVERT(uniqueidentifier,'"+query+"'), '%' ) order by "+DbConfigs.TableAccount.DATE_ADDED);
            
            while(result.next()) {
                
            	listOfSearchedAccounts.add(new Account(result.getInt(DbConfigs.TableAccount._ID),
	            			result.getString(DbConfigs.TableAccountType.ACCOUNT_NAME),
	            			result.getString(DbConfigs.TableUsers.ID_NUMBER),
	            			result.getString(DbConfigs.TableUsers.F_NAME) + " " +result.getString(DbConfigs.TableUsers.L_NAME),
	            			result.getDouble(DbConfigs.TableAccount.BALANCE_AMOUNT),
	            			result.getString(DbConfigs.TableAccount.ACCOUNT_NUMBER),
	            			result.getString(DbConfigs.TableAccount.ACCOUNT_STATUS),
	            			result.getString(DbConfigs.TableBankBranch.BRANCH_NAME),
	            			result.getString(DbConfigs.TableAccount.DATE_ADDED)
            			));
                
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
    	
    	return listOfSearchedAccounts;
    }
    
    public ArrayList<Account> getListOfAllAccounts() {
        
        
    	ArrayList<Account> listOfAllAccounts = new ArrayList<>();
    	
    	try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
            
            ResultSet result = statement.executeQuery("SELECT * FROM "+DbConfigs.TableAccount.VIEW_NAME+" order by "+DbConfigs.TableAccount.DATE_ADDED);
            
            while(result.next()) {
                
            	listOfAllAccounts.add(new Account(result.getInt(DbConfigs.TableAccount._ID),
            			result.getString(DbConfigs.TableAccountType.ACCOUNT_NAME),
            			result.getString(DbConfigs.TableUsers.ID_NUMBER),
            			result.getString(DbConfigs.TableUsers.F_NAME) + " " +result.getString(DbConfigs.TableUsers.L_NAME),
            			result.getDouble(DbConfigs.TableAccount.BALANCE_AMOUNT),
            			result.getString(DbConfigs.TableAccount.ACCOUNT_NUMBER),
            			result.getString(DbConfigs.TableAccount.ACCOUNT_STATUS),
            			result.getString(DbConfigs.TableBankBranch.BRANCH_NAME),
            			result.getString(DbConfigs.TableAccount.DATE_ADDED)
        			));
                
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
    	
    	return listOfAllAccounts;
    }
    
    
    public boolean suspendAccount() {
        
    	return updateAccountStatus(AccountStatus.SUSPENDED);
    }
    
    public boolean activateAccount() {
        
    	return updateAccountStatus(AccountStatus.ACTIVE);
    }
    
    
}
