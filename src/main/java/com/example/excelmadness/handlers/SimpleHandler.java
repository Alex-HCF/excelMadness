package com.example.excelmadness.handlers;

public class SimpleHandler implements Proto{
    @Override
    public String process(String cellValue) {
        return cellValue + " hello";
    }
}
