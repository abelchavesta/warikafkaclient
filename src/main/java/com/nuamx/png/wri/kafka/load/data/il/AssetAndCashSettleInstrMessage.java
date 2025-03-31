package com.nuamx.png.wri.kafka.load.data.il;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.nuamx.bus.components.Instrument;
import com.nuamx.bus.constants.Currency;
import com.nuamx.bus.constants.Exchange;
import com.nuamx.bus.message.vericlear.AssetAndCashSettlementInstruction;
import com.nuamx.png.wri.kafka.load.data.il.beans.AssetAndCashSettleInstrBean;

public class AssetAndCashSettleInstrMessage {

	public static void createMessage(AssetAndCashSettlementInstruction assetAndCashSettlementInstruction) throws Exception{
		
		AssetAndCashSettleInstrBean bean=load();
		
		assetAndCashSettlementInstruction.setAccountGroupCode( bean.getAccountGroupCode() );
		assetAndCashSettlementInstruction.setAccountGroupType( bean.getAccountGroupType() );
		assetAndCashSettlementInstruction.setAssetKeySymbol( bean.getAssetKeySymbol() );
		assetAndCashSettlementInstruction.setAssetKeySymbolType( bean.getAssetKeySymbolType() );
		assetAndCashSettlementInstruction.setBusinessDate( bean.getBusinessDate() );
		
		
		//assetAndCashSettlementInstruction.setCashAmount( bean.getCashAmount() );//TODO REVISAR ESQUEMA FINAL no
		assetAndCashSettlementInstruction.setCashAmount( ByteBuffer.wrap(bean.getCashAmount().unscaledValue().toByteArray()) );
		
		//assetAndCashSettlementInstruction.setCashSettledAmount( bean.getCashSettledAmount());//TODO REVISAR ESQUEMA FINAL
		assetAndCashSettlementInstruction.setCashSettledAmount( ByteBuffer.wrap(bean.getCashSettledAmount().unscaledValue().toByteArray()) );
		
		assetAndCashSettlementInstruction.setCcpCode( bean.getCcpCode() );
		assetAndCashSettlementInstruction.setClearingMemberCode( bean.getClearingMemberCode() );
		assetAndCashSettlementInstruction.setCmBankInfo(bean.getCmBankInfo());//no
		assetAndCashSettlementInstruction.setCmCentralBankAccountCode( bean.getCmCentralBankAccountCode() );
		assetAndCashSettlementInstruction.setCmCsdParticipantCode( bean.getCmCsdParticipantCode() );
		assetAndCashSettlementInstruction.setCsdAccountCode( bean.getCsdAccountCode() );
		assetAndCashSettlementInstruction.setCsdCode( bean.getCsdCode() );
		assetAndCashSettlementInstruction.setCurrency( bean.getCurrency() );//Currency
		assetAndCashSettlementInstruction.setCustodianCentralBankAccountCode( bean.getCustodianCentralBankAccountCode() );
		assetAndCashSettlementInstruction.setCustodianCsdParticipantCode( bean.getCustodianCsdParticipantCode() );
		assetAndCashSettlementInstruction.setInstructionId( bean.getInstructionId() );
		assetAndCashSettlementInstruction.setInstructionType( bean.getInstructionType() );
		assetAndCashSettlementInstruction.setInstrument( bean.getInstrument() );//Instruction

		
		//assetAndCashSettlementInstruction.setLastUpdatedTimestamp( bean.getLastUpdatedTimestamp() );//TODO REVISAR ESQUEMA FINAL
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateLast= sdf.parse(bean.getLastUpdatedTimestamp());
		assetAndCashSettlementInstruction.setLastUpdatedTimestamp( dateLast.getTime() );
		
		
		assetAndCashSettlementInstruction.setLastUpdatedUser( bean.getLastUpdatedUser() );
		assetAndCashSettlementInstruction.setProductCode( bean.getProductCode() );
		
		//assetAndCashSettlementInstruction.setQuantity( bean.getQuantity() );//TODO REVISAR ESQUEMA FINAL
		assetAndCashSettlementInstruction.setQuantity( ByteBuffer.wrap(bean.getQuantity().unscaledValue().toByteArray()) );
		
		
		assetAndCashSettlementInstruction.setSegmentCode( bean.getSegmentCode() );
		assetAndCashSettlementInstruction.setSequenceNumber( bean.getSequenceNumber() );//no
		
		
		//assetAndCashSettlementInstruction.setSettledQuantity( bean.getSettledQuantity());//TODO REVISAR ESQUEMA FINAL
		assetAndCashSettlementInstruction.setSettledQuantity( ByteBuffer.wrap(bean.getSettledQuantity().unscaledValue().toByteArray()) );
		
		
		
		assetAndCashSettlementInstruction.setSettlementDate( bean.getSettlementDate());
		assetAndCashSettlementInstruction.setStatus( bean.getStatus() );
		assetAndCashSettlementInstruction.setTmBankInfo( bean.getTmBankInfo());//no
		assetAndCashSettlementInstruction.setTmCentralBankAccountCode( bean.getTmCentralBankAccountCode() );//no
		assetAndCashSettlementInstruction.setTmCsdParticipantCode( bean.getTmCsdParticipantCode() );//no
		
		//assetAndCashSettlementInstruction.setTradeDate( bean.getTradeDate() );//TODO REVISAR ESQUEMA FINAL no
		LocalDate date = LocalDate.parse(bean.getTradeDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		assetAndCashSettlementInstruction.setTradeDate( date );//no
		
		
		
		assetAndCashSettlementInstruction.setTradingMemberCode( bean.getTradingMemberCode() );
		
	}
	
	public static AssetAndCashSettleInstrBean load() {
		
		AssetAndCashSettleInstrBean bean=new AssetAndCashSettleInstrBean();
		
		bean.setAccountGroupCode("OSA");
		bean.setAccountGroupType("OSA");
		bean.setAssetKeySymbol("PEP214001005");
		bean.setAssetKeySymbolType("ISIN");
		bean.setBusinessDate("2025-03-11");
		bean.setCashAmount(new BigDecimal("20") );//no
		bean.setCashSettledAmount( new BigDecimal("890") );
		bean.setCcpCode("CRCP");
		bean.setClearingMemberCode("104");
		bean.setCmBankInfo("");//no
		bean.setCmCentralBankAccountCode("X");
		bean.setCmCsdParticipantCode("104");
		bean.setCsdAccountCode("104_OSA");
		bean.setCsdCode("CAVALI");
		bean.setCurrency(Currency.PEN);//Currency
		bean.setCustodianCentralBankAccountCode("X");
		bean.setCustodianCsdParticipantCode("104");
		bean.setInstructionId(2802);
		bean.setInstructionType("EVP");
		
		
		Instrument instrument=new Instrument();
		instrument.setCurrencyAdjustment(Currency.PEN);
		instrument.setCurrencyIssue(Currency.PEN);
		instrument.setExchange(Exchange.NUAM);
		instrument.setIsin("PEP214001005");//no
		instrument.setSecuritySubType("PEP214001005");//no
		instrument.setSecurityType("PEP214001005");//no
		instrument.setSymbol("PEP214001005");//no
		
		bean.setInstrument( instrument );//Instruction
		
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());

		 //Instant instant = Instant.parse("2022-02-15T18:35:24.00Z");
		 Instant instant = Instant.now();
		 String formattedInstant = formatter.format(instant);

		
		bean.setLastUpdatedTimestamp( formattedInstant );
		bean.setLastUpdatedUser("super-peru");
		bean.setProductCode("EQ-PEN-T2");
		bean.setQuantity( new BigDecimal(-100) );
		bean.setSegmentCode("EQ");
		bean.setSequenceNumber(100);//no
		bean.setSettledQuantity( new BigDecimal(0) );
		bean.setSettlementDate("2025-03-13");
		bean.setStatus("SENT");
		bean.setTmBankInfo("1");//no
		bean.setTmCentralBankAccountCode("1");//no
		bean.setTmCsdParticipantCode("1");//no
		bean.setTradeDate("2025-03-11");//no
		bean.setTradingMemberCode("104");
		
		return bean;
		
	}
	
	
}
