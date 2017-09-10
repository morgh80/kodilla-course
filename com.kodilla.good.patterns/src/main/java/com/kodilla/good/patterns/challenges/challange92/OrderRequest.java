package com.kodilla.good.patterns.challenges.challange92;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private OrderItem orderItem;
    private LocalDateTime date;

    public OrderRequest(User user, OrderItem orderItem, LocalDateTime date) {
        this.user = user;
        this.orderItem = orderItem;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
