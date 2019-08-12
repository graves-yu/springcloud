/**
 * 
 */
package com.graves.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**  
 * <p>Title: ConfigServerApplication</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年8月9日  
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
