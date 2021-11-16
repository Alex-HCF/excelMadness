package com.example.excelmadness.handlers;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JK implements Proto {
    @Override
    public String process(String cellValue) throws ParseException {
        List<String> listString = Arrays.asList(cellValue.split("\n").clone());
        for (String str : listString) {
            String temp = str.trim();
            if (!temp.isEmpty()) {
                try {
                    int index = temp.indexOf(".");
                    if (index != -1 && index != temp.length() - 1) {
                        Integer.parseInt(temp.substring(0, index));
                    } else if (!(temp.charAt(0) == '-' ||
                            temp.charAt(0) == '–' || temp.charAt(0) == '—')) {
                        throw (new Exception());
                    }
                } catch (Exception e) {
                    listString.set(listString.indexOf(str), "####" + str);
                }
            }
        }

        return listString.stream().collect(Collectors.joining("\n"));
    }
}
