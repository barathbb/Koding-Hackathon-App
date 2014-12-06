package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.util.QueryUtil;
import com.mysql.jdbc.PreparedStatement;

public class CheckUserNameAction extends HttpServlet {

	private static final long serialVersionUID = -7111089485619118486L;

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = (String) req.getParameter("username");
		
		try{
		
		PreparedStatement pre = QueryUtil.getUsersTableWithUserNameEquals(username);
		
		boolean exists = pre.executeQuery() != null;
		
		}
		catch(Exception e){
			
		}
		
		resp.getWriter().write("True");
		
	}
	

}
