package com.java.mphasis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class alternateWordServlet
 */
public class alternateWordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public alternateWordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String s=request.getParameter("alternate");
		out.println("The alternate words are: "+alternateWords(s));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public static String alternateWords(String s) {
		String[] words=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<words.length;i++) {
			if(i%2!=0) {
				StringBuilder sbb=new StringBuilder(words[i]);
				int start=0; int end=words[i].length()-1;
				while(start<end) {
					char temp=sbb.charAt(start);
					sbb.setCharAt(start, sbb.charAt(end));
					sbb.setCharAt(end, temp);
					start++; end--;
				}
				sb.append(sbb.toString()); sb.append(" ");
				
			}else {
				sb.append(words[i]); sb.append(" ");
			}
		}
		return sb.toString();
	}
}
