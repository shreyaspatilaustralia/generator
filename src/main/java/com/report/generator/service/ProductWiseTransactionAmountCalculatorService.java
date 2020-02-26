package com.report.generator.service;

import com.report.generator.model.ProcessedFutureMovement;
import com.report.generator.model.SummaryReportData;
import com.report.generator.utility.ProcessedFutureMovementToSummaryReportDataConverter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductWiseTransactionAmountCalculatorService {

    @Autowired
    private ProcessedFutureMovementToSummaryReportDataConverter converter;

    public void calculateProductWiseTotalAmount(List<ProcessedFutureMovement> processedFutureMovementList){

        Map<SummaryReportData, Double> productWiseAmount = new HashMap<>();
        for (ProcessedFutureMovement processedFutureMovement:
             processedFutureMovementList) {
            SummaryReportData summaryReportData = converter.convert(processedFutureMovement);
            if(productWiseAmount.containsKey(summaryReportData)){
                Double amount = productWiseAmount.get(summaryReportData);
                productWiseAmount.put(summaryReportData, amount + summaryReportData.getTotalTransactionAmount().getAmount());
            }else{
                productWiseAmount.put(summaryReportData, summaryReportData.getTotalTransactionAmount().getAmount());
            }
        }
    }
}
