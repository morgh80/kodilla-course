package com.kodilla.good.patterns.challenges.challange92;

// DTO trochę na siłę, ale chciałem zaimplementować dla ćwiczenia

public class OrderDto {

    public User user;
    public Boolean didOrder;

    public OrderDto(User user, Boolean didOrder) {
        this.user = user;
        this.didOrder = didOrder;
    }
}
