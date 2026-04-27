package com.gla.Streamapi;

import java.util.*;
import java.util.stream.*;

class Invoice {
    int id;

    Invoice(int id) {
        this.id = id;
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(1, 2, 3, 4);

        List<Invoice> invoices = ids.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        invoices.forEach(i -> System.out.println("Invoice ID: " + i.id));
    }
}