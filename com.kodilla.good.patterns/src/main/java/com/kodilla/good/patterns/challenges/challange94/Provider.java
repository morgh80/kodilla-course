package com.kodilla.good.patterns.challenges.challange94;

import java.util.Map;

public class Provider {

    private String providerName;
    private Adress adress;
    private ProviderDeliveryProcessor providerDeliveryProcessor;
    private ProviderMagazine providerMagazine;

    public Provider(String providerName, Adress adress, ProviderDeliveryProcessor providerDeliveryProcessor, ProviderMagazine providerMagazine) {
        this.providerName = providerName;
        this.adress = adress;
        this.providerDeliveryProcessor = providerDeliveryProcessor;
        this.providerMagazine = providerMagazine;
    }

    public String getProviderName() {
        return providerName;
    }

    public Adress getAdress() {
        return adress;
    }

    public ProviderDeliveryProcessor getProviderDeliveryProcessor() {
        return providerDeliveryProcessor;
    }

    public ProviderMagazine getProviderMagazine() {
        return providerMagazine;
    }
}
