/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penguins.bankingsystemerp.Dao;

/**
 *
 * @author dgitonga
 */
public final class DbConfigs {
    
    
   // JDBC driver name and database URL
   public static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
   public static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=banking_system_demo";

   //  Database credentials
   public static final String USER = "sa";
   public static final String PASS = "Ftk@2021";
   
   /*
   *all tables and their corresponding column names
   *check base column interface for base columns.
   */

    public static final class TableUsers implements BaseColumns {
        
        public static final String TABLE_NAME = "[banking_system_demo].[dbo].users";
        public static final String F_NAME = "f_name";
        public static final String L_NAME = "l_name";
        public static final String EMAIL = "email";
        public static final String USER_PASSWORD = "user_password";
        public static final String PHONE_NO = "phone_number";
        public static final String ID_NUMBER = "id_number";
        public static final String USER_ROLE = "user_role";
    }
    public static final class TableAccount implements BaseColumns {
        public static final String TABLE_NAME = "[banking_system_demo].[dbo].Account";
        public static final String VIEW_NAME = "[banking_system_demo].[dbo].User_Account_View";
        public static final String ACCOUNT_NUMBER = "account_number";
        public static final String ACCCOUNT_TYPE = "account_type";
        public static final String BALANCE_AMOUNT = "balance_amount";
        public static final String ACCOUNT_STATUS = "account_status";
        public static final String BRANCH_ID = "branch_id";
    }
    public static final class TableTransactions implements BaseColumns {
        public static final String TABLE_NAME = "[banking_system_demo].[dbo].transactions";
        public static final String VIEW_NAME = "[banking_system_demo].[dbo].transactions_view";
        public static final String ACCOUNT_NUMBER = "account_number";
        public static final String TRANSACTION_TYPE = "transaction_type";
        public static final String TRANSACTION_CODE = "transaction_code";
        public static final String AMOUNT = "amount";
        public static final String TRANSFERED_TO = "transfered_to_account_no";
    }
    public static final class TableAccountType implements BaseColumns {
        public static final String TABLE_NAME = "[banking_system_demo].[dbo].account_type";
        public static final String ACCOUNT_NAME = "account_name";
    }
    public static final class TableBankBranch implements BaseColumns {
        public static final String TABLE_NAME = "[banking_system_demo].[dbo].bank_branch";
        public static final String BRANCH_NAME = "branch_name";
    }
    public static final class TableSecurityAnswers implements BaseColumns {
        public static final String TABLE_NAME = "[banking_system_demo].[dbo].security_user_answers";
        public static final String QUESTION_ID = "question_id";
        public static final String ANSWER = "answer";
    }
    public static final class TableSecurityQuestions implements BaseColumns {
        public static final String TABLE_NAME = "[banking_system_demo].[dbo].login_security_questions";
        public static final String QUESTION = "question";
    }
    
}
