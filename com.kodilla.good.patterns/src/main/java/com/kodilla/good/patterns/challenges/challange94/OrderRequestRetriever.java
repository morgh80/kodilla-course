package com.kodilla.good.patterns.challenges.challange94;

import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {

    public Order orderRetrieve() {

        Buyer buyer = new Buyer("Jan Kowalski", new Adress("ul. Karowa", "00-707", "Warszawa"));

        class ExpressDeliveryService implements DeliveryService {
            public Boolean deliverOrder(Order order) {
                return true;
            }
        }


        Product apples = new Product("apple", 10.0);
        Map<Product, Integer> orderList = new HashMap<>();
        orderList.put(apples, 2);
        Product corn = new Product("corn", 2.5);
        orderList.put(corn,10);

        return new Order(buyer, orderList, new ExpressDeliveryService() {
        });
    }

}
