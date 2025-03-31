package com.nuamx.png.wri.kafka.load.data.il.beans;

import java.io.Serializable;

public class SettlementRunBean implements Serializable {

	private static final long serialVersionUID = 2958784206141616220L;
	
	private String businessDate;
	private String ccpCode;
	private String csdCode;
	private Integer numberOfSettledInstructions;
	private Integer sequenceNumber;
	private String 	settlementDate;
	private String status;
	private Integer totalNumberOfInstructions;

	private String triggerTimestamp;
	private String user;

	public String getBusinessDate() {
		return businessDate;
	}
	public void setBusinessDate(String businessDate) {
		this.businessDate = businessDate;
	}
	public String getCcpCode() {
		return ccpCode;
	}
	public void setCcpCode(String ccpCode) {
		this.ccpCode = ccpCode;
	}
	public String getCsdCode() {
		return csdCode;
	}
	public void setCsdCode(String csdCode) {
		this.csdCode = csdCode;
	}
	public Integer getNumberOfSettledInstructions() {
		return numberOfSettledInstructions;
	}
	public void setNumberOfSettledInstructions(Integer numberOfSettledInstructions) {
		this.numberOfSettledInstructions = numberOfSettledInstructions;
	}
	public Integer getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public String getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getTotalNumberOfInstructions() {
		return totalNumberOfInstructions;
	}
	public void setTotalNumberOfInstructions(Integer totalNumberOfInstructions) {
		this.totalNumberOfInstructions = totalNumberOfInstructions;
	}
	public String getTriggerTimestamp() {
		return triggerTimestamp;
	}
	public void setTriggerTimestamp(String triggerTimestamp) {
		this.triggerTimestamp = triggerTimestamp;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	
}
