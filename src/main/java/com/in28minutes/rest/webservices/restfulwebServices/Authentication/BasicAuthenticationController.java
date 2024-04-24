package com.in28minutes.rest.webservices.restfulwebServices.Authentication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//controller class
@CrossOrigin(origins="http://localhost:4200")
//@RestController
public class BasicAuthenticationController {
	
	@Value("${spring.security.user.name}")
	private String name;
	
	@Value("${spring.security.user.password}")
	private String password;
	
	@RequestMapping( path= "/basicauth", method= RequestMethod.POST)
	public String authenticationReq(@RequestBody AuthenticationBean request) {
		System.out.print(name);
		System.out.print(password);
		
		System.out.print(request.getName());
		System.out.print(request.getPassword());
		System.out.print(request.getMessage());
		
		AuthenticationBean bean = new AuthenticationBean();
		bean.setName(name);
		bean.setPassword(password);
		bean.setMessage("You are Authenticated.");
	   return "Test";
		
	}
	
	@RequestMapping( path= "/basicauth1", method= RequestMethod.GET)
	public AuthenticationBean authenticationRequirement() {
	   return new AuthenticationBean("You are  Authenticated....");
		
	}

}
