/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp.utilities;

/**
 *
 * @author dgitonga
 */
public class User {
    
    private String f_name, l_name, email, phone_no, national_id, user_role;
    private int user_id;

    public User(int user_id, String f_name, String l_name, String email, String phone_no, String national_id, String user_role) {
        this.user_id = user_id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.phone_no = phone_no;
        this.national_id = national_id;
        this.user_role = user_role;
    }
    
    public int getUser_id() {
        return user_id;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public String getNational_id() {
        return national_id;
    }

    public String getUser_role() {
        return user_role;
    }

    
    
}
