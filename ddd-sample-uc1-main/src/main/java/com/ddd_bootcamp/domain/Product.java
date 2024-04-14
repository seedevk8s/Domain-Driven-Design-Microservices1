package com.ddd_bootcamp.domain;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}