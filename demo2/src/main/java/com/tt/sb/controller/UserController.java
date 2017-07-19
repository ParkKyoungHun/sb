package com.tt.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tt.sb.model.User;
import com.tt.sb.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserService us;
//	@RequestMapping(value = "/user", method = RequestMethod.GET)
//	public List<User> getEmployees() {
//		return us.save(hm);
//	}
//	
//	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
//	public User getUser(@PathVariable("id") long id) {
//		return us.getEmployeeById(id);
//	}
}
