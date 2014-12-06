package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class DBUtil {
	
	private static Connection conn = null;
	
	static
	{
			try{
			      Class.forName("com.mysql.jdbc.Driver");

			      String DB_URL = "jdbc:mysql://localhost/KodingApp";
			      String USER = "root";
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
	
	protected static void closeConnection() throws Exception {
		conn.close();
	}
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(getConnection().toString());
		
		closeConnection();
		
	}

	
}
