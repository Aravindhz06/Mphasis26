package com.java.mphasis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class countPalindrome
 */
public class countPalindrome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public countPalindrome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String s=request.getParameter("cntPalindrome");
		out.println("Total "+countPalindrome(s)+" palindromes in above word");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public static int countPalindrome(String s) {
		String[] words=s.split(" ");
		int count=0;
		for(int i=0; i<words.length; i++) {
			if(isPalindrome(words[i])) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean isPalindrome(String s) {
		s=s.toLowerCase();  
		int start=0; int end=s.length()-1;
	    while(start<end){
	        if(s.charAt(start)!=s.charAt(end)){
	            return false;
	        }
	        start++; end--;
	    }
	    return true;
	}
}
