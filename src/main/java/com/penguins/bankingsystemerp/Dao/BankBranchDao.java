package com.penguins.bankingsystemerp.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.penguins.bankingsystemerp.utilities.BankBranch;

public class BankBranchDao {

	private Connection conn = null;
	private Statement statement = null;
	
    public ArrayList<BankBranch> getBranchList() {
    	//select id, branch_name from bank_branch
    	ArrayList<BankBranch> listOfBankBranches = new ArrayList<>();
    	
    	try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
            
            ResultSet result = statement.executeQuery("SELECT "+DbConfigs.TableBankBranch._ID+","+DbConfigs.TableBankBranch.BRANCH_NAME+" FROM "
            		+DbConfigs.TableBankBranch.TABLE_NAME+" order by "+DbConfigs.TableBankBranch.BRANCH_NAME);
            
            while(result.next()) {
                
            	listOfBankBranches.add(new BankBranch(
            				result.getInt(DbConfigs.TableBankBranch._ID),
            				result.getString(DbConfigs.TableBankBranch.BRANCH_NAME)
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
    	
    	return listOfBankBranches;
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
