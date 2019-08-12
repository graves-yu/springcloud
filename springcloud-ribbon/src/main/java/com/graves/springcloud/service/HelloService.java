/**
 * 
 */
package com.graves.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

/**  
 * <p>Title: HelloService</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年8月6日  
 */
@Service
public class HelloService {
	@Autowired
    RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
	
	public String hiError(String name) {
		return "hi,"+name+",I'm Hystrix, I'm so sorry about of the service is error!";
	}
}
