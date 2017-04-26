package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo1 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException{
		
		    System.out.println("In Get");
			RequestDispatcher rd = request.getRequestDispatcher("sample.jsp");
			rd.forward(request, response);
		
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		 			System.out.println("In Post");
		 			String name = (String) request.getParameter("uname");
		 			request.setAttribute("FNAME", name);
					RequestDispatcher rd = request.getRequestDispatcher("sample.jsp");
					rd.forward(request, response);
				
				
	}



}
