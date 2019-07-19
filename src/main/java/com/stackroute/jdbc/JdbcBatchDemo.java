package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcBatchDemo {

    public static void main(String arg[]) throws Exception {


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Root@123");
        connection.setAutoCommit(false);

        Statement statement=connection.createStatement();
        statement.addBatch("insert into EmployeeID values(1,'moup',50,'female')");
        statement.addBatch("insert into EmployeeID values(2,'moupli',51,'Male')");
        statement.executeBatch();
        connection.commit();
        connection.close();

}
}

