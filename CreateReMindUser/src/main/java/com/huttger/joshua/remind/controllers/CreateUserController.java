package com.huttger.joshua.remind.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.huttger.joshua.remind.models.User;

@RestController
public class CreateUserController {
	Logger log = LoggerFactory.getLogger(CreateUserController.class);
	@PostMapping("create_user")
	User createUser(@RequestBody User new_user) {
		log.info("Creating User :"+new_user);
		return new_user;
	}
}
