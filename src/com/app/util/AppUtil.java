package com.app.util;

import java.sql.ResultSet;

import com.app.component.User;
import com.app.util.AppConstants.PostState;
import com.app.util.AppConstants.Users;
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

	public static void updatePostStatus(User loginUser, long postID, int toStatus) throws Exception {
		
		PreparedStatement pre = QueryUtil.getUpdatePostSetStatusWithPostID(toStatus, postID); 
		pre.execute();
		
	}

	public static int getPostStatusForUser(User loginUser) throws Exception{
		
		if(loginUser == null)		
				return 0;
		
		switch(loginUser.getRole())
		{
		
		case UserConstants.REVIEWER:
			return PostState.CREATED.getState();
			
		case UserConstants.DEPARTMENT_ADMIN:
			return PostState.REVIEWED.getState();
			
		case UserConstants.DEPARTMENT_WORKER:
			return PostState.ASSIGNED.getState();
				
		case UserConstants.END_USER:
		case UserConstants.SUPER_ADMIN:
			return -1;
		
		default:
			return 0;
		
		}
	
	}
	
	
	
	
	
	

}
