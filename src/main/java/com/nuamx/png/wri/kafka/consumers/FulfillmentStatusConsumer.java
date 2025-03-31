package com.nuamx.png.wri.kafka.consumers;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import com.nuamx.png.wri.SettlementFulfillmentStatus;

public class FulfillmentStatusConsumer {
	
	//private static final Logger logger = LoggerFactory.getLogger(FulfillmentStatusConsumer.class);
	
	public void consume ( boolean security,String topic,Properties props ) {
		
		
		
		try (final KafkaConsumer<String, SettlementFulfillmentStatus> consumer = new KafkaConsumer<>(props)) {
			
		    consumer.subscribe(Collections.singletonList(topic));
		    

		    while (true) {
		        final ConsumerRecords<String, SettlementFulfillmentStatus> records = consumer.poll(Duration.ofMillis(500));
		        
		        for (final ConsumerRecord<String, SettlementFulfillmentStatus> record : records) {
		            final String key = record.key();
		            final SettlementFulfillmentStatus value = record.value();

		            //logger.info("key = %s, value = %s%n", key, value);
		            System.out.printf("key = %s, value = %s%n", key, value);
		        }
		    }
		}
		
	}
	
}
