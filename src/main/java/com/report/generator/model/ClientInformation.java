package com.report.generator.model;

import java.util.Objects;

public class ClientInformation {

    private String clientType;
    private String clientNumber;
    private String accountNumber;
    private String subAccountNumber;

    public ClientInformation(String clientType, String clientNumber, String accountNumber, String subAccountNumber) {
        this.clientType = clientType;
        this.clientNumber = clientNumber;
        this.accountNumber = accountNumber;
        this.subAccountNumber = subAccountNumber;
    }

    public String getClientType() {
        return clientType;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getSubAccountNumber() {
        return subAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientInformation that = (ClientInformation) o;
        return Objects.equals(clientType, that.clientType) &&
                Objects.equals(clientNumber, that.clientNumber) &&
                Objects.equals(accountNumber, that.accountNumber) &&
                Objects.equals(subAccountNumber, that.subAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientType, clientNumber, accountNumber, subAccountNumber);
    }

    @Override
    public String toString() {
        return clientType + clientNumber + accountNumber + subAccountNumber;
    }
}
