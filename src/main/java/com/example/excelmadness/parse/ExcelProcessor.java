package com.example.excelmadness.parse;

import com.example.excelmadness.handlers.MapHandlers;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.text.ParseException;


public class ExcelProcessor {
    public static void processExcel() throws IOException, ParseException {
        MapHandlers.initMap();
        String excelPath = "/home/trust/projects/ExcelMadness/src/main/resources/input/excel.xlsx";
        String outputPath = "/home/trust/projects/ExcelMadness/src/main/resources/input/excel_out.xlsx";
        FileInputStream file = new FileInputStream(excelPath);
//        FileInputStream file = new FileInputStream(excelPath);

        // Finds the workbook instance for XLSX file
        XSSFWorkbook myWorkBook = new XSSFWorkbook(file);
        var formulaEvaluator = myWorkBook.getCreationHelper().createFormulaEvaluator();
        formulaEvaluator.setIgnoreMissingWorkbooks(true);
        DataFormatter dataFormatter = new DataFormatter();
        // Return first sheet from the XLSX workbook
        XSSFSheet mySheet = myWorkBook.getSheetAt(0);
        // Get iterator to all the rows in current sheet

        // Traversing over each row of XLSX file
        for (Row row : mySheet) {
            if(row.getRowNum() == 0)
                continue;
            // For each row, iterate through each columns
//            System.out.println(row.getRowNum());
            for (Cell cell : row) {
//                Cell cell = cellIterator.next();
                String value;
                try {
                    value = dataFormatter.formatCellValue(cell, formulaEvaluator);
                } catch (Exception e) {
                    value = cell.getStringCellValue();
                }
                String columnName = String.valueOf(cell.getAddress().formatAsString().charAt(0));
                System.out.println(columnName + row.getRowNum());
                String newValue = MapHandlers.map.get(columnName).process(value);
                cell.setCellValue(newValue);
            }
        }
        FileOutputStream out = new FileOutputStream(outputPath);
        myWorkBook.write(out);
        myWorkBook.close();
        out.close();
    }

}

