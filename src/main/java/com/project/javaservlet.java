package com.project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class javaservlet
 */
@WebServlet("/javaservlet")
public class javaservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","2304@");
			String name=request.getParameter("textName");
					String password=request.getParameter("textPwd");
					PreparedStatement pst= con.prepareStatement("SELECT * FROM login WHERE username=? AND password=?" );
					pst.setString(1,name);
					pst.setString(2,password);
					ResultSet rs =pst.executeQuery();
					if(rs.next())
					{
						response.sendRedirect("indexx.jsp");
						
					}
					else {
						response.sendRedirect("error.jsp");
					}
					
					
					
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}