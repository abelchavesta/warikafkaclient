package com.nuamx.png.wri.kafka.load.data.il;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import com.nuamx.bus.components.Instrument;
import com.nuamx.bus.constants.Currency;
import com.nuamx.bus.constants.Exchange;
import com.nuamx.bus.message.vericlear.IloInstruction;
import com.nuamx.png.wri.kafka.load.data.il.beans.IloInstructionBean;

public class IloInstructionMessage {
	
	
	public static void createMessage(IloInstruction iloInstruction) {
		
		IloInstructionBean bean=load();
		
		iloInstruction.setInstructionId(bean.getInstructionId());
		iloInstruction.setBusinessDate(bean.getBusinessDate());
		iloInstruction.setSequenceNumber(bean.getSequenceNumber());//no
		iloInstruction.setCsdCode(bean.getCsdCode());
		iloInstruction.setCcpCode(bean.getCcpCode());
		iloInstruction.setSegmentCode(bean.getSegmentCode());
		iloInstruction.setAccountId(bean.getAccountId());//personalizado
		iloInstruction.setSettlementDate(bean.getSettlementDate());
		iloInstruction.setTradeDate(bean.getTradeDate());//no
		iloInstruction.setSettlementInstructionType(bean.getSettlementInstructionType());//
		iloInstruction.setIsBeneficialReady(bean.isBeneficialReady());
		iloInstruction.setInstructionIdReference(bean.getInstructionIdReference());
		

		iloInstruction.setInstrument( bean.getInstrument() );//Instruction
		iloInstruction.setQuantity( bean.getQuantity() );
		iloInstruction.setSettledQuantity( bean.getSettledQuantity() );
		
		iloInstruction.setCsdParticipantCode(bean.getCsdParticipantCode());
		iloInstruction.setAccountGroupCode(bean.getAccountGroupCode());
		iloInstruction.setPositionAccountCsdAccountCode(bean.getPositionAccountCsdAccountCode());//
		iloInstruction.setStatus(bean.getStatus());
		iloInstruction.setClearingMemberCode(bean.getClearingMemberCode());
		iloInstruction.setTradingMemberCode(bean.getTradingMemberCode());
		iloInstruction.setProductCode(bean.getProductCode());

		iloInstruction.setLastUpdatedTimestamp( bean.getLastUpdatedTimestamp() );
		iloInstruction.setLastUpdatedUser(bean.getLastUpdatedUser());
		iloInstruction.setAccountGroupCsdAccountCode(bean.getAccountGroupCsdAccountCode());
		iloInstruction.setAccountGroupType(bean.getAccountGroupType());
		iloInstruction.setAssetKeySymbol(bean.getAssetKeySymbol());
		iloInstruction.setAssetKeySymbolType(bean.getAssetKeySymbolType());
		
		
	}
	
	
	public static IloInstructionBean load() {
		
		IloInstructionBean bean=new IloInstructionBean();
		
		bean.setInstructionId(2803);
		bean.setBusinessDate("2025-03-11");
		bean.setSequenceNumber(100);//no
		bean.setCsdCode("CAVALI");
		bean.setCcpCode("CRCP");
		bean.setSegmentCode("EQ");
		bean.setAccountId("12");//personalizado
		bean.setSettlementDate("2025-03-13");
		bean.setTradeDate("2025-03-11");//no
		bean.setSettlementInstructionType("PRU");//
		bean.setBeneficialReady(true);
		bean.setInstructionIdReference(20);
		
		Instrument instrument=new Instrument();
		instrument.setCurrencyAdjustment(Currency.PEN);
		instrument.setCurrencyIssue(Currency.PEN);
		instrument.setExchange(Exchange.NUAM);
		instrument.setIsin("PEP214001005");//no
		instrument.setSecuritySubType("PEP214001005");//no
		instrument.setSecurityType("PEP214001005");//no
		instrument.setSymbol("PEP214001005");//no
		bean.setInstrument( instrument );//Instruction
		bean.setQuantity( new BigDecimal(-100) );
		bean.setSettledQuantity( new BigDecimal(0) );
		
		bean.setCsdParticipantCode("104");
		bean.setAccountGroupCode("OSA");
		bean.setPositionAccountCsdAccountCode("200");//
		bean.setStatus("SENT");
		bean.setClearingMemberCode("1");
		bean.setTradingMemberCode("104");
		bean.setProductCode("EQ-PEN-T2");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());

		//Instant instant = Instant.parse("2022-02-15T18:35:24.00Z");
		Instant instant = Instant.now();
		String formattedInstant = formatter.format(instant);

		bean.setLastUpdatedTimestamp( formattedInstant );
		bean.setLastUpdatedUser("super-peru");
		bean.setAccountGroupCsdAccountCode("123");
		bean.setAccountGroupType("OSA");
		bean.setAssetKeySymbol("PEP214001005");
		bean.setAssetKeySymbolType("ISIN");
		
		return bean;
		
		
	}
}
