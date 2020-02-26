package com.report.generator.model;

import net.sf.flatpack.DataSet;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProcessedFutureMovement {

    @NotNull
    @Size(min=3, max=3)
    private String recordCode;
    private String clientType;
    private String clientNumber;
    private String accountNumber;
    private String subAccountNumber;
    private String oppositePartyCode;
    private String productGroupCode;
    private String exchangeCode;
    private String symbol;
    private String expirationDate;
    private String currencyCode;
    private String movementCode;
    private String buySellCode;
    private String quantityLongSign;
    private String quantityLong;
    private String quantityShortSign;
    private String quantityShort;
    private String brokerFeeDec;
    private String brokerFeeDc;
    private String brokerFeeCurCode;
    private String clearingFeeDec;
    private String clearingFeeDc;
    private String clearingFeeCurCode;
    private String commission;
    private String commissionDc;
    private String commissionCurCode;
    private String transactionDate;
    private String futureReference;
    private String ticketNumber;
    private String externalNumber;
    private String transactionPriceDec;
    private String traderInitials;
    private String oppositeTraderId;
    private String openCloseCode;
    private String filler;


    public static ProcessedFutureMovement getInstance(DataSet ds) {
        ProcessedFutureMovement processedFutureMovement = new ProcessedFutureMovement();
        processedFutureMovement.recordCode = ds.getString("RECORD_CODE");
        processedFutureMovement.clientType = ds.getString("CLIENT_TYPE");
        processedFutureMovement.clientNumber = ds.getString("CLIENT_NUMBER");
        processedFutureMovement.accountNumber = ds.getString("ACCOUNT_NUMBER");
        processedFutureMovement.subAccountNumber = ds.getString("SUBACCOUNT_NUMBER");
        processedFutureMovement.oppositePartyCode = ds.getString("OPPOSITE_PARTY_CODE");
        processedFutureMovement.productGroupCode = ds.getString("PRODUCT_GROUP_CODE");
        processedFutureMovement.exchangeCode = ds.getString("EXCHANGE_CODE");
        processedFutureMovement.symbol = ds.getString("SYMBOL");
        processedFutureMovement.expirationDate = ds.getString("EXPIRATION_DATE");
        processedFutureMovement.currencyCode = ds.getString("CURRENCY_CODE");
        processedFutureMovement.movementCode = ds.getString("MOVEMENT_CODE");
        processedFutureMovement.buySellCode = ds.getString("BUY_SELL_CODE");
        processedFutureMovement.quantityLongSign = ds.getString("QUANTTTY_LONG_SIGN");
        processedFutureMovement.quantityLong = ds.getString("QUANTTTY_LONG");
        processedFutureMovement.quantityShortSign = ds.getString("QUANTTTY_SHORT_SIGN");
        processedFutureMovement.quantityShort = ds.getString("QUANTTTY_SHORT");
        processedFutureMovement.brokerFeeDec = ds.getString("EXCH_BROKER_FEE_DEC");
        processedFutureMovement.brokerFeeDc = ds.getString("EXCH_BROKER_FEE_DC");
        processedFutureMovement.brokerFeeCurCode = ds.getString("EXCH_BROKER_FEE_CUR_CODE");
        processedFutureMovement.clearingFeeDec = ds.getString("CLEARING_FEE_DEC");
        processedFutureMovement.clearingFeeDc = ds.getString("CLEARING_FEE_DC");
        processedFutureMovement.clearingFeeCurCode = ds.getString("CLEARING_FEE_CUR_CODE");
        processedFutureMovement.commission = ds.getString("COMMISSION");
        processedFutureMovement.commissionDc = ds.getString("COMMISSION_DC");
        processedFutureMovement.commissionCurCode = ds.getString("COMMISSION_CUR_CODE");
        processedFutureMovement.transactionDate = ds.getString("TRANSACTION_DATE");
        processedFutureMovement.futureReference = ds.getString("FUTURE_REFERENCE");
        processedFutureMovement.ticketNumber = ds.getString("TICKET_NUMBER");
        processedFutureMovement.externalNumber = ds.getString("EXTERNAL_NUMBER");
        processedFutureMovement.transactionPriceDec = ds.getString("TRANSACTON_PRICE_DEC");
        processedFutureMovement.traderInitials = ds.getString("TRADER_INITIALS");
        processedFutureMovement.oppositeTraderId = ds.getString("OPPOSITE_TRADER_ID");
        processedFutureMovement.openCloseCode = ds.getString("OPEN_CLOSE_CODE");
        processedFutureMovement.filler = ds.getString("FILLER");
        return processedFutureMovement;
    }

    public String getRecordCode() {
        return recordCode;
    }

    public void setRecordCode(String recordCode) {
        this.recordCode = recordCode;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSubAccountNumber() {
        return subAccountNumber;
    }

    public void setSubAccountNumber(String subAccountNumber) {
        this.subAccountNumber = subAccountNumber;
    }

    public String getOppositePartyCode() {
        return oppositePartyCode;
    }

    public void setOppositePartyCode(String oppositePartyCode) {
        this.oppositePartyCode = oppositePartyCode;
    }

    public String getProductGroupCode() {
        return productGroupCode;
    }

    public void setProductGroupCode(String productGroupCode) {
        this.productGroupCode = productGroupCode;
    }

    public String getExchangeCode() {
        return exchangeCode;
    }

    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getMovementCode() {
        return movementCode;
    }

    public void setMovementCode(String movementCode) {
        this.movementCode = movementCode;
    }

    public String getBuySellCode() {
        return buySellCode;
    }

    public void setBuySellCode(String buySellCode) {
        this.buySellCode = buySellCode;
    }

    public String getQuantityLongSign() {
        return quantityLongSign;
    }

    public void setQuantityLongSign(String quantityLongSign) {
        this.quantityLongSign = quantityLongSign;
    }

    public String getQuantityLong() {
        return quantityLong;
    }

    public void setQuantityLong(String quantityLong) {
        this.quantityLong = quantityLong;
    }

    public String getQuantityShortSign() {
        return quantityShortSign;
    }

    public void setQuantityShortSign(String quantityShortSign) {
        this.quantityShortSign = quantityShortSign;
    }

    public String getQuantityShort() {
        return quantityShort;
    }

    public void setQuantityShort(String quantityShort) {
        this.quantityShort = quantityShort;
    }

    public String getBrokerFeeDec() {
        return brokerFeeDec;
    }

    public void setBrokerFeeDec(String brokerFeeDec) {
        this.brokerFeeDec = brokerFeeDec;
    }

    public String getBrokerFeeDc() {
        return brokerFeeDc;
    }

    public void setBrokerFeeDc(String brokerFeeDc) {
        this.brokerFeeDc = brokerFeeDc;
    }

    public String getBrokerFeeCurCode() {
        return brokerFeeCurCode;
    }

    public void setBrokerFeeCurCode(String brokerFeeCurCode) {
        this.brokerFeeCurCode = brokerFeeCurCode;
    }

    public String getClearingFeeDec() {
        return clearingFeeDec;
    }

    public void setClearingFeeDec(String clearingFeeDec) {
        this.clearingFeeDec = clearingFeeDec;
    }

    public String getClearingFeeDc() {
        return clearingFeeDc;
    }

    public void setClearingFeeDc(String clearingFeeDc) {
        this.clearingFeeDc = clearingFeeDc;
    }

    public String getClearingFeeCurCode() {
        return clearingFeeCurCode;
    }

    public void setClearingFeeCurCode(String clearingFeeCurCode) {
        this.clearingFeeCurCode = clearingFeeCurCode;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getCommissionDc() {
        return commissionDc;
    }

    public void setCommissionDc(String commissionDc) {
        this.commissionDc = commissionDc;
    }

    public String getCommissionCurCode() {
        return commissionCurCode;
    }

    public void setCommissionCurCode(String commissionCurCode) {
        this.commissionCurCode = commissionCurCode;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getFutureReference() {
        return futureReference;
    }

    public void setFutureReference(String futureReference) {
        this.futureReference = futureReference;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getExternalNumber() {
        return externalNumber;
    }

    public void setExternalNumber(String externalNumber) {
        this.externalNumber = externalNumber;
    }

    public String getTransactionPriceDec() {
        return transactionPriceDec;
    }

    public void setTransactionPriceDec(String transactionPriceDec) {
        this.transactionPriceDec = transactionPriceDec;
    }

    public String getTraderInitials() {
        return traderInitials;
    }

    public void setTraderInitials(String traderInitials) {
        this.traderInitials = traderInitials;
    }

    public String getOppositeTraderId() {
        return oppositeTraderId;
    }

    public void setOppositeTraderId(String oppositeTraderId) {
        this.oppositeTraderId = oppositeTraderId;
    }

    public String getOpenCloseCode() {
        return openCloseCode;
    }

    public void setOpenCloseCode(String openCloseCode) {
        this.openCloseCode = openCloseCode;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }
}
