/**
 * 
 */
package com.graves.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.graves.springcloud.service.HelloService;

/**  
 * <p>Title: HelloController</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年8月6日  
 */

@RestController
public class HelloController {
	@Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
