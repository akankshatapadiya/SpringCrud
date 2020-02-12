package com.lti.hr.web.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.hr.core.entities.Employee;
import com.lti.hr.core.exceptions.HrException;
import com.lti.hr.core.services.EmpServices;
/**
 * 
 * @author lntinfotech
 * @Controller : Defines a bean as springMVC controller
 * @RequestParam : Declares a URL for a action method in controller class
 * @RequestMapping : To read single field from form data/query string
 * @ModelAttribute : To read multiple fields from form data/query string
 * ModelAndView : A ready spring object which holds the Data Model and View name.
 * The action method id expected to populate this object with object Model and View and
 *   return to FC. The FC registers data with Request and does dispatching to view.
 */
@Controller
public class HrController {
	
	@Autowired
	private EmpServices services;
	
	@RequestMapping("*.do")
	public String getHomePage() {
		return "Home";
	}
	
	@RequestMapping("login.do")
	public String getLoginPage() {
		return "Login";
	}
	
	/*@RequestMapping("authenticate.do")
	public String getAuthenticateUser(HttpServletRequest request) {
		String usernm = request.getParameter("username");
		String passwd = request.getParameter("password");
		System.out.println("Username: " + usernm + "\nPassword" + passwd);
		
		return "MainMenu";
	}*/
	
	/*@RequestMapping("authenticate.do")
	public String getAuthenticateUser(@RequestParam("username") String userNm, @RequestParam("password") String passwd) {
		//System.out.println("Username: " + userNm + "\nPassword: " + passwd);
		boolean isValidUser = services.isAuthenticated(userNm, passwd);
		if(isValidUser)
			return "MainMenu";
		else
			return "Login";
		
	}*/
	
	@RequestMapping("authenticate.do")
	public ModelAndView getAuthenticateUser(@RequestParam("username") String userNm, @RequestParam("password") String passwd) {
		//System.out.println("Username: " + userNm + "\nPassword: " + passwd);
		boolean isValidUser = services.isAuthenticated(userNm, passwd);
		ModelAndView mAndV=new ModelAndView();
		
		if(isValidUser) {
			mAndV.setViewName("MainMenu");
			return mAndV;
		}
			
		else {
			mAndV.setViewName("Login");
			mAndV.addObject("errorMsg","Login unsucessful may be for wrong credentials");
			return mAndV;
		}
	}
	
	@RequestMapping("EmpList.do")
	public ModelAndView getEmployeeList() throws HrException {
		ArrayList<Employee> empList =  services.getEmpNameList();
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("empList",empList);
		mAndV.setViewName("EmpList");
		return mAndV;
		
	}
	
	
}
