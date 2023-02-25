/**
 * 
 */
package com.superMarket.mart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superMarket.mart.model.LoginDetails;
import com.superMarket.mart.model.LoginResponse;
import com.superMarket.mart.service.impl.LoginService;

/**
 * @author kiran
 *
 */
@RestController
@RequestMapping("/mart")
public class LoginController {
	
	@Autowired
	LoginResponse loginResponse;
	@Autowired
	LoginService loginService;
	
	
	@PostMapping("/login")
	/*
	 * @RequestMapping(method = RequestMethod.POST,value = "/login")
	 * 
	 * @ResponseBody
	 */
	public LoginResponse login(@RequestBody LoginDetails loginDetails) {
		
		loginResponse = loginService.loginCheck(loginDetails);
		return loginResponse;
	}
	@PostMapping("/users")
	public String adduser(@RequestBody LoginDetails loginDetails) {
		System.out.println("add");
		String message = loginService.adduser(loginDetails);
		return message;
	}

}

/*
 * @Component
 * 
 * @Service
 * 
 * @RestController or @Controller
 * 
 * @Repository
 */
