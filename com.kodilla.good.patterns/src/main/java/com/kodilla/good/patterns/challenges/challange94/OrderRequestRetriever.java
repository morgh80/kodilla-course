package com.kodilla.good.patterns.challenges.challange94;

import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {

    public Order orderRetrieve() {

        Buyer buyer = new Buyer("Jan Kowalski", new Adress("ul. Karowa", "00-707", "Warszawa"));

        class ExtraFoodShopDeliveryProcessor implements ProviderDeliveryProcessor {
            public Boolean processOrder(Order order) {
                return true;
            }
        }

        class ExtraFoodShopMagazine implements ProviderMagazine {
            public Boolean orderIsAvailable(Order order) {
                return true;
            }
        }

        class ExpressDeliveryService implements DeliveryService {
            public Boolean deliverOrder(Order order) {
                return true;
            }
        }

        Provider ExtraFoodShop = new Provider("Extra Food Shop", new Adress("ul. Jerzego 3", "34-098", "Radom"), new ExtraFoodShopDeliveryProcessor(), new ExtraFoodShopMagazine());
        Product apples = new Product("apple", 10.0);
        Map<Product, Integer> orderList = new HashMap<>();
        orderList.put(apples, 2);

        return new Order(ExtraFoodShop, buyer, orderList, new ExpressDeliveryService() {
        });
    }


}
