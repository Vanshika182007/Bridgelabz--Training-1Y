package com.gla.Streamapi;
import java.util.*;

public class SensorReadings {
    public static void main(String[] args) {

        List<Integer> readings = Arrays.asList(30, 55, 70, 45, 90);
        int threshold = 50;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("High Reading: " + r));
    }
}