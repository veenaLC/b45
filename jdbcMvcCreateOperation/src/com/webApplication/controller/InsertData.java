package com.webApplication.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public InsertData() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param=request.getParameter("page");
		if(param.equals("insertdata")){
			getServletContext().getRequestDispatcher("/insterdata.jsp").forward(request, response);
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try{
			//Initialize the database
			Connection con=DBConnect.initializeDatabase();
			//create a SQL query to insert data into table1 table
			//table1 table consist of tow columns, so two '?' is used
			PreparedStatement st= con.prepareStatement("insert into new_table values(?,?)");
			
			//for the first paramenter
			//get the data using requesr object
			//set the data to st pointer
			st.setInt(1, Integer.valueOf(request.getParameter("id")));
			
			//same for second parameter
			st.setString(2, request.getParameter("string"));
			
			//execute the insert command using executeUpdate()
			//to make changes in database
			st.executeUpdate();
			
			//close all the connection
			st.close();
			con.close();
			
			// get a writer pointer
			//to display the successful result
			PrintWriter out=response.getWriter();//import it from java.io
			out.println("<html><body><b>Successfully Inserted"+"</b></body></html>");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
