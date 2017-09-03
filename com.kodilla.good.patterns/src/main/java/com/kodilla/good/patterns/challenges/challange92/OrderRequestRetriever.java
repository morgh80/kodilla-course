package com.kodilla.good.patterns.challenges.challange92;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Jerry Kaminsky", 100.0);
        OrderItem orderItem = new OrderItem("Shoes", 25.0);
        LocalDateTime date = LocalDateTime.now();

        return new OrderRequest(user, orderItem, 2, date);
    }

}
