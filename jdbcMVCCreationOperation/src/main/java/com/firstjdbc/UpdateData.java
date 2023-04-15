
 

package com.firstjdbc;

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
  
@WebServlet("/UpdateData")
public class UpdateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/project")
private DataSource dataSource;       
    
    public UpdateData() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String param = request.getParameter("page");
		if(param.equals("updatedata")) {
			getServletContext().getRequestDispatcher("/updatedata.jsp").forward(request, response);
		}
		}
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		try {
			//initialize the database
			Connection con= DBConnection.initializeDatabase();
			
		
			Statement st = con.createStatement();
		String query= "update second set sname= 'veena' where sid='34'";
		
			st.executeUpdate(query);
			
			
			PrintWriter out = response.getWriter(); //import it from java.io
			
			
			
			st.close();
			con.close();
			
			out.println("the record is updated in the database as aboves");	
			
			}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
   
