package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Magazen magazen = new Magazen();

        Category category1 = new Category("Электроника");
        category1.addProducts(new Product("TV", 500, 4));
        category1.addProducts(new Product("Phone", 1000, 5));

        Category category2 = new Category("Одежда");
        category2.addProducts(new Product("maika", 10, 2));
        category2.addProducts(new Product("dzhins",20, 4));

        magazen.addCategory(category1);
        magazen.addCategory(category2);

        magazen.printCatalog();

        User user1 = new User("user1 ", "password1");
        User user2 = new User("user2 ", "password2");

        user1.getBasket().addProduct(category1.getProducts().get(0));
        user2.getBasket().addProduct(category2.getProducts().get(1));

        System.out.println(user1.getLogin()+"Покупки ");
        ArrayList<Product> user1Products = user1.getBasket().getProducts();
        for (Product product : user1Products) {
            System.out.println(product.getName()+ " " +product.getPrice()+ " "+product.getRating());
        }
        System.out.println(user2.getLogin()+"Покупки ");
        ArrayList<Product> user2Products = user2.getBasket().getProducts();
        for (Product product : user2Products) {
            System.out.println(product.getName()+ " " +product.getPrice()+ " "+product.getRating());
        }
    }
}