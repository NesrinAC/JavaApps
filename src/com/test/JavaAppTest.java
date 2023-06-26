package com.test;

import java.util.Scanner;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class JavaAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a,b;
		//Print name
		System.out.println("Hello");
		System.out.println("Nesrin A C");
		
		//Number calculations
		a=74;b=36;
		System.out.println(a+b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(a-b);
		System.out.println(-5+8*6);
		
		//Input two number
		Scanner in =new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int num1=in.nextInt();
		System.out.println("Enter 2nd Number: ");
		int num2=in.nextInt();		
		System.out.println("Total :"+ (num1+num2));
		
		//multiplication
		int m1=8;
		for(int i=1;i<=10;i++)
		{
			System.out.println(m1 +"*"+ i+"="+(m1*i));
		}*/
		String url = "jdbc:ucanaccess://C://Users//KVZLPT70//DB//EmployeePortal.accdb";
		
		try {
			java.util.Date currentDate = new java.util.Date();
            // Convert java.util.Date to java.sql.Date
            java.sql.Date sqlDate = new java.sql.Date(currentDate.getTime());
            
			Connection con=DriverManager.getConnection(url);
			System.out.println("Connected");
			 String sql = "INSERT INTO StaffMaster (EmpName, EmpAddress, EmpMobile,EmpAge,EmpDOB,EmpSalary,EmpEmail) VALUES (?,?,?,?,?,?,?)";             
	            PreparedStatement preparedStatement = con.prepareStatement(sql);
	            preparedStatement.setString(1, "Jim Jow");
	            preparedStatement.setString(2, "ABCD");
	            preparedStatement.setString(3, "0919989998");
	            preparedStatement.setInt(4, 25);
	            preparedStatement.setDate(5,sqlDate);
	            preparedStatement.setInt(6, 50000);
	            preparedStatement.setString(7, "rohnjoe@herbalife.com");	         
	            int row = preparedStatement.executeUpdate();
	             
	            if (row > 0) {
	                System.out.println("A row has been inserted successfully.");
	            }
	             
	            
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
		
				
		
		
		
		
	}

}
