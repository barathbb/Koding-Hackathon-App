package com.app.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.component.Post;
import com.app.util.ComponentUtil;
import com.app.util.QueryUtil;
import com.mysql.jdbc.PreparedStatement;

public class HomePage extends HttpServlet {
	
	private static final long serialVersionUID = -8935093602516997838L;

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
		
		try{
		PreparedStatement pre = QueryUtil.getPostTable();
		
		ResultSet rs = pre.executeQuery();

		List<Post> posts = ComponentUtil.fillPosts(rs);
		
		req.setAttribute("posts", posts);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

}
