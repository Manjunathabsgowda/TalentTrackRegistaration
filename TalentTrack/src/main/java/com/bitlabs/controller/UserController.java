package com.bitlabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlabs.entity.User;
import com.bitlabs.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        User registeredUser = userService.addUser(user);

 

        if(registeredUser!=null) {

 

            System.out.println("registerd successfully");

 

            return ResponseEntity.ok("registerd successfully");

 

        }

 

        System.out.println("unable to register");

 

        return ResponseEntity.status(401).body("unable to register");

 

    }
	
	
	@PostMapping("/checklogin")
	public ResponseEntity<String> login(@RequestBody User user) {
		
		
		boolean b=userService.login(user);
		
		if(b) {
			return new ResponseEntity<>("success",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("failed",HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	@PostMapping("/adminlogin")
	public ResponseEntity<String> adminlogin(@RequestBody User user) {
		
		
		boolean b=userService.adminLogin(user);
		
		if(b) {
			return new ResponseEntity<>("success",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("failed",HttpStatus.BAD_REQUEST);
		}
	}

}
