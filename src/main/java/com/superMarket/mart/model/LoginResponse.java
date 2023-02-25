/**
 * 
 */
package com.superMarket.mart.model;

import org.springframework.stereotype.Component;

/**
 * @author kiran
 *
 */
@Component
public class LoginResponse {
	String message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
