package com.maxaramos.samplespringdatacassandra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxaramos.samplespringdatacassandra.model.User;
import com.maxaramos.samplespringdatacassandra.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> findAll() {
		return userService.findAll();
	}

}
