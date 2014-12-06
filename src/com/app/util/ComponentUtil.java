package com.app.util;

import java.sql.ResultSet;
import java.util.List;

import com.app.component.Post;

public class ComponentUtil {

	public static List<Post> fillPosts(ResultSet rs) throws Exception {
		
		List<Post> posts; Post post;
		
		while(rs.next()){
			
			//Fill it here
			
		}
		
		return null;
	}

}
