package com.java.mphasis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calcServlet
 */
public class calcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int num1,num2,result;
		
		
		num1=Integer.parseInt(request.getParameter("firstNo"));
	
		num2=Integer.parseInt(request.getParameter("secondNo"));
		
		
			result=num1+num2;
			out.println("Sum is <b>"+result+"</b><br>");
			
			result=num1-num2;
			out.println("Sub is <b>"+result+"</b><br>");
			
			result=num1*num2;
			out.println("Mult is <b>"+result+"</b><br>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
