package com.nuamx.png.wri.kafka.load.data.il.beans;

import java.io.Serializable;

public class AssetAndCashSettleInstrBean implements Serializable {

	private static final long serialVersionUID = 485298172875589819L;
	
	private String accountGroupCode;
	  private String accountGroupType;
	  private String assetKeySymbol;
	  private String assetKeySymbolType;
	  private String businessDate;
	  private java.math.BigDecimal cashAmount;
	  private java.math.BigDecimal cashSettledAmount;
	  private String ccpCode;
	  private String clearingMemberCode;
	  private String cmBankInfo;
	  private String cmCentralBankAccountCode;
	  private String cmCsdParticipantCode;
	  private String csdAccountCode;
	  private String csdCode;
	  private com.nuamx.bus.constants.Currency currency;
	  private String custodianCentralBankAccountCode;
	  private String custodianCsdParticipantCode;
	  private int instructionId;
	  private String instructionType;
	  private com.nuamx.bus.components.Instrument instrument;
	  private String lastUpdatedTimestamp;
	  private String lastUpdatedUser;
	  private String productCode;
	  private java.math.BigDecimal quantity;
	  private String segmentCode;
	  private java.lang.Integer sequenceNumber;
	  private java.math.BigDecimal settledQuantity;
	  private String settlementDate;
	  private String status;
	  private String tmBankInfo;
	  private String tmCentralBankAccountCode;
	  private String tmCsdParticipantCode;
	  private String tradeDate;
	  private String tradingMemberCode;
	public String getAccountGroupCode() {
		return accountGroupCode;
	}
	public void setAccountGroupCode(String accountGroupCode) {
		this.accountGroupCode = accountGroupCode;
	}
	public String getAccountGroupType() {
		return accountGroupType;
	}
	public void setAccountGroupType(String accountGroupType) {
		this.accountGroupType = accountGroupType;
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
	public java.math.BigDecimal getCashAmount() {
		return cashAmount;
	}
	public void setCashAmount(java.math.BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}
	public java.math.BigDecimal getCashSettledAmount() {
		return cashSettledAmount;
	}
	public void setCashSettledAmount(java.math.BigDecimal cashSettledAmount) {
		this.cashSettledAmount = cashSettledAmount;
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
	public String getCmBankInfo() {
		return cmBankInfo;
	}
	public void setCmBankInfo(String cmBankInfo) {
		this.cmBankInfo = cmBankInfo;
	}
	public String getCmCentralBankAccountCode() {
		return cmCentralBankAccountCode;
	}
	public void setCmCentralBankAccountCode(String cmCentralBankAccountCode) {
		this.cmCentralBankAccountCode = cmCentralBankAccountCode;
	}
	public String getCmCsdParticipantCode() {
		return cmCsdParticipantCode;
	}
	public void setCmCsdParticipantCode(String cmCsdParticipantCode) {
		this.cmCsdParticipantCode = cmCsdParticipantCode;
	}
	public String getCsdAccountCode() {
		return csdAccountCode;
	}
	public void setCsdAccountCode(String csdAccountCode) {
		this.csdAccountCode = csdAccountCode;
	}
	public String getCsdCode() {
		return csdCode;
	}
	public void setCsdCode(String csdCode) {
		this.csdCode = csdCode;
	}
	public com.nuamx.bus.constants.Currency getCurrency() {
		return currency;
	}
	public void setCurrency(com.nuamx.bus.constants.Currency currency) {
		this.currency = currency;
	}
	public String getCustodianCentralBankAccountCode() {
		return custodianCentralBankAccountCode;
	}
	public void setCustodianCentralBankAccountCode(String custodianCentralBankAccountCode) {
		this.custodianCentralBankAccountCode = custodianCentralBankAccountCode;
	}
	public String getCustodianCsdParticipantCode() {
		return custodianCsdParticipantCode;
	}
	public void setCustodianCsdParticipantCode(String custodianCsdParticipantCode) {
		this.custodianCsdParticipantCode = custodianCsdParticipantCode;
	}
	public int getInstructionId() {
		return instructionId;
	}
	public void setInstructionId(int instructionId) {
		this.instructionId = instructionId;
	}
	public String getInstructionType() {
		return instructionType;
	}
	public void setInstructionType(String instructionType) {
		this.instructionType = instructionType;
	}
	public com.nuamx.bus.components.Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(com.nuamx.bus.components.Instrument instrument) {
		this.instrument = instrument;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTmBankInfo() {
		return tmBankInfo;
	}
	public void setTmBankInfo(String tmBankInfo) {
		this.tmBankInfo = tmBankInfo;
	}
	public String getTmCentralBankAccountCode() {
		return tmCentralBankAccountCode;
	}
	public void setTmCentralBankAccountCode(String tmCentralBankAccountCode) {
		this.tmCentralBankAccountCode = tmCentralBankAccountCode;
	}
	public String getTmCsdParticipantCode() {
		return tmCsdParticipantCode;
	}
	public void setTmCsdParticipantCode(String tmCsdParticipantCode) {
		this.tmCsdParticipantCode = tmCsdParticipantCode;
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
