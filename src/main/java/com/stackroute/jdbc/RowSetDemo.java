package com.stackroute.jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.sun.rowset.JdbcRowSetImpl;

public class RowSetDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Root@123");
//      Statement statement=connection.createStatement();
//      ResultSet resultSet = statement.executeQuery("Select * from EmployeeID");
        JdbcRowSet rowSet =  new JdbcRowSetImpl(connection);
      /*  rowSet.setUrl("jdbc:mysql://localhost:3306/mydb");
        rowSet.setUsername("root");
        rowSet.setPassword("Root@123");*/

        rowSet.setCommand("select * from EmployeeID");
        rowSet.execute();
        rowSet.addRowSetListener(new ActionClass());



        while (rowSet.next()) {

            System.out.println("Id: " + rowSet.getInt(1));
            System.out.println("Name: " + rowSet.getString(2));
            System.out.println("Age: " + rowSet.getInt(3));
        }

    }

}

