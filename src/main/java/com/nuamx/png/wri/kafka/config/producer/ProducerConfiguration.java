package com.nuamx.png.wri.kafka.config.producer;

import java.util.Properties;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.SslConfigs;
import org.apache.kafka.common.serialization.StringSerializer;

import com.nuamx.png.wri.kafka.constants.ConfigurationConstants;

import io.confluent.kafka.serializers.KafkaAvroSerializer;

public class ProducerConfiguration {
	
	
	private static Properties init ( boolean security ) {
		
		Properties props = new Properties();
		
		// Configure kafka settings
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, ConfigurationConstants.SERVERS);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);//Serializando conector

        props.put("acks", "all");
        props.put("retries", 0);
        
        
        //Configure Service Registry location
        props.put("schema.registry.url", ConfigurationConstants.REGISTRY_URL);

        if(security) {
        	configureSecurityIfPresent(props);
        }
        
        return props;
	}
	
    private static void configureSecurityIfPresent(Properties props) {

    	props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, ConfigurationConstants.SECURITY_PROTOCOL_CONFIG);
        
        props.put("ssl.endpoint.identification.algorithm", ConfigurationConstants.ALGORITHM);

        props.put(SslConfigs.SSL_KEYSTORE_LOCATION_CONFIG, ConfigurationConstants.KEYSTORE_LOCATION); 
        props.put(SslConfigs.SSL_KEYSTORE_PASSWORD_CONFIG, ConfigurationConstants.KEYSTORE_PASSWORD);
        //props.put(SslConfigs.SSL_KEY_PASSWORD_CONFIG, Config.KEY_PASSWORD); //Only local

        props.put(SslConfigs.SSL_TRUSTSTORE_LOCATION_CONFIG, ConfigurationConstants.TRUSTSTORE_LOCATION); 
        props.put(SslConfigs.SSL_TRUSTSTORE_PASSWORD_CONFIG, ConfigurationConstants.TRUSTSTORE_PASSWORD);
        
    }
	
	
	public static KafkaProducer<Object, Object> createKafkaProducer ( boolean security ) {
		
		Properties properties=init(security);
		KafkaProducer<Object, Object> producer = new KafkaProducer<>(properties);
		
		return producer;
		
	}
	
	
}
