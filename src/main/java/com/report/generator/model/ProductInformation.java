package com.report.generator.model;

import java.util.Objects;

public class ProductInformation {

    private String productGroupCode;
    private String exchangeCode;
    private String symbol;
    private String expirationDate;

    public ProductInformation(String productGroupCode, String exchangeCode, String symbol, String expirationDate) {
        this.productGroupCode = productGroupCode;
        this.exchangeCode = exchangeCode;
        this.symbol = symbol;
        this.expirationDate = expirationDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductInformation that = (ProductInformation) o;
        return Objects.equals(productGroupCode, that.productGroupCode) &&
                Objects.equals(exchangeCode, that.exchangeCode) &&
                Objects.equals(symbol, that.symbol) &&
                Objects.equals(expirationDate, that.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productGroupCode, exchangeCode, symbol, expirationDate);
    }
}
