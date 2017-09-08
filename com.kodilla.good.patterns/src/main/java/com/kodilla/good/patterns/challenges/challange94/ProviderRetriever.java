package com.kodilla.good.patterns.challenges.challange94;

public class ProviderRetriever {

    public Provider retrieveExtraFood() {

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

        return new Provider("Extra Food Shop", new Adress("ul. Jerzego 3", "34-098", "Radom"), new ExtraFoodShopDeliveryProcessor(), new ExtraFoodShopMagazine());

    }

    public Provider retrieveHealthyShop() {

        class HealthyShopDeliveryProcessor implements ProviderDeliveryProcessor {
            public Boolean processOrder(Order order) {
                return true;
            }
        }

        class HealthyShopMagazine implements ProviderMagazine {
            public Boolean orderIsAvailable(Order order) {
                return true;
            }
        }

        return new Provider("Healthy Food Shop", new Adress("ul. Gala Anonima 10", "03-200", "Warszawa"), new HealthyShopDeliveryProcessor(), new HealthyShopMagazine());

    }

    public Provider retrieveGlutenFreeShop() {

        class GlutenFreeShopDeliveryProcessor implements ProviderDeliveryProcessor {
            public Boolean processOrder(Order order) {
                return true;
            }
        }

        class GlutenFreeShopMagazine implements ProviderMagazine {
            public Boolean orderIsAvailable(Order order) {
                return true;
            }
        }

        return new Provider("Gluten Free Shop", new Adress("ul. Mandaliniego", "00-280", "Pułtusk"), new GlutenFreeShopDeliveryProcessor(), new GlutenFreeShopMagazine());



    }


}
