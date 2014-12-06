package com.app.util;

import java.sql.ResultSet;

import com.app.util.AppConstants.Users;
import com.mysql.jdbc.PreparedStatement;

public class AppUtil {
	
	public static void main(String[] args) {
		
	}

	public static int checkForUserAvailability(String email, String password) throws Exception {
		
		int loginState = 0;
		
		PreparedStatement pre = QueryUtil.getUserTableSelectWithEmail(email);
		
		ResultSet rs = pre.executeQuery();
		
		while(rs.next()){
			if( (rs.getString("password")).equals(password) ){
			}
		}
	
		
		
		return 0;
	}

}
