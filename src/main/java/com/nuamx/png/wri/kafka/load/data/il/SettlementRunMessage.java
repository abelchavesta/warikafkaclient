package com.nuamx.png.wri.kafka.load.data.il;

import com.nuamx.bus.message.vericlear.SettlementRunByCsd;
import com.nuamx.png.wri.kafka.load.data.il.beans.SettlementRunBean;

public class SettlementRunMessage {
	
	public static void createMessage(SettlementRunByCsd settlementRunByCsd) {
		
		SettlementRunBean bean=load();
		
		settlementRunByCsd.setBusinessDate(bean.getBusinessDate());
		settlementRunByCsd.setCcpCode(bean.getCcpCode());
		settlementRunByCsd.setCsdCode(bean.getCsdCode());
		settlementRunByCsd.setNumberOfSettledInstructions(bean.getNumberOfSettledInstructions());
		settlementRunByCsd.setSequenceNumber(bean.getSequenceNumber());
		settlementRunByCsd.setSettlementDate(bean.getSettlementDate());
		settlementRunByCsd.setStatus(bean.getStatus());
		settlementRunByCsd.setTotalNumberOfInstructions(bean.getTotalNumberOfInstructions());
		settlementRunByCsd.setTriggerTimestamp(bean.getTriggerTimestamp());
		settlementRunByCsd.setUser(bean.getUser());

	}
	
	
	
	public static SettlementRunBean load() {
		
		SettlementRunBean bean=new SettlementRunBean();
		
		bean.setBusinessDate("2025-03-10");
		bean.setCcpCode("CRCP");
		bean.setCsdCode("CAVALI");
		bean.setNumberOfSettledInstructions(0);
		bean.setSequenceNumber(2);
		bean.setSettlementDate("2025-03-10");
		bean.setStatus("CREATED");
		bean.setTotalNumberOfInstructions(6);
		bean.setTriggerTimestamp("2025-02-18T21:52:17.579Z");
		bean.setUser("super-peru");
		
		return bean;
	}
	
	
}
