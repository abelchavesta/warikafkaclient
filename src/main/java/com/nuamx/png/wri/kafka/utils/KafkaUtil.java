package com.nuamx.png.wri.kafka.utils;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nuamx.bus.message.vericlear.AssetAndCashSettlementInstruction;
import com.nuamx.bus.message.vericlear.IloInstruction;
import com.nuamx.bus.message.vericlear.SettlementRunByCsd;
import com.nuamx.png.wri.kafka.config.consumer.ConsumerConfiguration;
import com.nuamx.png.wri.kafka.config.producer.ProducerConfiguration;
import com.nuamx.png.wri.kafka.consumers.FulfillmentStatusConsumer;
import com.nuamx.png.wri.kafka.load.data.il.AssetAndCashSettleInstrMessage;
import com.nuamx.png.wri.kafka.load.data.il.IloInstructionMessage;
import com.nuamx.png.wri.kafka.load.data.il.SettlementRunMessage;

public class KafkaUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(KafkaUtil.class);
	
	public static void sendKafkaMessage(boolean security, String topic,String messageType) throws Exception{
		
		KafkaProducer<Object, Object> producer=null;
		
		try {
			producer=ProducerConfiguration.createKafkaProducer(security);
			
			Object object=searchMessageType(messageType);
			
			ProducerRecord<Object, Object> producedRecord = new ProducerRecord<>(topic, object);
			producer.send(producedRecord);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw e;
		} finally {
			logger.info("Closing the producer.");
            producer.flush();
            producer.close();
        }
		
	}
	
	public static void receiveKafkaMessage(boolean withsecurity, String topic,String messageType) {
		
		Properties prop= ConsumerConfiguration.init(withsecurity);
		searchConsumerType(withsecurity,messageType,topic,prop);
		
	}
	
	public static Object searchMessageType(String messageType) throws Exception{
		
		if (messageType.equals("1001")) {
			SettlementRunByCsd settlementRunByCsd=new SettlementRunByCsd();
			SettlementRunMessage.createMessage(settlementRunByCsd);
			
			return settlementRunByCsd;
		}
		if (messageType.equals("1002")) {
			AssetAndCashSettlementInstruction assetAndCashSettlementInstruction=new AssetAndCashSettlementInstruction();
			AssetAndCashSettleInstrMessage.createMessage(assetAndCashSettlementInstruction);
			
			return assetAndCashSettlementInstruction;
		}
		if (messageType.equals("1003")) {
			IloInstruction iloInstruction=new IloInstruction();
			IloInstructionMessage.createMessage(iloInstruction);
			
			return iloInstruction;
		}
		
		return null;
		
	}
	
	public static void searchConsumerType(boolean withsecurity,String messageType,String topic,Properties prop) {
		
		if (messageType.equals("2001")) {
			FulfillmentStatusConsumer consumer=new FulfillmentStatusConsumer();
			consumer.consume(withsecurity, topic, prop);
		}
		
		
		
	}
	
	@Deprecated
	public static void run() {
		
	}
	
}
