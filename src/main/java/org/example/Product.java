package org.example;

public class Product {
    private String name;
    private Integer price;
    private Integer rating;

    public Product(String name, Integer price, Integer rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public Integer getPrice() {
        return price;
    }
    public Integer getRating() {
        return rating;
    }

}
