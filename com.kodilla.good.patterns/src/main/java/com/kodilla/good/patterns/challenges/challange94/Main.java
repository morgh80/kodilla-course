package com.kodilla.good.patterns.challenges.challange94;

public class Main {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        Order order = orderRequestRetriever.orderRetrieve();
        ProviderRetriever providerRetriever = new ProviderRetriever();
        Provider extraFood = providerRetriever.retrieveExtraFood();
        Provider healthyShop = providerRetriever.retrieveHealthyShop();
        Provider glutenFree = providerRetriever.retrieveGlutenFreeShop();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor();
        productOrderProcessor.process(order,extraFood);
        productOrderProcessor.process(order,healthyShop);
        productOrderProcessor.process(order,glutenFree);

    }

}
