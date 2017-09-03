package com.kodilla.good.patterns.challenges.challange92;

public class OrderItem {

    private String name;
    private Double price;

    public OrderItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
