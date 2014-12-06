package com.app.util;

import java.sql.ResultSet;

import com.app.component.User;
import com.mysql.jdbc.PreparedStatement;

public class AppUtil {
	
	public static int checkForUserAvailability(String email, String password) throws Exception {
		
		int loginState = 0;
		
		PreparedStatement pre = QueryUtil.getUserTableSelectWithEmailEquals(email);
		
		ResultSet rs = pre.executeQuery();
		
		if(rs == null){
			loginState = AppConstants.EMAIL_NOT_EXIST;
		}
		
		while(rs.next()){
			if( (rs.getString("password")).equals(password) ){
				loginState = AppConstants.VALID_USER;
			}
			else{
				loginState = AppConstants.WRONG_PASSW0RD;
			}
				
		}
		
		return loginState;
	}

	public static User getUserForSession(String email) throws Exception{
		
		PreparedStatement pre = QueryUtil.getUserTableSelectWithEmailEquals(email);
		
		ResultSet rs = pre.executeQuery();
		
		return ComponentUtil.fillUser(rs);
		
	}

}
