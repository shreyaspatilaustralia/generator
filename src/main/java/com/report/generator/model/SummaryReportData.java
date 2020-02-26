package com.report.generator.model;

import java.util.Objects;

public class SummaryReportData {

    private ClientInformation clientInformation;
    private ProductInformation productInformation;
    private TotalTransactionAmount totalTransactionAmount;

    public SummaryReportData(ClientInformation clientInformation, ProductInformation productInformation, TotalTransactionAmount totalTransactionAmount) {
        this.clientInformation = clientInformation;
        this.productInformation = productInformation;
        this.totalTransactionAmount = totalTransactionAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SummaryReportData that = (SummaryReportData) o;
        return Objects.deepEquals(productInformation, that.productInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productInformation);
    }

    public ClientInformation getClientInformation() {
        return clientInformation;
    }

    public void setClientInformation(ClientInformation clientInformation) {
        this.clientInformation = clientInformation;
    }

    public ProductInformation getProductInformation() {
        return productInformation;
    }

    public void setProductInformation(ProductInformation productInformation) {
        this.productInformation = productInformation;
    }

    public TotalTransactionAmount getTotalTransactionAmount() {
        return totalTransactionAmount;
    }

    public void setTotalTransactionAmount(TotalTransactionAmount totalTransactionAmount) {
        this.totalTransactionAmount = totalTransactionAmount;
    }

    public String[] getCsvContent(){
        String[] content = new String[3];
        content[0] = clientInformation.toString();
        content[1] = productInformation.toString();
        content[2] = totalTransactionAmount.toString();
        return content;
    }

    @Override
    public String toString() {
        return clientInformation.toString() + productInformation.toString() + totalTransactionAmount.toString();
    }
}
