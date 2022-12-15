/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    
        private static String url="jdbc:mysql://localhost:3306/alphaphoneshop?autoReconnect=true&useSSL=false";
        private static String user="root";
        private static String pass="root"; 
        private static Connection con;
                
        public static Connection connectDB(){
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                con=DriverManager.getConnection(url, user, pass);
                System.out.println("Connetion success");
            }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
                System.out.println(e.getMessage());
            }
            return con;
            
        }
}






