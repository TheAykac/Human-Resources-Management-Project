package com.example.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.entities.concretes.User;
@RestController
@RequestMapping("/api/user")
public class UserControllers {
	
	private UserService userService;
@Autowired
	public UserControllers(UserService userService) {
		super();
		this.userService = userService;
	}
	@GetMapping("/getall")
	public List<User> getAll(){
		return userService.getAll();
	}

}
