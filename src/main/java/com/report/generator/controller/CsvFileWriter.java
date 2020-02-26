package com.report.generator.controller;

import com.opencsv.CSVWriter;
import com.report.generator.model.SummaryReportData;
import org.springframework.stereotype.Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Controller
public class CsvFileWriter {

    private static final Logger LOGGER = Logger.getLogger(CsvFileWriter.class.getName());

    public void WriteToCsvFile(String outputLocation, List<SummaryReportData> summaryReportData) throws IOException {
        File file = new File(outputLocation);
        CSVWriter writer = null;
        try {
            writer = new CSVWriter(new FileWriter(file));
            LOGGER.log(Level.FINE, "generating summaryReportData from input to write to csv file");
            List<String[]> content = summaryReportData.stream().map(summaryReportDataInput -> summaryReportDataInput.getCsvContent()).collect(Collectors.toList());
            writer.writeAll(content);

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
