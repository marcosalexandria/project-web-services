package com.marcos.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.project.entities.User;

//notation indicating that the class is controlled by rest
@RestController
@RequestMapping(value = "/users")	//name that will be mapped by the url
public class UserResource {
	
	//indicating that the method responds to the http get request
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(u); //returns the body of u
	}
}
