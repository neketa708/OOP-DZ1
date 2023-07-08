package org.example;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        this.products =new ArrayList<>();//что делает данная запись? если при выборе конструктора в параметрах данного метода передается ArrayList<Product> products и записывается this.products = products;
    }

    public String getName() {
        return name;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProducts(Product product) {
        products.add(product);
    }
}
