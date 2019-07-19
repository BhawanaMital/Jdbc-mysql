package com.stackroute.jdbc;
import java.sql.ResultSetMetaData;
import java.sql.*;

public class DatabaseMetadataDemo {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Root@123");

            DatabaseMetaData dmb=connection.getMetaData();
            //DatabaseMetaData dmb=connection.getMetaData();


            System.out.println("Driver Name:"+dmb.getDriverName());
            System.out.println("Driver Version:"+dmb.getDriverVersion());
            System.out.println("UserName:"+dmb.getUserName());
            System.out.println("Database Product Name:"+dmb.getDatabaseProductName());
            System.out.println("Database Product Version:"+dmb.getDatabaseProductVersion());

            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//package com.stackroute.jdbc;
//
//import java.sql.*;
//
//public class DatabaseMetadataDemo {
//
//    public static void main(String args[]){
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            Connection con=DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/mydb","root","Root@123");
//            DatabaseMetaData dbmd=con.getMetaData();
//
//            System.out.println("Driver Name: "+dbmd.getDriverName());
//            System.out.println("Driver Version: "+dbmd.getDriverVersion());
//            System.out.println("UserName: "+dbmd.getUserName());
//            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
//            System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());
//
//        }catch(Exception e){ System.out.println(e);}
//    }
//}