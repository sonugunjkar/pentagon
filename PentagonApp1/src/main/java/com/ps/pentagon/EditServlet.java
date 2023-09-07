package com.ps.pentagon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<body>"
				+"<h1>Update Employee</h1>");
		String username=request.getParameter("username");
		Student s=StudentDao.getStudentByUsername(username);
		out.print("<form action='EditServlet2'>");
		out.print("<table>");
		out.print("<tr><td>Name</td><td><input type='text' name='name' value='"+s.getName()+"'/></td></tr>");
		out.print("<tr><td>Username:</td><td><input type='text' name='uname' value='"+s.getUsername()+"'/></td></tr>");
		out.print("<tr><td>Email:</td><td><input type='text' name='email' value='"+s.getEmail()+"'/></td></tr>");
		out.print("<tr><td>Gender:</td><td><input type='text' name='gender' value='"+s.getGender()+"'/></td></tr>");
		out.print("<tr><td>City:</td><td><input type='text' name='city'"
				+ "value='"+s.getCity()+"'/></td></tr>");
		out.print("<tr><td>Country:</td><td>");
		out.print("<select name='country' style='width:150px'>");
		out.print("<option>India</option>");
		out.print("<option>USA</option>");
		out.print("<option>UK</option>");
		out.print("<option>Other</option>");
		out.print("</select>");
		out.print("</td></tr>");
		out.print("<tr><td>Password:</td><td><input type='password' name='password' value='"+s.getPassword()+"'/></td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr>");
		out.print("</table>");
		out.print("</form></body>");
		out.flush();
		out.close();
	}
}
