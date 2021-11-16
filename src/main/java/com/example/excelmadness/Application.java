package com.example.excelmadness;

import com.example.excelmadness.parse.ExcelProcessor;

import java.io.IOException;
import java.text.ParseException;

public class Application {

    public static void main(String[] args) throws IOException, ParseException {
        ExcelProcessor.processExcel();
    }

}
