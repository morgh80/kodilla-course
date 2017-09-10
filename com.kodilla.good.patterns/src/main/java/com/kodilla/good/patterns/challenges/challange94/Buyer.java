package com.kodilla.good.patterns.challenges.challange94;

public class Buyer {

    String name;
    Adress adress;

    public Buyer(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public Adress getAdress() {
        return adress;
    }
}
