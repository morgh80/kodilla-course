package com.kodilla.good.patterns.challenges.challange94;

import java.util.Map;

public class Order {

    private Buyer buyer;
    private Map<Product, Integer> orderList;
    private DeliveryService deliveryService;

    public Order(Buyer buyer, Map<Product, Integer> orderList, DeliveryService deliveryService) {
        this.buyer = buyer;
        this.orderList = orderList;
        this.deliveryService = deliveryService;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public DeliveryService getDeliveryService() {
        return deliveryService;
    }

    public Map<Product, Integer> getOrderList() {
        return orderList;
    }
}
