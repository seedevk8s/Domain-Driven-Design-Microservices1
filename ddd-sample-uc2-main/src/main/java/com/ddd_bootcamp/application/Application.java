package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Product;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product applePencil = new Product("Apple Pencil");
        cart.add(applePencil);

        Product headphone = new Product("Sony Wireless headphone");
        cart.add(headphone);

        System.out.println("--------------------------------------------------------");
        System.out.println("Cart = " + cart);
        List<Product> products = cart.getProducts();
        System.out.println("products = " + products);
        System.out.println("--------------------------------------------------------");

    }
}
