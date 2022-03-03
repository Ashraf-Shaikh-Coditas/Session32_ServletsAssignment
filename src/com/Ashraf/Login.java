package com.Ashraf;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("pwd");
		
		if(username.equals(password)) {
			res.sendRedirect("Addition.html");
			
		} else {
			res.getWriter().println("Invalid Login Credentials");
		}
		
	}
}
