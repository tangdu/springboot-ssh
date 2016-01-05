package com.tdu.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tdu.entity.User;
import com.tdu.service.UserService;

@Controller
@RequestMapping("user")
public class UserWebController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("add/{uname}")
	public @ResponseBody ResponseEntity<User> add(@PathVariable String uname){
		User user=new User();
		user.setUname(uname);
		user.setUpwd("ad1");
		User _user=userService.save(user);
		ResponseEntity<User> users=new ResponseEntity<User>(_user, HttpStatus.ACCEPTED);
		return users;
	}
}
