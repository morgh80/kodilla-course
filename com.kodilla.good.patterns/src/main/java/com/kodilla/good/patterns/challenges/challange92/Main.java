package com.kodilla.good.patterns.challenges.challange92;

public class Main {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailInformationService(), new OnlineShopOrderService(), new OnlineShopOrderRepository());
        productOrderProcessor.process(orderRequest);

    }

}
