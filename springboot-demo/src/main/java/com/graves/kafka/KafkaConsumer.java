/**
 * 
 */
package com.graves.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**  
 * <p>kafka消费者测试</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年7月29日  
 */

@Component
public class KafkaConsumer {
	
	@KafkaListener(topics = "test")
	public void msgListener(ConsumerRecord<?, ?> record) {
		System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
	}
}
