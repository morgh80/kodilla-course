package com.kodilla.good.patterns.challenges.challange94;

import java.util.Map;

public class Order {

    private Provider provider;
    private Buyer buyer;
    private Map<Product, Integer> orderList;
    private DeliveryService deliveryService;

    public Order(Provider provider, Buyer buyer, Map<Product, Integer> orderList, DeliveryService deliveryService) {
        this.provider = provider;
        this.buyer = buyer;
        this.orderList = orderList;
        this.deliveryService = deliveryService;
    }

    public Provider getProvider() {
        return provider;
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
