package com.app.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class DBConnectionUtil {
	
	public static void initDB(){
		
		Statement stmt;Connection conn;
		
		try{
		      Class.forName("com.mysql.jdbc.Driver");

		      String DB_URL = "";
		      String USER = "";
		      String PASS = "";
		      
		      System.out.println("Connecting to database...");
		      conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);

		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String sql;
//		      sql = "SELECT id, first, last, age FROM Employees";
//		      ResultSet rs = stmt.executeQuery(sql);
//
//		      while(rs.next()){
//		         //Retrieve by column name
//		         int id  = rs.getInt("id");
//		         int age = rs.getInt("age");
//		         String first = rs.getString("first");
//		         String last = rs.getString("last");
//
//		         //Display values
//		         System.out.print("ID: " + id);
//		         System.out.print(", Age: " + age);
//		         System.out.print(", First: " + first);
//		         System.out.println(", Last: " + last);
//		      }
//		      //STEP 6: Clean-up environment
//		      rs.close();
		      stmt.close();
		      conn.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		   }
		   System.out.println("Goodbye!");
	}
	
	
	
}
