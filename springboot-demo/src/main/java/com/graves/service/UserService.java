/**
 * 
 */
package com.graves.service;

import com.graves.entity.User;

/**  
 * <p>Title: UserService</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年7月24日  
 */
public interface UserService {
	
	public User getUser(Integer userId);

	/**  
	 * <p>Title: addUser</p>  
	 * <p>Description: </p>  
	 * @author Graves
	 * @date 2019年7月29日   
	 * @param user
	 * @return  
	 */ 
	public User addUser(User user);
}
