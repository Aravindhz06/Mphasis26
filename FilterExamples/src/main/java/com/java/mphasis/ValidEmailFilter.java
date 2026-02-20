package com.java.mphasis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ValidEmailFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Entered In Filter...");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("email");
		System.out.println("Email is  " +email);
		 int index=email.indexOf('@');
		
		if(index==-1) {
			out.println("Invalid email: '@' is not found");
		}
		
		String user = email.substring(0, index);
		 if(user.length() <8) {
			out.println("Min 8 characters needed for username");
			
		}
		else {
			out.println("Valid Email "+email);
			RequestDispatcher disp=request.getRequestDispatcher("ValidEmail.html");
			disp.include(request, response);
		}
	}

}
