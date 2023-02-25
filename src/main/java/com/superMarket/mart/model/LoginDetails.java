/**
 * 
 */
package com.superMarket.mart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * @author kiran
 *
 */
@Component
@Entity
@Table (name = "LOGIN_DETAILS")
public class LoginDetails {
	@Id
	@Column(name = "Login_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "User_Name")
	String userName;
	@Column(name = "Password")
	String password;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	public LoginDetails() {
		
	}
	public LoginDetails(int id,String userName,String password) {
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
