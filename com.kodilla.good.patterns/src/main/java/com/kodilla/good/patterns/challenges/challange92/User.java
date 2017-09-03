package com.kodilla.good.patterns.challenges.challange92;

public class User {
    private String name;
    private Double funds;

    public User(String name, Double funds) {
        this.name = name;
        this.funds = funds;
    }

    public String getName() {
        return name;
    }

    public Double getFunds() {
        return funds;
    }

    public void setFunds(Double funds) {
        this.funds = funds;
    }
}
