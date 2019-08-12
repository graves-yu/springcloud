/**
 * 
 */
package com.graves.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**  
 * <p>kafka生产者测试</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年7月29日  
 */

@RestController
@RequestMapping("kafka")
public class KafkaProducerController {
	
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
	
	@RequestMapping("send")
	public String sendMsg(String msg){
		
		kafkaTemplate.send("test", msg);
		return "Success";
	}
}
