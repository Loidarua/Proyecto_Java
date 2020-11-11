package com.udea.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {

	@GetMapping(value = "/greeting")
	public String greeting() {
		return "Hola mundo Spring";
	}
	
	@GetMapping(value = "/greetingUser")
	public String greetingUser(@RequestParam String username) {
		return "Hola " + username;
	}
	
	@GetMapping(value = "/getUser")
	public String getUser(@RequestParam String username, @RequestParam String password) {
		return username + password; 
	}
	
	@GetMapping(value = "/deleteUser")
	public String deleteUser( String username) {
		return "Delete " + username; 
	}
	
	@GetMapping(value = "/editUser")
	public String editUser( String username) {
		return "Edit: " + username; 
	}
}

//http://localhost:8080/greetingUser?username=Felipe