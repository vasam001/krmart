/**
 * 
 */
package com.superMarket.mart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superMarket.mart.model.LoginDetails;
import com.superMarket.mart.model.LoginResponse;
import com.superMarket.mart.model.ManufactureDetails;
import com.superMarket.mart.repository.LoginRepository;
import com.superMarket.mart.repository.ManufactureRepository;

/**
 * @author kiran
 *
 */
@Service
public class LoginService {
	@Autowired
	LoginResponse loginResponse;
	@Autowired
	private LoginRepository loginRepository;
	public LoginResponse loginCheck(LoginDetails loginDetails) {
		if (loginDetails.getUserName().equalsIgnoreCase("kiranreddy")) {
			if (loginDetails.getPassword().equalsIgnoreCase("montree")) {
				loginResponse.setMessage("successfully login welcome to mart");
			} else {
				loginResponse.setMessage("password is incorrect");
			}
		} else {
			loginResponse.setMessage("user is not register");
		}
		return loginResponse;
	}
	public String adduser(LoginDetails loginDetails) {
		String message = "successfully inserted";
		try {
			loginRepository.save(loginDetails);
		}catch (Exception e) {
			message = e.getMessage();
		}
		
		return message;
		
	}
}
