/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp.Dao.User_Dao;

import com.penguins.bankingsystemerp.Dao.DbConfigs;
import com.penguins.bankingsystemerp.utilities.*;
import java.sql.*;


/**
 *
 * 
 * @author dgitonga
 */
public class SuperDao {
    private String user_detail;
    protected Connection conn = null;
    protected Statement statement = null;

    //@param user_detail - can be email, phone number or id or national id 
    public SuperDao(String user_detail) {
        this.user_detail = user_detail;
    }
    
    
    
    public boolean authenticateUser(String password) {
        
        boolean isQueryExecutionSuccessful = false;
        try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);
            
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select id from "+DbConfigs.TableUsers.TABLE_NAME+" where "
                    +DbConfigs.TableUsers.EMAIL +" = '"+user_detail+"' and "+DbConfigs.TableUsers.USER_PASSWORD+" = '"+password+"'"
                    + " or "+DbConfigs.TableUsers.PHONE_NO+" = '"+user_detail+"' and "+DbConfigs.TableUsers.USER_PASSWORD+" = '"+password+"' "
                    + " or "+DbConfigs.TableUsers.ID_NUMBER+" = '"+user_detail+"' and "+DbConfigs.TableUsers.USER_PASSWORD+" = '"+password+"'");
            
            //check if we got any data else return false
            if(resultSet.next() != false) {
                isQueryExecutionSuccessful = true;
            }
            
            resultSet.close();
            statement.close();
            conn.close();
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
            LogMessages.log("sql-authentication error");
            LogMessages.log(se.getMessage());
        }catch(Exception ex) {
            LogMessages.log("authentication error");
            LogMessages.log(ex.getMessage());
        }finally{
            closeDbResources();
        }
        
        return isQueryExecutionSuccessful;
    }
    
    public User getUserDetails() {
        User user = null;
        try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
            
            ResultSet result = statement.executeQuery("select * from "+DbConfigs.TableUsers.TABLE_NAME+" where "+DbConfigs.TableUsers.EMAIL +" = '"+user_detail+"' "
                    + " or "+DbConfigs.TableUsers.PHONE_NO+" = '"+user_detail+"' or "+DbConfigs.TableUsers.ID_NUMBER+" = '"+user_detail+"'");
            
            while(result.next()) {
                
                user = new User(result.getInt(DbConfigs.TableUsers._ID),
                        result.getString(DbConfigs.TableUsers.F_NAME),
                        result.getString(DbConfigs.TableUsers.L_NAME),
                        result.getString(DbConfigs.TableUsers.EMAIL),
                        result.getString(DbConfigs.TableUsers.PHONE_NO),
                        result.getString(DbConfigs.TableUsers.ID_NUMBER),
                        result.getString(DbConfigs.TableUsers.USER_ROLE));
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
        
        return user;
        
    } 
    
    public boolean resetPassword(String new_password) {
        
        boolean hasPasswordBeenReset = false;
        try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
            
            int affectedRows = statement.executeUpdate("update "+DbConfigs.TableUsers.TABLE_NAME+" set "+DbConfigs.TableUsers.USER_PASSWORD +" = '"+new_password+"'"
                    + " where "+DbConfigs.TableUsers.EMAIL +" = '"+user_detail+"' or "+DbConfigs.TableUsers.PHONE_NO
                    +" = '"+user_detail+"' or "+DbConfigs.TableUsers.ID_NUMBER+" = '"+user_detail+"'");
            
            hasPasswordBeenReset = (affectedRows > 0);
            
            statement.close();
            conn.close();
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception ex) {
            
        }finally{
            closeDbResources();
        }
        
        return hasPasswordBeenReset;
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
