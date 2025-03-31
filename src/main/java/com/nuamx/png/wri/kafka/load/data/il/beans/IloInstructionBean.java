package com.nuamx.png.wri.kafka.load.data.il.beans;

import java.io.Serializable;

public class IloInstructionBean implements Serializable{

	private static final long serialVersionUID = -6340462067377261974L;
	
	private String accountGroupCode;
	  private String accountGroupCsdAccountCode;
	  private String accountGroupType;
	  private String accountId;
	  private String assetKeySymbol;
	  private String assetKeySymbolType;
	  private String businessDate;
	  private String ccpCode;
	  private String clearingMemberCode;
	  private String csdCode;
	  private String csdParticipantCode;
	  private int instructionId;
	  private int instructionIdReference;
	  private com.nuamx.bus.components.Instrument instrument;
	  private boolean isBeneficialReady;
	  private String lastUpdatedTimestamp;
	  private String lastUpdatedUser;
	  private String positionAccountCsdAccountCode;
	  private String productCode;
	  private java.math.BigDecimal quantity;
	  private String segmentCode;
	  private java.lang.Integer sequenceNumber;
	  private java.math.BigDecimal settledQuantity;
	  private String settlementDate;
	  private String settlementInstructionType;
	  private String status;
	  private String tradeDate;
	  private String tradingMemberCode;
	public String getAccountGroupCode() {
		return accountGroupCode;
	}
	public void setAccountGroupCode(String accountGroupCode) {
		this.accountGroupCode = accountGroupCode;
	}
	public String getAccountGroupCsdAccountCode() {
		return accountGroupCsdAccountCode;
	}
	public void setAccountGroupCsdAccountCode(String accountGroupCsdAccountCode) {
		this.accountGroupCsdAccountCode = accountGroupCsdAccountCode;
	}
	public String getAccountGroupType() {
		return accountGroupType;
	}
	public void setAccountGroupType(String accountGroupType) {
		this.accountGroupType = accountGroupType;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAssetKeySymbol() {
		return assetKeySymbol;
	}
	public void setAssetKeySymbol(String assetKeySymbol) {
		this.assetKeySymbol = assetKeySymbol;
	}
	public String getAssetKeySymbolType() {
		return assetKeySymbolType;
	}
	public void setAssetKeySymbolType(String assetKeySymbolType) {
		this.assetKeySymbolType = assetKeySymbolType;
	}
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
	public String getClearingMemberCode() {
		return clearingMemberCode;
	}
	public void setClearingMemberCode(String clearingMemberCode) {
		this.clearingMemberCode = clearingMemberCode;
	}
	public String getCsdCode() {
		return csdCode;
	}
	public void setCsdCode(String csdCode) {
		this.csdCode = csdCode;
	}
	public String getCsdParticipantCode() {
		return csdParticipantCode;
	}
	public void setCsdParticipantCode(String csdParticipantCode) {
		this.csdParticipantCode = csdParticipantCode;
	}
	public int getInstructionId() {
		return instructionId;
	}
	public void setInstructionId(int instructionId) {
		this.instructionId = instructionId;
	}
	public int getInstructionIdReference() {
		return instructionIdReference;
	}
	public void setInstructionIdReference(int instructionIdReference) {
		this.instructionIdReference = instructionIdReference;
	}
	public com.nuamx.bus.components.Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(com.nuamx.bus.components.Instrument instrument) {
		this.instrument = instrument;
	}
	public boolean isBeneficialReady() {
		return isBeneficialReady;
	}
	public void setBeneficialReady(boolean isBeneficialReady) {
		this.isBeneficialReady = isBeneficialReady;
	}
	public String getLastUpdatedTimestamp() {
		return lastUpdatedTimestamp;
	}
	public void setLastUpdatedTimestamp(String lastUpdatedTimestamp) {
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}
	public String getLastUpdatedUser() {
		return lastUpdatedUser;
	}
	public void setLastUpdatedUser(String lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}
	public String getPositionAccountCsdAccountCode() {
		return positionAccountCsdAccountCode;
	}
	public void setPositionAccountCsdAccountCode(String positionAccountCsdAccountCode) {
		this.positionAccountCsdAccountCode = positionAccountCsdAccountCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public java.math.BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(java.math.BigDecimal quantity) {
		this.quantity = quantity;
	}
	public String getSegmentCode() {
		return segmentCode;
	}
	public void setSegmentCode(String segmentCode) {
		this.segmentCode = segmentCode;
	}
	public java.lang.Integer getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(java.lang.Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public java.math.BigDecimal getSettledQuantity() {
		return settledQuantity;
	}
	public void setSettledQuantity(java.math.BigDecimal settledQuantity) {
		this.settledQuantity = settledQuantity;
	}
	public String getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}
	public String getSettlementInstructionType() {
		return settlementInstructionType;
	}
	public void setSettlementInstructionType(String settlementInstructionType) {
		this.settlementInstructionType = settlementInstructionType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String getTradingMemberCode() {
		return tradingMemberCode;
	}
	public void setTradingMemberCode(String tradingMemberCode) {
		this.tradingMemberCode = tradingMemberCode;
	}
	  
	  
	  
}
