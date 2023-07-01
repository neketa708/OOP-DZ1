package org.example;

import java.util.ArrayList;

public class Magazen {
    private ArrayList<Category> categories;

    public Magazen(){
        this.categories = new ArrayList<>();
    }
    public void addCategory(Category category){
        categories.add(category);
    }

    public void printCatalog(){
        for (Category category: categories) {
            System.out.println(category.getName());
            ArrayList<Product> products = category.getProducts();
            for (Product product: products) {
                System.out.println("- " + product.getName()+" "+product.getPrice()+" "+ product.getRating());
            }
        }
    }
}
