package com.java.mphasis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user,pwd;
		user=request.getParameter("userName");
		pwd=request.getParameter("passCode");
		if(user.equals("Mphasis") && pwd.equals("Mphasis")) {
			out.println("Correct Credentials...");
		}else {
			out.println("Invalid Credentials...");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user,pwd;
		user=request.getParameter("userName");
		pwd=request.getParameter("passCode");
		if(user.equals("Mphasis") && pwd.equals("Mphasis")) {
			out.println("Correct Credentials...");
			RequestDispatcher disp=request.getRequestDispatcher("Menu.html");
			disp.forward(request, response);
		}else {
			RequestDispatcher disp=request.getRequestDispatcher("LoginPage.html");
			disp.include(request, response);
			out.println("<p style='color:green'>Invalid Credentials...</p>");
		}
	}

}
