package com.yas.book.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yas.book.inventory.entity.UserT;
import com.yas.book.inventory.service.UserService;                
                                                                  
@RestController("/user")                                          
public class UserController {                                     
	                                                              
	@Autowired 
	private UserService userservice;                       
	                                                              
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)  
	@ResponseBody                                                 
	public UserT addUser(@RequestBody UserT usert) {              
		                                                          
		return userservice.addUser(usert);
		
	}

}
                                                          