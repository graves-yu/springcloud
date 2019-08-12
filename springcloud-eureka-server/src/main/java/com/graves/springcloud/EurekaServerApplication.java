/**
 * 
 */
package com.graves.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**  
 * <p>Title: EurekaServerApplication</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年8月6日  
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	public static void main(String[] args) {
        SpringApplication.run( EurekaServerApplication.class, args );
    }
}
