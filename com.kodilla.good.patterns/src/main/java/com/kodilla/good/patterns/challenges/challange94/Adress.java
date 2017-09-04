package com.kodilla.good.patterns.challenges.challange94;

public class Adress {

    String street;
    String zipCode;
    String city;

    public Adress(String street, String zipCode, String city) {
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }
}
