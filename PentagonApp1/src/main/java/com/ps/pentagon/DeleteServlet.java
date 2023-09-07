package com.ps.pentagon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		String  username=request.getParameter("username");
		int i=StudentDao.delete(username);
		PrintWriter out=response.getWriter();
		out.println("<body style='background=image: url(\"img/hand.jpg\"); background-size: cover;'>"
				+"<h1 style='color:white;'>Record deleted successfully </h1>"
				+"<form action='ViewServlet'>"
				+"<input type='submit' value='Back'></form>"
				+"</body></html>");
		out.flush();
		out.close();	
	}
}
