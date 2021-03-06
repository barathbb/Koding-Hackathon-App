package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.component.User;
import com.app.util.QueryUtil;

public class CreatePostAction extends HttpServlet {

	private static final long serialVersionUID = 972033247937295400L;

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		
		try{
		
		String title = (String) req.getParameter("email");
		
		String description = (String) req.getParameter("email");
		
		String image = (String) req.getParameter("image");
		
		String locality = (String) req.getParameter("locality");
		
		long department = Long.parseLong(req.getParameter("department"));
		
		QueryUtil.getAddPostQuery(title, description, image, locality, department, ((User)req.getSession().getAttribute("user")).getUserID()).execute();
		
		resp.sendRedirect("/postcreated.jsp");
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
