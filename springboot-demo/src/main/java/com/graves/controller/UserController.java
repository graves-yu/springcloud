/**
 * 
 */
package com.graves.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graves.entity.User;
import com.graves.service.UserService;

/**  
 * <p>Title: UserController</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年7月24日  
 */

@RestController
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/getUser/{userId}")
	public User getUserInfo (@PathVariable Integer userId) {
		
		return userService.getUser(userId);
	}
	
	@RequestMapping("/addUser")
	public User addUser(@RequestBody User user){
		return userService.addUser(user);
	}
}
