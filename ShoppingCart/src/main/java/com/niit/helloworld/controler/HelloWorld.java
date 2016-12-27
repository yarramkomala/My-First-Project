package com.niit.helloworld.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	@RequestMapping("/")
	public String getPage(){
		System.out.println("start");
		return "home";	
	}
	
	@RequestMapping("/login")
	public String showLoginPage(){
			
			return "login";
		}
	@RequestMapping("/register")
public String showRegistrationPage(){
		
		return "registration";
	}
	//for validating we are creatig this method .and it will get back to home only.
	//need to validate -actually-we need to write Dao-get values from tables
	//but temporarly-we are hard coding
	//if the credentials are valid-show message "welcome to shopping cart"
	//else show messsage "invalid credential" +login page ->both should display in home page only
	@RequestMapping("/validate")
	public ModelAndView validate(@RequestParam("uname") String uname,@RequestParam("pswd")String pswd){
		System.out.println("validate methode");
		ModelAndView mv=new ModelAndView("home");
		UserDao userDAO=new UserDao();
		if(userDAO.isValidCredentials(uname,pswd)==true){
			mv.addObject("successmsg","you  logged in successfully");
			
		}
		else{
			mv.addObject("errormsg","please try again,");
		}
		return mv;
	}
	/*@RequestMapping("/login")
	public ModelAndView showLoginPage(){
		ModelAndView mv=new Mod"elAndview("login");
		mv.addObject("msg","you clicked login link");
		mv.addObject("showLoginPage","true");// for SPA
		return mv;}
		
		similrlly we can done for registration page
		
	  */
	
	
}
