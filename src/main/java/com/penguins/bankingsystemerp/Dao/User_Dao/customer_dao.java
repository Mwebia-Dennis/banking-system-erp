/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp.Dao.User_Dao;

import com.penguins.bankingsystemerp.utilities.UserRoles;

/**
 *
 * @author dgitonga
 */
public class customer_dao extends SuperDao{
    
    public customer_dao(String user_detail) {
        super(user_detail);
    }
    
    public boolean login(String password) {
        //authenticate user then check if is customer
        if(authenticateUser(password)) {
            
            return (getUserDetails().getUser_role().equals(UserRoles.CUSTOMER));
        }
        return false;
        
    }
    
    
}
