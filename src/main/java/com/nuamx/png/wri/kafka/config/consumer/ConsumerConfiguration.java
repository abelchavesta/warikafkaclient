package com.nuamx.png.wri.kafka.config.consumer;

import java.util.Properties;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.config.SslConfigs;
import org.apache.kafka.common.serialization.StringDeserializer;

import com.nuamx.png.wri.kafka.constants.ConfigurationConstants;

import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;

public class ConsumerConfiguration {
	
	
	public static Properties init ( boolean security ) {
		
		Properties props = new Properties();
		
		// Configure kafka settings
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, ConfigurationConstants.SERVERS);
        props.put(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, ConfigurationConstants.REGISTRY_URL);
        
        props.put(ConsumerConfig.GROUP_ID_CONFIG, ConfigurationConstants.GROUP_ID_CONFIG);
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        props.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true); 
        
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
    
	/**
     * Creates the Kafka producer.
     */
    public static KafkaConsumer<String,Object> createKafkaConsumer(boolean security,Object object) {
        
    	Properties props =init(security);
    	final KafkaConsumer<String,Object> consumer = new KafkaConsumer<>(props);
    	
    	return consumer;

    }

}
