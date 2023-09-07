package org.pentagonspace;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/fs")
public class FirstServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Enumeration<String>keynum=req.getParameterNames();
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		System.out.println(name+" "+place);
		PrintWriter out=resp.getWriter();
		while(keynum.hasMoreElements())
		{
			String key=keynum.nextElement();
			String val=req.getParameter(key);
			out.println("<html><body bgcolor='orange'>"+"<h1>"+key+" : " +val+"<body><html>");
		}
		
		out.flush();
		out.close();
	}

}
