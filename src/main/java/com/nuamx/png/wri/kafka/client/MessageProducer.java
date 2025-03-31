package com.nuamx.png.wri.kafka.client;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nuamx.png.wri.kafka.utils.KafkaUtil;

public class MessageProducer {
	
	 private static final Logger logger = LoggerFactory.getLogger(MessageProducer.class);
	 private static boolean withsecurity = false; //TODO Cambiar con/sin seguridad
	 private static String messageType = "1002"; //1001 1002

	public static void main(String[] args) {
		
		try {
			//String topic="nuam-vre-png.raw.settlement-run-by-csd-pe.avro";
			String topic="nuam-vre-png.raw.asset-and-cash-settlement-instruction-pe.avro";
			//String topic="nuam-vre-png.raw.ilo-instruction-pe.avro";

			
			
			KafkaUtil.sendKafkaMessage(withsecurity,topic, messageType);
			
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} 
		

	}

}
