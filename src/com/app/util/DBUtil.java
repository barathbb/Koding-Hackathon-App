package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class DBUtil {
	
	private static Connection conn;
	
	static
	{
			Statement stmt; Connection conn = null;
			
			try{
			      Class.forName("com.mysql.jdbc.Driver");

			      String DB_URL = "jdbc:mysql://localhost/KodingApp";
			      String USER = "";
			      String PASS = "";
			      
			      System.out.println("Connecting to database...");
			      conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);

			      System.out.println("Creating statement...");
			      stmt = conn.createStatement();
			      String sql;
//			      sql = "SELECT id, first, last, age FROM Employees";
//			      ResultSet rs = stmt.executeQuery(sql);
	//
//			      while(rs.next()){
//			         //Retrieve by column name
//			         int id  = rs.getInt("id");
//			         int age = rs.getInt("age");
//			         String first = rs.getString("first");
//			         String last = rs.getString("last");
	//
//			         //Display values
//			         System.out.print("ID: " + id);
//			         System.out.print(", Age: " + age);
//			         System.out.print(", First: " + first);
//			         System.out.println(", Last: " + last);
//			      }
//			      //STEP 6: Clean-up environment
//			      rs.close();
			      stmt.close();
			      conn.close();
			   }catch(Exception e){
			      e.printStackTrace();
			   }finally{
			   }
			   System.out.println("Goodbye!");
	}
	
	public static Connection getConnection(){
		return conn;
	}

	

}
