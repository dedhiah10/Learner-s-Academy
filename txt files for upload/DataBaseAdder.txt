package com.SL.LNAcad;

import java.io.IOException;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatabaseAdder
 */
public class DatabaseAdder extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Connection con = null;
	static String driverClass = "com.mysql.cj.jdbc.Driver";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatabaseAdder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int formNum = Integer.parseInt(request.getParameter("formNum"));
		switch(formNum) {
			case 1:
				String studentName = request.getParameter("studentName");
				int standard = Integer.parseInt(request.getParameter("standard"));
				String className = request.getParameter("className");
				try {
					Class.forName(driverClass);
				    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy","root","root");				    
				    String x = "insert into students (`studentName`, `className`, `standard`) values ('" + studentName+"', '"+ className + "', " + standard + ");";
				    PreparedStatement stmt=con.prepareStatement(x);
				    stmt.execute();
				}catch(Exception e){System.out.println(e);}  
				finally {con= null;}
				break;
				
			case 2:
				String teacherName = request.getParameter("teacherName");
				int teacherSalary = Integer.parseInt(request.getParameter("teacherSalary"));
				try {
					Class.forName(driverClass);
				    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy","root","root");				    
				    String x="insert into teacher (`name`, `DoB`, `salary`) values ('" + teacherName+"', STR_TO_DATE('"+ request.getParameter("dateOfBirth") + "', '%Y-%m-%d'), " + teacherSalary + ");";
				    PreparedStatement stmt=con.prepareStatement(x); 
				    stmt.execute();
				}catch(Exception e){System.out.println(e);}  
				finally {con= null;}
				break;
				
			case 3:
				String subjectName = request.getParameter("subjectName");
				try {
					Class.forName(driverClass);
				    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy","root","root");
				    String x="insert into subjects(`subjectName`) values ('" + subjectName +"');";
				    PreparedStatement stmt=con.prepareStatement(x); 
				    stmt.execute();
				}catch(Exception e){System.out.println(e);}  
				finally {con= null;}
				break;
		}
		RequestDispatcher rd = request.getRequestDispatcher("HomePage");
		rd.forward(request, response);
	}

}
