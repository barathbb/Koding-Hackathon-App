/*$Id$*/
package com.app.util;

import com.mysql.jdbc.PreparedStatement;

public class QueryUtil {
	
	public static PreparedStatement getUserTableSelect() throws Exception {
		PreparedStatement pre = (PreparedStatement) DBUtil.getConnection().prepareStatement("select * from users");
		return pre;
	}
	
	public static PreparedStatement getUserTableSelectWithEmailEquals(String email) throws Exception {
		PreparedStatement pre = (PreparedStatement) DBUtil.getConnection().prepareStatement("select * from users where email = ?" );
		pre.setString(1, email);
		return pre;
	}
	
	public static PreparedStatement getPostTable() throws Exception{
		PreparedStatement pre = (PreparedStatement) DBUtil.getConnection().prepareStatement("select * from posts");
		return pre;
	}
	
	public static PreparedStatement getPostTableWithPostIdEquals(long postid) throws Exception{
		PreparedStatement pre = (PreparedStatement) DBUtil.getConnection().prepareStatement("select * from posts where postid = ?");
		pre.setLong(1, postid);
		return pre;
	}
	

}
