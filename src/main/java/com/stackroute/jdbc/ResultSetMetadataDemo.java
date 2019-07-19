package com.stackroute.jdbc;

import java.sql.*;

public class ResultSetMetadataDemo {
    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Root@123");
        Statement statement=connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from EmployeeID");
        ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
        System.out.println(resultSetMetaData.getColumnCount());
        System.out.println(resultSetMetaData.getColumnClassName(1));
        System.out.println(resultSetMetaData.getCatalogName(1));


    }
    }
