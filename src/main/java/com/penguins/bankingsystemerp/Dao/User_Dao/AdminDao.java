/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp.Dao.User_Dao;

import com.penguins.bankingsystemerp.Dao.DbConfigs;
import com.penguins.bankingsystemerp.utilities.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author dgitonga
 */
public class AdminDao extends SuperDao{

    public AdminDao(String user_detail) {
        super(user_detail);
    }
    
    public boolean login(String password) {
        //authenticate user then check if is admin
        if(authenticateUser(password)) {
            
            return (getUserDetails().getUser_role().toLowerCase().equals(UserRoles.ADMIN.toLowerCase()));
        }
        return false;
    }
    
    public boolean registerNewUser(User user) {
        
        //first check if user exists
        boolean hasPasswordBeenReset = false;
        User new_user = getUserDetails();
        if(new_user == null){
            
            //set user
            try{
            
                Class.forName(DbConfigs.JDBC_DRIVER);            
                conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
                statement = conn.createStatement();
        
                int affectedRows = statement.executeUpdate("insert into "
                        +DbConfigs.TableUsers.TABLE_NAME+ " ("+DbConfigs.TableUsers.F_NAME
                        +", "+DbConfigs.TableUsers.L_NAME +", "+DbConfigs.TableUsers.EMAIL +", "
                        +DbConfigs.TableUsers.USER_PASSWORD +", "+DbConfigs.TableUsers.PHONE_NO +", "
                        +DbConfigs.TableUsers.ID_NUMBER +", "+DbConfigs.TableUsers.USER_ROLE +")"
                        + " values ('"+user.getF_name()+"', '"+user.getL_name()+"', '"+user.getEmail()+"', '"+user.getPassword()+"', '"+user.getPhone_no()+"', '"
                        +user.getNational_id()+"', '"+user.getUser_role()+"')");
                

            	hasPasswordBeenReset = (affectedRows > 0);

                statement.close();
                conn.close();

            }catch(SQLException ex){
                //Handle errors for JDBC
                ex.printStackTrace();
            	System.out.println("sql exception");
            	System.out.println(ex);
            }catch(Exception ex) {
                LogMessages.log(ex.getMessage());
            	System.out.println("general exception");
            	System.out.println(ex);
            }finally{
                closeDbResources();
            }

        }
        return hasPasswordBeenReset;
    }
    
    public boolean updateUserInfo (User user) {
        
        
        boolean hasPasswordBeenReset = false;
        try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
            int affectedRows = statement.executeUpdate("update "+DbConfigs.TableUsers.TABLE_NAME+" set "
                    +DbConfigs.TableUsers.F_NAME +" = '"+user.getF_name()+"',"
                    +DbConfigs.TableUsers.L_NAME +" = '"+user.getL_name()+"',"
                    +DbConfigs.TableUsers.EMAIL +" = '"+user.getEmail()+"',"
                    +DbConfigs.TableUsers.PHONE_NO +" = '"+user.getPhone_no()+"',"
                    +DbConfigs.TableUsers.USER_ROLE +" = '"+user.getUser_role()+"'"
                    + " where "+DbConfigs.TableUsers._ID+" = '"+user.getUser_id()+"'");
            
            hasPasswordBeenReset = (affectedRows > 0);
            
            statement.close();
            conn.close();
            
        }catch(SQLException ex){
            //Handle errors for JDBC
        	System.out.println("sql exception");
        	System.out.println(ex);
        }catch(Exception ex) {

        	System.out.println("general exception");
        	System.out.println(ex);
        }finally{
            closeDbResources();
        }
        
        return hasPasswordBeenReset;
    }
    
    
    public ArrayList<User> getListOfUsers() {
        
        ArrayList<User> listOfAllUser = new ArrayList<>();
        try{
            
            Class.forName(DbConfigs.JDBC_DRIVER);            
            conn = DriverManager.getConnection(DbConfigs.DB_URL, DbConfigs.USER, DbConfigs.PASS);            
            statement = conn.createStatement();
            
            ResultSet result = statement.executeQuery("select * from "+DbConfigs.TableUsers.TABLE_NAME+" order by "+DbConfigs.TableUsers.DATE_ADDED);
            
            while(result.next()) {
                
                listOfAllUser.add(new User(result.getInt(DbConfigs.TableUsers._ID),
                        result.getString(DbConfigs.TableUsers.F_NAME),
                        result.getString(DbConfigs.TableUsers.L_NAME),
                        result.getString(DbConfigs.TableUsers.EMAIL),
                        result.getString(DbConfigs.TableUsers.PHONE_NO),
                        result.getString(DbConfigs.TableUsers.ID_NUMBER),
                        result.getString(DbConfigs.TableUsers.USER_ROLE)));
                
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
        return listOfAllUser;
    }
    
}
