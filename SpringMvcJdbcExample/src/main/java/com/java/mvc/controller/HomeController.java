package com.java.mvc.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.mvc.dao.EmployDao;
import com.java.mvc.model.Employ;

@Controller
public class HomeController {
	
	
	Scanner sc=new Scanner(System.in);
	
	private String savedPassword =sc.next() ;  // current working password
    private String savedUser =sc.next() ;   


	@Autowired
	private EmployDao employDao;
	
	@RequestMapping(value="/resetpasswordfinal", method=RequestMethod.POST)
	public ModelAndView resetPasswordFinal(HttpServletRequest req) {

	    String user = req.getParameter("userName");
	    String newPass = req.getParameter("newPassword");
	    String confirmPass = req.getParameter("confirmPassword");

	    if (!newPass.equals(confirmPass)) {
	        ModelAndView mv = new ModelAndView("resetpassword");
	        mv.addObject("userName", user);
	        mv.addObject("error", "Passwords do not match!");
	        return mv;
	    }

	    savedPassword = newPass;     // update password

	    return new ModelAndView("login", "msg", "Password Updated Successfully! Please Login.");
	}
	
	@RequestMapping("/resetpassword")
	public ModelAndView resetPassword(HttpServletRequest req) {
	    String userName = req.getParameter("userName");

	    if (!userName.equals(savedUser)) {
	        return new ModelAndView("forgetpassword", "error", "User not found!");
	    }

	    return new ModelAndView("resetpassword", "userName", userName);
	}
	

	@RequestMapping("/forgetpassword")
	public ModelAndView forgotPassword() {
	    return new ModelAndView("forgetpassword");
	}

	
	@RequestMapping(value = "/saveemploy", method = RequestMethod.POST)
	public ModelAndView saveEmploy(@ModelAttribute Employ employNew) {
		System.out.println(employNew);
	    employDao.addEmploy(employNew);
	    return new ModelAndView("redirect:/showemploy");
	}

	@RequestMapping(value="/addemploy")
	public ModelAndView addEmploy() {
		return new ModelAndView("addemploy");
	}
	
	@RequestMapping(value="/deleteemploy")
	public ModelAndView deleteEmploy(HttpServletRequest req) {
		int empno=Integer.parseInt(req.getParameter("empno"));
		employDao.deleteEmploy(empno);
		return new ModelAndView("redirect:/showemploy");
	}
	
	@RequestMapping(value="/updateemploy")
	public ModelAndView updateEmploy(HttpServletRequest request) {
		int empno=Integer.parseInt(request.getParameter("empno"));
		Employ employ=employDao.searchEmploy(empno);
		return new ModelAndView("updateemploy","employ",employ);
	}
	
	@RequestMapping(value="/updatefinal")
	public ModelAndView updateFinal(@ModelAttribute Employ employUpdated) {
		employDao.updateEmploy(employUpdated);
		return new ModelAndView("redirect:/showemploy");
	}

	@RequestMapping(value="/loginresult")
	public ModelAndView test(HttpServletRequest request) throws IOException
	{
		String user = request.getParameter("userName");
		String pwd = request.getParameter("passCode");
		if (user.equals(savedUser) && pwd.equals(savedPassword)) {
	        return new ModelAndView("redirect:/showemploy");
	    } else {
	        return new ModelAndView("login", "error", "Invalid Credentials...");
	    }
//		int res = employDao.login(user, pwd);
//		if (res==1) {
//			return new ModelAndView("redirect:/showemploy");
//		}
//		else {
//			return new ModelAndView("login","error","InvalidCredentials..");
//		}
	}
	
	@RequestMapping(value="/showemploy")
	public ModelAndView showEmploy() {
		List<Employ> employList = employDao.showEmploy();
		return new ModelAndView("home","employList",employList);
	}
	


	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("login");
	}
}