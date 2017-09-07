package com.kodilla.good.patterns.challenges.challange95;

public class Main {

    public static void main(String[] args) {

        Airport waw = new Airport("Warszawa", "WAW");
        Airport jfk = new Airport("New York", "JFK");
        Airport scx = new Airport("Berlin", "SCX");
        Airport dub = new Airport("Dublin", "DUB");
        Airport chg = new Airport("Paris", "CHG");


        Airline lot = new Airline();

        lot.addConnection(waw, jfk, "12:10", "18:20");
        lot.addConnection(waw, dub, "12:34");
        lot.addConnection(dub, jfk, "13:03");
        lot.addConnection(scx, jfk,"19.23", "21.00");
        lot.addConnection(chg, dub, "18.12");
        lot.addConnection(chg, jfk, "07:09");

//        System.out.println(lot.getFlightConnections());

        FlightSearch flightSearch = new FlightSearch(lot);
        flightSearch.findAllConnectionsFrom(waw);
//        flightSearch.findAllConnectionsTo(jfk);


    }

}