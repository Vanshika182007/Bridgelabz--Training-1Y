package com.gla.Streamapi;

import java.util.*;

public class NameTransformation {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("aman", "rahul", "neha");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}