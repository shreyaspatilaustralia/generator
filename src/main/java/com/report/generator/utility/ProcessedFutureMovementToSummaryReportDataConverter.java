package com.report.generator.utility;

import com.report.generator.model.*;

public class ProcessedFutureMovementToSummaryReportDataConverter {

    public SummaryReportData convert(ProcessedFutureMovement processedFutureMovement){
        ClientInformation clientInformation = getClientInformation(processedFutureMovement);
        ProductInformation productInformation = getProductInformation(processedFutureMovement);
        TotalTransactionAmount totalTransactionAmount = getTotalTransactionAmount(processedFutureMovement);
        return new SummaryReportData(clientInformation, productInformation, totalTransactionAmount);
    }

    private TotalTransactionAmount getTotalTransactionAmount(ProcessedFutureMovement processedFutureMovement) {
        return new TotalTransactionAmount(processedFutureMovement.getQuantityLong(), processedFutureMovement.getQuantityShort());
    }

    private ProductInformation getProductInformation(ProcessedFutureMovement processedFutureMovement) {
        return new ProductInformation(processedFutureMovement.getExchangeCode(), processedFutureMovement.getProductGroupCode(),
                processedFutureMovement.getSymbol(), processedFutureMovement.getExpirationDate());
    }

    private ClientInformation getClientInformation(ProcessedFutureMovement processedFutureMovement) {
        return new ClientInformation(processedFutureMovement.getClientType(), processedFutureMovement.getClientNumber(),
                processedFutureMovement.getAccountNumber(), processedFutureMovement.getSubAccountNumber());
    }
}
