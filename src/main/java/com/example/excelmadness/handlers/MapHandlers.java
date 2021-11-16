package com.example.excelmadness.handlers;

import java.util.HashMap;
import java.util.Map;

public class MapHandlers {
    public static Map<String, Proto> map = new HashMap<String, Proto>();

    public static void initMap() {
        map = new HashMap<String, Proto>();
        map.put("A", new SimpleHandler()); // uid
        map.put("B", new SimpleHandler()); // номер услуги
        map.put("C", new SimpleHandler()); // номер услуги
        map.put("D", new SimpleHandler()); // номер услуги
        map.put("E", new SimpleHandler()); // номер услуги
        map.put("F", new SimpleHandler()); // номер услуги
        map.put("G", new SimpleHandler()); // номер услуги
        map.put("H", new SimpleHandler()); // номер услуги
        map.put("I", new SimpleHandler()); // номер услуги
        map.put("J", new JK()); // номер услуги //
        map.put("K", new JK()); // номер услуги//
        map.put("L", new SimpleHandler()); // номер услуги
        map.put("M", new SimpleHandler()); // номер услуги
        map.put("N", new SimpleHandler()); // номер услуги
        map.put("O", new SimpleHandler()); // номер услуги
        map.put("P", new SimpleHandler()); // номер услуги
        map.put("Q", new SimpleHandler()); // номер услуги
        map.put("R", new SimpleHandler()); // номер услуги
        map.put("S", new SimpleHandler()); // номер услуги
        map.put("T", new SimpleHandler()); // номер услуги
        map.put("U", new SimpleHandler()); // номер услуги
        map.put("V", new SimpleHandler()); // номер услуги
        map.put("W", new SimpleHandler()); // номер услуги
        map.put("X", new SimpleHandler()); // номер услуги
        map.put("Y", new SimpleHandler()); // номер услуги
        map.put("Z", new SimpleHandler()); // Р
    }

}
