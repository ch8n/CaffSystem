package cafesys;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
/**
 *
 * @author JavaM
 */
public class Connect {
    String driver = "com.mysql.jdbc.Driver";
    String url= "jdbc:mysql://localhost:3306/project";
    
    Connection con;
    public Connect()
    {
        try
        {
            Class.forName(driver);
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("Unable to load the driver");
        }
        try
        {
            con = DriverManager.getConnection(url, "root", "");
            System.out.println("Succesfully connected to the database");
        }
        catch(SQLException ex)
        {
            System.out.println("unable to connect to the database");
        }
    }
    public Connection getConnect ()
    {
        return con;
    }
}
