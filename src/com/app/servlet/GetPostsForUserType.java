package com.app.servlet;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.component.User;
import com.app.util.AppUtil;
import com.app.util.ComponentUtil;
import com.app.util.QueryUtil;
import com.mysql.jdbc.PreparedStatement;

public class GetPostsForUserType extends HttpServlet{

	private static final long serialVersionUID = -7221212623591047395L;


	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		doPost(req, resp);
	}
	
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		try {
		
			User loginUser = (User) req.getSession().getAttribute("user");
		
			int requiredStatus = AppUtil.getPostStatusForUser(loginUser);
			
			PreparedStatement pre;
			
			
			switch (requiredStatus) {
			case -1:
				pre = QueryUtil.getPostTable();
				break;
				
			case 0:
				pre = null;
				resp.sendRedirect("error");
				break;
				
			default:
				pre = QueryUtil.getPostTableWithStatusEquals(requiredStatus);
				break;
			}
			
			ResultSet rs = pre.executeQuery();
			
			req.setAttribute("posts", ComponentUtil.fillPosts(rs));
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
}
