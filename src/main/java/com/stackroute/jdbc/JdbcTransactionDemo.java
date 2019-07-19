package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTransactionDemo {

    public static void main(String arg[]) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Root@123");
        connection.setAutoCommit(false);

        Statement statement = connection.createStatement();
        statement.addBatch("insert into EmployeeID values(1,'megna',52,'male')");
        statement.addBatch("insert into EmployeeID values(2,'moudu',55,'female')");
        statement.executeBatch();

        System.out.println("Do you want to commit or rollback ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.next().equals("commit")) {
            connection.commit();
        } else {
            connection.rollback();
        }


        connection.close();
    }
}
