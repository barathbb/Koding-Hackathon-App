package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.util.QueryUtil;
import com.mysql.jdbc.PreparedStatement;

public class SignupAction extends HttpServlet {

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		
		try{
		String username = (String) req.getParameter("username");
		
		String email = (String) req.getParameter("email");
		
		String password = (String) req.getParameter("password");
		
		String locality = (String) req.getParameter("locality");
		
		PreparedStatement pre = QueryUtil.getAddUserQuery(username, email, password, locality);
		
		if(pre.executeUpdate() > 0){
			resp.sendRedirect("/home");
		}
		else
		{
			resp.sendRedirect("/error");
		}
		
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
