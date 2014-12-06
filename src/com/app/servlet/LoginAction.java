package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.util.AppConstants;
import com.app.util.AppUtil;

public class LoginAction extends HttpServlet{

	
	private static final long serialVersionUID = 1397927875698651728L;

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		
		try{
		
		String email = (String) req.getParameter("email");
		
		String password = (String) req.getParameter("password");
		
		int userState = AppUtil.checkForUserAvailability(email,password);
		
		String redirectPath = "";
		
		switch(userState)
		{
			case AppConstants.EMAIL_NOT_EXIST:
				redirectPath = "error";
				break;
			case AppConstants.WRONG_PASSW0RD:
				redirectPath = "error";
				break;
			case AppConstants.VALID_USER:
				redirectPath = "home";
				AppUtil.getUserForSession(email);
				break;
		}
		
		resp.sendRedirect(redirectPath);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
