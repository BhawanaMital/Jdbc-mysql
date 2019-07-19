package com.stackroute.jdbc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args)
    {
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        System.out.println("Employee Details------");
        simpleJdbcDemo.getEmployeeDetails();
        System.out.println("----------Employee details in reverse.");
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        System.out.println("Employee Details From Second Row In Reverse...... ");
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        System.out.println("EmployeeDetailsByNameAndGender,,,,,");
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("bhawana","f");
    }
}
