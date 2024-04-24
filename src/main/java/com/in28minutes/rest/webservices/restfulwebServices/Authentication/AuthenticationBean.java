package com.in28minutes.rest.webservices.restfulwebServices.Authentication;

public class AuthenticationBean {
	
	private String name;
	private String password;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public AuthenticationBean(String message) {
		this.message = message;
		
	}
	AuthenticationBean(){
		
	}
	
	

}
