/**
 * 
 */
package com.graves.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graves.entity.User;
import com.graves.mapper.UserMapper;

/**  
 * <p>Title: UserServiceImpl</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年7月24日  
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	/**  
	 * <p>Title: getUserInfo</p>  
	 * <p>Description: </p>  
	 * @author Graves
	 * @date 2019年7月24日   
	 * @param userId
	 * @return  
	 */ 
	@Override
	public User getUser(Integer userId) {
		
		return userMapper.getUser(userId);
	}

	/**  
	 * <p>Title: addUser</p>  
	 * <p>Description: </p>  
	 * @author Graves
	 * @date 2019年7月29日   
	 * @param user
	 * @return  
	 */ 
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.addUser(user);
	}

}
