package com.gla.Streamapi;

import java.util.*;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
public class CustomSorting {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Shoes", 2000));
        list.add(new Product("Shirt", 1000));
        list.add(new Product("Watch", 3000));

        list.sort((p1, p2) -> p1.price - p2.price);

        for (Product p : list) {
            System.out.println(p.name + " " + p.price);
        }
    }
}