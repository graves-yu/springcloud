/**
 * 
 */
package com.graves.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.graves.entity.User;

/**  
 * <p>Title: UserDao</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年7月24日  
 */
@Repository
public interface UserMapper {
	
	public User getUser(@Param("id") Integer userId);

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
