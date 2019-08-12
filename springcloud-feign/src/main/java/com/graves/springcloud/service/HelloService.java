/**
 * 
 */
package com.graves.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**  
 * <p>Title: HelloService</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年8月6日  
 */

@FeignClient(value = "service-hi", fallback = HystrixService.class)
public interface HelloService {
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
