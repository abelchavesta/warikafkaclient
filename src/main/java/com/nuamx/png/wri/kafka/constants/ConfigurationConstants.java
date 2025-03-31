package com.nuamx.png.wri.kafka.constants;

public class ConfigurationConstants {

	public static final String REGISTRY_URL = "http://192.168.56.121:8082/apis/ccompat/v7";

    public static final String SERVERS = "192.168.56.121:29092";//TODO local no secure

    public static final String TOPIC_NAME = "nuam-wri-png.raw.receive.ccp.guaranteeblock.per.avro";//TODO Cambiar en Bus
    
    //Consumers
    public static final String GROUP_ID_CONFIG="nuam-wri-png-group";
    
    public static final String GROUP_ID = "default";//TODO Cambiar según el grupo generado
    public static final String ARTIFACT_ID ="nuam-wri-png.raw.receive.ccp.guaranteeblock.per.avro-value";//TODO Según el ambiente especificado
    
    public static final String KEYSTORE_LOCATION="C:/Users/abel.chavesta/Documents/Configuraciones/security/keystore/nuam-wri-png-user-producer.jks";//TODO  Replace with the absolute path on your machine
    public static final String KEYSTORE_PASSWORD="SY5D5ZWxBX8UGv8S15CgUc9lElhbIZxm";
    
    public static final String TRUSTSTORE_LOCATION="C:/Users/abel.chavesta/Documents/Configuraciones/security/truststore/nuam-cluster-cluster-ca-cert.jks";//TODO Replace with the absolute path on your machine
    public static final String TRUSTSTORE_PASSWORD="tSfhAFaap0k0";
    
    public static final String ALGORITHM="";
    
    public static final String SECURITY_PROTOCOL_CONFIG="SSL";
	
}
