package com.gla.Streamapi;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {

        List<String> alerts = Arrays.asList("Emergency", "Normal", "Critical", "Low");

        Predicate<String> important = a -> a.equals("Emergency") || a.equals("Critical");

        alerts.stream()
                .filter(important)
                .forEach(System.out::println);
    }
}