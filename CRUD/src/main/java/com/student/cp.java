package com.student;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class cp {
    static Connection con;

    public static Connection createConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String user = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/CRUD";

            con = DriverManager.getConnection(url, user, password);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
