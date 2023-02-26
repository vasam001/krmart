/**
 * 
 */
package com.example.learning.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.learning.model.LoginDetails;
import com.example.learning.model.LoginResponse;

/**
 * @author Dell
 *
 */
@RestController
@RequestMapping("/learning")

public class LoginAuthenticate {
	@Autowired
	LoginResponse loginResponse;
	@Autowired 
	LoginAuthenticate loginService;
	@PostMapping("/login")
	public LoginResponse login(@RequestBody LoginDetails loginDetails) {
		

		if (loginDetails.getUsername().equalsIgnoreCase("furqan")
				&& (loginDetails.getPassword().equalsIgnoreCase("sayed")))

		{

			loginResponse.setMessage("successful login");
		}

		else {
			loginResponse.setMessage("login unsuccessful");

		}

		return loginResponse;
	}

}
