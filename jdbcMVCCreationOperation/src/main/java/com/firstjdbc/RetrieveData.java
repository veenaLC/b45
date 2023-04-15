package com.firstjdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
  
@WebServlet("/RetrieveData")
public class RetrieveData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/project")
private DataSource dataSource;       
    
    public RetrieveData() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String param = request.getParameter("page");
		if(param.equals("retrievedata")) {
			getServletContext().getRequestDispatcher("/retrievedata.jsp").forward(request, response);
		}
		}
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		try {
			
			Connection con= DBConnection.initializeDatabase();
			
		
			Statement st = con.createStatement();
		String query= "SELECT * FROM second";
		
			ResultSet rs = st.executeQuery(query);
			
			PrintWriter out = response.getWriter(); //import it from java.io
			
			while (rs.next())
			{
				System.out.println("ID is "+rs.getInt("sid"));
				System.out.println("String is "+rs.getString("sname"));
				
				out.println("ID is "+rs.getInt("sid"));
				out.println("String is "+rs.getString("sname"));
			}
			
			
			st.close();
			con.close();
			out.println("All the records in the database are aboves");	
			
			}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}