package com.report.generator.model;

import java.util.Objects;

public class TotalTransactionAmount {

    private String quantityLong;
    private String quantityShort;

    public TotalTransactionAmount(String quantityLong, String quantityShort) {
        this.quantityLong = quantityLong;
        this.quantityShort = quantityShort;
    }

    public String getQuantityLong() {
        return quantityLong;
    }

    public void setQuantityLong(String quantityLong) {
        this.quantityLong = quantityLong;
    }

    public String getQuantityShort() {
        return quantityShort;
    }

    public void setQuantityShort(String quantityShort) {
        this.quantityShort = quantityShort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TotalTransactionAmount that = (TotalTransactionAmount) o;
        return Objects.equals(quantityLong, that.quantityLong) &&
                Objects.equals(quantityShort, that.quantityShort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantityLong, quantityShort);
    }

    public Double getAmount() {
        return null;
    }
}
