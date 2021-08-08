package com.SL.LNAcad;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomePage
 */
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static Connection con = null;
	static String driverClass = "com.mysql.cj.jdbc.Driver";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomePage() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("WelcomeDiv.html");
		rd.include(request, response);
		
		List<Teacher> teachers = new ArrayList<>();
		List<Student> students = new ArrayList<>();
		List<Classes> classes = new ArrayList<>();
		List<Subject> subjects = new ArrayList<>();
		
		try {
			Class.forName(driverClass);
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy","root","root");
		    Statement stmt=con.createStatement();  
		    ResultSet rs=stmt.executeQuery("select * from teacher");
		    Teacher teach;
		    while(rs.next()) {
		    	teach = new Teacher(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getInt(4));
		    	teachers.add(teach);
		    }
		}catch(Exception e){System.out.println(e);}  
		finally {con= null;}
		
		try {
			Class.forName(driverClass);
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy","root","root");
		    Statement stmt=con.createStatement();  
		    ResultSet rs=stmt.executeQuery("select * from students");
		    Student stud;
		    while(rs.next()) {
		    	stud = new Student(rs.getInt(1), rs.getString(2), rs.getInt(4), rs.getString(3));
		    	students.add(stud);
		    }
		}catch(Exception e){System.out.println(e);}  
		finally {con= null;}
		
		try {
			Class.forName(driverClass);
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy","root","root");
		    Statement stmt=con.createStatement(); 
		    ResultSet rs=stmt.executeQuery("select * from classes");
		    Classes cla;
		    while(rs.next()) {
		    	cla = new Classes(rs.getInt(1), rs.getInt(2), rs.getString(3));
		    	classes.add(cla);
		    }
		}catch(Exception e){System.out.println(e);}  
		finally {con= null;}
		
		try {
			Class.forName(driverClass);
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy","root","root");
		    Statement stmt=con.createStatement();  
		    ResultSet rs=stmt.executeQuery("select * from subjects");
		    Subject subj;
		    while(rs.next()) {
		    	subj = new Subject(rs.getInt(1), rs.getString(2));
		    	subjects.add(subj);
		    }
		}catch(Exception e){System.out.println(e);}  
		finally {con= null;}
		
		out.print("<style>table, th, td {border: 1px solid black; border-collapse: collapse; text-align: center; padding: 3px;} th{background-color: #4B0082; color: #fff;} .new {display: flex; justify-content: center;}</style>");
		out.print("<br/><div class='new'><h2 class = 'new' style = 'width: 40%'><u>Teachers</u></h2><h2 class = 'new' style = 'width: 25%'><u>Students</u></h2><h2 class = 'new' style = 'width: 15%'><u>Subjects</u></h2><h2 class = 'new' style = 'width: 10%'><u>Classes</u></h2></div>"); 
		out.print("<div class='new''><table  style = 'width: 40%'><tr><th>Name</th><th>Date of Birth</th><th>Salary</th></tr>");

		for(Teacher teach:teachers) {
			out.print("<tr><td>" + teach.getName() + "</td><td>" + teach.getDateOfBirth() + "</td><td>" + teach.getSalary() + "</td></tr>");
		}
		out.print("</table>");
		
		out.print("<table style = 'width: 25%'><tr><th>Name</th><th>Standard-Class</th></tr>");
		for(Student stud:students) {
			out.print("<tr><td>" + stud.getName() + "</td><td>" + stud.getStandard() +" - " + stud.getClassName() + "</td></tr>");
		}
		out.print("</table>");	
		
		out.print("<table style = 'width: 15%'><tr><th>Name</th></tr>");
		for(Subject subj:subjects) {
			out.print("<tr><td>" + subj.getName() + "</td></tr>");
		}
		out.print("</table>");		
		
		out.print("<table style = 'width: 10%'><tr><th>Name</th></tr>");
		for(Classes cla:classes) {
			out.print("<tr><td>" + cla.getStandard() + " - " + cla.getClassName() + "</td></tr>");
		}
		out.print("</table></div><br/><hr/><br/>");
		
		rd = request.getRequestDispatcher("HomePage.jsp");
		rd.include(request, response);
	}

}
