package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cart{" +
                "products=" + products +
                '}';
    }
}