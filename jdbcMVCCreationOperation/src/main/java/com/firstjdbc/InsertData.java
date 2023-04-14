package com.firstjdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Resource(name="jdbc/project")
    private DataSource dataSource;
    
    
    public InsertData() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param=request.getParameter("page");
		if(param.equals("insertdata")) {
			getServletContext().getRequestDispatcher("/insertdata.jsp").forward(request,response);
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("starting");
		try {
			Connection con=DBConnection.initializeDatabase();
			PreparedStatement st=con.prepareStatement("insert into second values(?,?)");
			st.setInt(1, Integer.valueOf(request.getParameter("sid")));
			st.setString(2,request.getParameter("sname") );
			st.executeUpdate();
			st.close();
			con.close();
			PrintWriter out=response.getWriter();
			out.println("<html><body><b>Successfully Inserted"+"</br></body></html>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	
		
	}

}
