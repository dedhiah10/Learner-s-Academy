package com.SL.LNAcad;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname, pword = null;
		response.setContentType("text/html");
		uname= request.getParameter("uname");
		pword= request.getParameter("pword");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		if (uname.equalsIgnoreCase("admin") && pword.equals("admin")) {
			/*rd = request.getRequestDispatcher("HomePage");
			rd.forward(request, response);*/
			rd = request.getRequestDispatcher("HomePage");
			rd.forward(request, response);
		} else {
			rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
			out.println("<h1 style= 'color: red; text-align: center;'>Invalid Credentials!</h1>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
