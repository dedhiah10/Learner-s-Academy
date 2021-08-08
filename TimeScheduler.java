package com.SL.LNAcad;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TimeScheduler
 */
public class TimeScheduler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static Connection con = null;
	static String driverClass = "com.mysql.cj.jdbc.Driver";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimeScheduler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("TimeTableDiv.html");
		rd.include(request, response);
		
		List<TimeTable> timeTableA = new ArrayList<>();
	    List<TimeTable> timeTableB = new ArrayList<>();
		List<TimeTable> timeTableC = new ArrayList<>();
		List<TimeTable> timeTables = new ArrayList<>();
		
		try {
			Class.forName(driverClass);
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy","root","root");
		    Statement stmt=con.createStatement();  
		    ResultSet rs=stmt.executeQuery("select * from timetable where className='A'");		    
		    TimeTable timeTab;
		    while(rs.next()) {
		    	timeTab = new TimeTable(rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7));
		    	timeTableA.add(timeTab);
		    } 
		    
		    rs=stmt.executeQuery("select * from timetable where className='B'");
		    while(rs.next()) {
		    	timeTab = new TimeTable(rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7));
		    	timeTableB.add(timeTab);
		    }
		    
		    rs=stmt.executeQuery("select * from timetable where className='C'");		    
		    while(rs.next()) {
		    	timeTab = new TimeTable(rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7));
		    	timeTableC.add(timeTab);
		    }
		}catch(Exception e){System.out.println(e);}  
		finally {con= null;}		
		
		out.print("<style>table, th, td {border: 1px solid black; border-collapse: collapse; text-align: center; padding: 3px;} th{background-color: #4B0082; color: #fff;} .new {display:flex; justify-items: center;} .new1{} .new2{} </style>");
		out.print("<h2 class='new'><a class = 'new1' style = 'width: 100%'>Class <u>1 - A</u></a></h2><br/><table class='new2' style = 'width: 100%'><tr><th>Day of the Week</th><th>Slot 1</th><th>Slot 2</th><th>Slot 3</th><th>Slot 4</th></tr><br/>");
		Collections.sort(timeTableA);
		Collections.sort(timeTableB);
		Collections.sort(timeTableC);		
		
		out.print("<tr><th>Monday</th>");
		for(TimeTable timeTab: timeTableA) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Monday")) {timeTables.add(timeTab);}}	
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> " + t.getTeacherAssigned() + "</td>");}
		out.print("</tr>");
		timeTables.clear();
		for(TimeTable timeTab: timeTableA) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Tuesday")) {timeTables.add(timeTab);}}
		out.print("<tr><th>Tuesday</th>");
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> " + t.getTeacherAssigned() + "</td>");}
		out.print("</tr>");
		timeTables.clear();
		for(TimeTable timeTab: timeTableA) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Wednesday")) {timeTables.add(timeTab);}}
		out.print("<tr><th>Wednesday</th>");
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> " + t.getTeacherAssigned() + "</td>");}
		out.print("</tr>");
		timeTables.clear();
		for(TimeTable timeTab: timeTableA) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Thursday")) {timeTables.add(timeTab);}}
		out.print("<tr><th>Thursday</th>");
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> " + t.getTeacherAssigned() + "</td>");}
		out.print("</tr>");	
		timeTables.clear();
		for(TimeTable timeTab: timeTableA) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Friday")) {timeTables.add(timeTab);}}
		out.print("<tr><th>Friday</th>");
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> "  + t.getTeacherAssigned() + "</td>");}
		out.print("</tr></table>");
		timeTables.clear();
		
		
		out.print("<h2 class='new'><a class = 'new1' style = 'width: 100%'>Class <u>1 - B</u></a></h2><br/><table class='new2' style = 'width: 100%'><tr><th>Day of the Week</th><th>Slot 1</th><th>Slot 2</th><th>Slot 3</th><th>Slot 4</th></tr><br/>");
		out.print("<tr><th>Monday</th>");
		for(TimeTable timeTab: timeTableB) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Monday")) {timeTables.add(timeTab);}}	
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> " + t.getTeacherAssigned() + "</td>");}
		out.print("</tr>");
		timeTables.clear();
		for(TimeTable timeTab: timeTableB) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Tuesday")) {timeTables.add(timeTab);}}
		out.print("<tr><th>Tuesday</th>");
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> " + t.getTeacherAssigned() + "</td>");}
		out.print("</tr>");
		timeTables.clear();
		for(TimeTable timeTab: timeTableB) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Wednesday")) {timeTables.add(timeTab);}}
		out.print("<tr><th>Wednesday</th>");
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> " + t.getTeacherAssigned() + "</td>");}
		out.print("</tr>");
		timeTables.clear();
		for(TimeTable timeTab: timeTableB) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Thursday")) {timeTables.add(timeTab);}}
		out.print("<tr><th>Thursday</th>");
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> " + t.getTeacherAssigned() + "</td>");}
		out.print("</tr>");	
		timeTables.clear();
		for(TimeTable timeTab: timeTableB) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Friday")) {timeTables.add(timeTab);}}
		out.print("<tr><th>Friday</th>");
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> "  + t.getTeacherAssigned() + "</td>");}
		out.print("</tr></table>");
		timeTables.clear();
		
		
		out.print("<h2 class='new'><a class = 'new1' style = 'width: 100%'>Class <u>1 - C</u></a></h2><br/><table class='new2' style = 'width: 100%'><tr><th>Day of the Week</th><th>Slot 1</th><th>Slot 2</th><th>Slot 3</th><th>Slot 4</th></tr><br/>");
		out.print("<tr><th>Monday</th>");
		for(TimeTable timeTab: timeTableC) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Monday")) {timeTables.add(timeTab);}}	
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> " + t.getTeacherAssigned() + "</td>");}
		out.print("</tr>");
		timeTables.clear();
		for(TimeTable timeTab: timeTableC) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Tuesday")) {timeTables.add(timeTab);}}
		out.print("<tr><th>Tuesday</th>");
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> " + t.getTeacherAssigned() + "</td>");}
		out.print("</tr>");
		timeTables.clear();
		for(TimeTable timeTab: timeTableC) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Wednesday")) {timeTables.add(timeTab);}}
		out.print("<tr><th>Wednesday</th>");
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> " + t.getTeacherAssigned() + "</td>");}
		out.print("</tr>");
		timeTables.clear();
		for(TimeTable timeTab: timeTableC) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Thursday")) {timeTables.add(timeTab);}}
		out.print("<tr><th>Thursday</th>");
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> " + t.getTeacherAssigned() + "</td>");}
		out.print("</tr>");	
		timeTables.clear();
		for(TimeTable timeTab: timeTableC) {if(timeTab.getDayOfTheWeek().equalsIgnoreCase("Friday")) {timeTables.add(timeTab);}}
		out.print("<tr><th>Friday</th>");
		for(TimeTable t: timeTables) {out.print("<td>" + t.getSubjectName()+" <br/> "  + t.getTeacherAssigned() + "</td>");}
		out.print("</tr></table>");
		timeTables.clear();		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
