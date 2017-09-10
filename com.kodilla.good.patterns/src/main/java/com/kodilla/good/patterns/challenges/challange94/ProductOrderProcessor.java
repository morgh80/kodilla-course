package com.kodilla.good.patterns.challenges.challange94;

public class ProductOrderProcessor {

    private DeliveryService deliveryService;

    public Boolean process(Order order, Provider provider) {

//        Provider provider = order.getProvider();
        DeliveryService deliveryService = order.getDeliveryService();

        Boolean providerCanProcessOrder = provider.getProviderMagazine().orderIsAvailable(order);

        if (providerCanProcessOrder) {
            provider.getProviderDeliveryProcessor().processOrder(order);
            deliveryService.deliverOrder(order);
        }
        return providerCanProcessOrder;
    }

}