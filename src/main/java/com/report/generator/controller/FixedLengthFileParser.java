package com.report.generator.controller;

import com.report.generator.model.ProcessedFutureMovement;
import net.sf.flatpack.DataSet;
import net.sf.flatpack.DefaultParserFactory;
import net.sf.flatpack.Parser;
import org.springframework.stereotype.Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Controller
public class FixedLengthFileParser {

    private static final Logger LOGGER = Logger.getLogger(FixedLengthFileParser.class.getName());

    public static List<ProcessedFutureMovement> getProcessedFutureMovements(String mappingLocation, String inputLocation) throws FileNotFoundException {

        final Parser fixedLengthParser = DefaultParserFactory.getInstance().newFixedLengthParser(new FileReader(mappingLocation), new FileReader(inputLocation));
        final DataSet ds = fixedLengthParser.parse();
        List<ProcessedFutureMovement> processedFutureMovements = new ArrayList<>();
        while (ds.next()) {
            processedFutureMovements.add(ProcessedFutureMovement.getInstance(ds));
        }
        return processedFutureMovements;
    }
}
