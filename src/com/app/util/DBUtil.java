package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	private static Connection conn = null;
	
	static
	{
			try{
			      Class.forName("com.mysql.jdbc.Driver");

			      String DB_URL = "jdbc:mysql://localhost/KodingApp";
			      String USER = "";
			      String PASS = "";
			      
			      System.out.println("Connecting to database...");
			      conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);

			   }catch(Exception e){
			      e.printStackTrace();
			   }finally{
			   }
	}
	
	protected static Connection getConnection(){
		return conn;
	}
	

}
