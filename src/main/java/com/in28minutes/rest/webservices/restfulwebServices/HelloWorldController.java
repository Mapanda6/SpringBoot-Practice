package com.in28minutes.rest.webservices.restfulwebServices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller class
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	
	//GET
	//URI - /hellow-world
	//method - "Hello World"
	@RequestMapping(method= RequestMethod.GET, path= "/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
		
	}
	//helloworld-bean
	@RequestMapping(method= RequestMethod.GET, path= "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean!!");
		
	}
	@RequestMapping(method= RequestMethod.GET, path= "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		//throw new RuntimeException("Some Error has happened! Contact Support at ***----****");
		return new HelloWorldBean(String.format("Hello World, %s", name));
		
	}

}
