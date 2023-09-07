package com.ps.pentagon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String username=req.getParameter("uname");
		String password=req.getParameter("pw");
		if(Validate.checkUser(username,password))
		{
			RequestDispatcher rd=req.getRequestDispatcher("FirstPage.html");
			rd.forward(req,resp);
		}else {
			out.println("User name or Password incorrect");
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
			rd.include(req, resp);
		}
	}
}
