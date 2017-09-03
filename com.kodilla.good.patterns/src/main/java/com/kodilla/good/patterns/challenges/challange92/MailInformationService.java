package com.kodilla.good.patterns.challenges.challange92;

public class MailInformationService implements InformationService {

    User user;

    public void inform(User user) {
        System.out.println(" Dear " + user + ", ");
        System.out.println(" Your order has been successfully completed");
    }

}
