/**
 * 
 */
package com.graves.springcloud.service;

import org.springframework.stereotype.Component;

/**  
 * <p>Title: HystrixClass</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年8月6日  
 */

@Component
public class HystrixService implements HelloService{

	/**  
	 * 断路器返回错误信息
	 * <p>Title: sayHiFromClientOne</p>  
	 * <p>Description: </p>  
	 * @author Graves
	 * @date 2019年8月6日   
	 * @param name
	 * @return  
	 */ 
	@Override
	public String sayHiFromClientOne(String name) {
		return "hi,"+name+",I'm Hystrix, I'm so sorry about of the service is error!";
	}
	
}
