package com.app.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.util.QueryUtil;
import com.mysql.jdbc.PreparedStatement;

public class CheckEmailIdAction extends HttpServlet {
	
	private static final long serialVersionUID = -7111089485619118486L;

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email = (String) req.getParameter("emailid");
		
		boolean exists = Boolean.FALSE;
		
		try{
		
		PreparedStatement pre = QueryUtil.getUsersTableWithEmailIdEquals(email);
		
		exists = pre.executeQuery() != null;
		
		}
		catch(Exception e){
			
		}
		
		Writer out = resp.getWriter();
		
		out.write( exists ? "False" : "True" ); /** The text value is used for validation **/
		
	}

}
