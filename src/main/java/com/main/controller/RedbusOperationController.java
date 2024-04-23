package com.main.controller;

import java.security.Principal;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class RedbusOperationController {

	 @GetMapping("/home")
	 public String showHome()
	 {
		 return "<h1 style='color:red;text-align:center'>Welcome to Redbus.com Loging With Third Party App</h1>";
	 }
	 
	 @GetMapping("/after")
	 public String afterLogin()
	 {
		 return "<h1 style='color:green;text-align:center'>After Successfully Logging Redbus Using Third Party App</h1>";
	 }
	 @GetMapping("/user")
	 public Authentication getUserDetails(Principal principal)
	 {
		 System.out.println("Current Login User : "+principal.getName());
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		 
		 return auth;
	 }
}
