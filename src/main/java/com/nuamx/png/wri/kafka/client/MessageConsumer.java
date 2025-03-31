package com.nuamx.png.wri.kafka.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nuamx.png.wri.kafka.utils.KafkaUtil;

public class MessageConsumer {

	 private static final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
	 private static boolean withsecurity = false; //TODO Cambiar con/sin seguridad
	 private static String messageType = "2001"; //1001 1002

	public static void main(String[] args) {
		
		try {
			String topic="nuam-wri-png.raw.settlement-fulfillment-status-pe.avro";

			
			
			KafkaUtil.receiveKafkaMessage(withsecurity,topic, messageType);
			
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} 
		
	}
	
}
