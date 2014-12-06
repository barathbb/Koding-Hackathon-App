/*$Id$*/
package com.app.util;

import com.app.component.Post;
import com.app.component.User;
import com.app.util.AppConstants.PostState;
import com.app.util.AppConstants.Users;
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

	public static PreparedStatement getUpdatePostSetStatusWithPostID(int toStatus, long postID) throws Exception {
		PreparedStatement pre = (PreparedStatement) DBUtil.getConnection().prepareStatement("update table posts set status = ? where postid = ?");
		pre.setLong(2, postID);
		pre.setInt(1, toStatus);
		return pre;
	}

	public static PreparedStatement getPostTableWithStatusEquals(int status) throws Exception {
		PreparedStatement pre = (PreparedStatement) DBUtil.getConnection().prepareStatement("select * from posts where status = ?");
		pre.setLong(1, status);
		return null;
	}

	public static PreparedStatement getAddUserQuery(String username, String email, String password, String locality) throws Exception {
		PreparedStatement pre = (PreparedStatement) DBUtil.getConnection().prepareStatement("insert into users(UserName,EmailId,Password,Role,Locality) values (?,?,?,?,?)");
		pre.setString(1, username);
		pre.setString(3, password);
		pre.setInt(4, Users.END_USER.getIntValue());/**Constant since only end users can create**/
		pre.setString(5, locality);
		pre.setString(2, email);
//		pre.setLong(1, status);
		return pre;
	}

	public static PreparedStatement getAddPostQuery(String title, String description, String image, String locality, long department, long ownerid) throws Exception {
		PreparedStatement pre = (PreparedStatement) DBUtil.getConnection().prepareStatement("insert into Posts(PostTitle,PostDescription,Image,Locality,Department,OwnerId, Status) values (?,?,?,?,?,?,?)");
		pre.setString(1, title);
		pre.setString(2, description);
		pre.setString(3, image);
		pre.setString(4, locality);
		pre.setLong(5, department);
		pre.setLong(6, ownerid);
		pre.setInt(7, PostState.CREATED.getState());
		return null;
	}
	
	public static PreparedStatement getUpdatePostQuery(String title, String description, String image, String locality, long department, long postid) throws Exception {
		PreparedStatement pre = (PreparedStatement) DBUtil.getConnection().prepareStatement("update Posts set PostTitle = ? ,PostDescription = ? ,Image = ?, Locality = ? ,Department = ?) where PostId = ?");
		pre.setString(1, title);
		pre.setString(2, description);
		pre.setString(3, image);
		pre.setString(4, locality);
		pre.setLong(5, department);
		pre.setLong(6, postid);
		return null;
	}
	
	public static PreparedStatement getUsersTableWithUserNameEquals(String username)  throws Exception {
		PreparedStatement pre = (PreparedStatement) DBUtil.getConnection().prepareStatement("select * from users where UserName = ?");
		pre.setString(1, username);
		return pre;
	}

	public static PreparedStatement getUsersTableWithEmailIdEquals(String email)  throws Exception {
		PreparedStatement pre = (PreparedStatement) DBUtil.getConnection().prepareStatement("select * from users where EmailId = ?");
		pre.setString(1, email);
		return pre;
	}

}
