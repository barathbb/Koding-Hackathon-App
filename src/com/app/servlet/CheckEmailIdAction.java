/*$Id$*/
package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.util.QueryUtil;
import com.mysql.jdbc.PreparedStatement;

/**
 * @author barath-2392
 *
 */
public class CheckEmailIdAction extends HttpServlet {
	
	private static final long serialVersionUID = -7111089485619118486L;

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		
		String email = (String) req.getParameter("email");
		
		try{
		
		PreparedStatement pre = QueryUtil.getUsersTableWithEmailIdEquals(email);
		
		boolean exists = pre.executeQuery() != null;
		
		
		}
		catch(Exception e){
			
		}
		
	}
	
	
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

}
