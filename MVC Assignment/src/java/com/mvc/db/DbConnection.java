package com.mvc.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static Connection sqlConnection(){
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mvc", "root", "");
         return con;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
