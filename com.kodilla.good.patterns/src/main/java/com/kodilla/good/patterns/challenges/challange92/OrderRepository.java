package com.kodilla.good.patterns.challenges.challange92;

import java.time.LocalDateTime;

public interface OrderRepository {
    public boolean createOrder(OrderRequest orderRequest);
}
