package com.irn.rr.platform.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.irn.rr.platform.userservice.entity.User;
import com.irn.rr.platform.userservice.service.UserService;

@RestController
public class UserServiceController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/admin/register")
	public void registerAsAdmin(@RequestBody User user) {
		try {
			System.out.println("User============>"+user);
			userService.registerAsAdmin(user);
			System.out.println("Admin user added successfully!");
		} catch (Exception e) {
			System.out.println("Exception caught: " + e);
		}
	}
	
}
