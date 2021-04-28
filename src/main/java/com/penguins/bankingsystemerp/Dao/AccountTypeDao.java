package com.penguins.bankingsystemerp.Dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;

import com.penguins.bankingsystemerp.utilities.AccountType;
import com.penguins.bankingsystemerp.utilities.LogMessages;


public class AccountTypeDao {
	

	private Connection conn = null;
	private Statement statement = null;

    public ArrayList<AccountType> getListOfAccountTypes() {
    	//select id, account_name from account_type
    	
    			
    	ArrayList<AccountType> listOfAccountTypes = new ArrayList<>();
    	
    	try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
            
            ResultSet result = statement.executeQuery("SELECT "+DbConfigs.TableAccountType._ID+","+DbConfigs.TableAccountType.ACCOUNT_NAME+" FROM "
            		+DbConfigs.TableAccountType.TABLE_NAME+" order by "+DbConfigs.TableAccountType.ACCOUNT_NAME);
            
            while(result.next()) {
                
            	listOfAccountTypes.add(new AccountType(
            				result.getInt(DbConfigs.TableAccountType._ID),
            				result.getString(DbConfigs.TableAccountType.ACCOUNT_NAME)
            			));
                
            }
            
            result.close();
            statement.close();
            conn.close();
            
        }catch(SQLException ex){
            //Handle errors for JDBC
        	System.out.println(ex);
        }catch(Exception ex) {
        	System.out.println(ex);
        }finally{
            closeDbResources();
        }
    	
    	return listOfAccountTypes;
    	
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
