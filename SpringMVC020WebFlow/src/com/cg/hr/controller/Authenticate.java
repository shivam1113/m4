package com.cg.hr.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.cg.hr.entities.User;
import com.cg.hr.exception.EmpException;
import com.cg.hr.services.AuthService;

@Controller
public class Authenticate {
	
		@Resource	// Setting control to Service Page
		private AuthService service;
	
	@RequestMapping("/getLoginPage.hr")
	public ModelAndView getLoginPage(){
		ModelAndView mAndV=new ModelAndView("Login.jsp");
		mAndV.addObject("pageHead","Login page");
		return mAndV;
		
	}
	@RequestMapping(value="/authenticate.hr",method=RequestMethod.POST)
	public ModelAndView authenticateUser(HttpServletRequest request) throws EmpException{
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		
		System.out.println("In controller"+userName+" "+password);
		User user=new User(userName, password);
		user=service.isAuthenticated(user);
		ModelAndView mAndV=new ModelAndView();
		if(user.isAuthSucc())
		{
			//GO to Success Page
			mAndV.addObject("pageHead","Main Menu");
			mAndV.addObject("userDetails",user);
			mAndV.setViewName("MainMenu.jsp");
			
		}
		else
		{
			mAndV.addObject("pageHead","Login Page");
			mAndV.addObject("userDetails",user);	
			mAndV.setViewName("Login.jsp");
		}
		return mAndV;
	}
	
}
