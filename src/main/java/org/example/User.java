package org.example;

public class User {
    private String login;
    private String password;
    private Basket basket;// ссылается на класс Basket

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }
}
