package com.app.util;

import java.sql.ResultSet;
import java.util.Collections;
import java.util.List;

import com.app.component.Post;
import com.app.component.User;

public class ComponentUtil {

	public static List<Post> fillPosts(ResultSet rs) throws Exception {
		
		List<Post> posts = Collections.emptyList(); Post post = null;
		
		if(rs == null){
			return posts;
		}
		
		while(rs.next()){
			
			//Fill it here
			
		}
		
		return posts;
	}

	public static User fillUser(ResultSet rs) throws Exception {
		User user = null;
		
		if(rs == null){
			return new User();
		}
		
		while(rs.next()){
			
			//Fill it here
			
			
		}
		
		return user;
	}

}
