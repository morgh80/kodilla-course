package com.kodilla.good.patterns.challenges.challange94;

public class Main {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        Order order = orderRequestRetriever.orderRetrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor();
        productOrderProcessor.process(order);

    }

}
