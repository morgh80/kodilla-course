package com.kodilla.good.patterns.challenges.challange95;

import java.util.ArrayList;
import java.util.List;

public class FlightRetriever {

    private Airline airline = new Airline();
    private Airport waw = new Airport("Warszawa", "WAW");
    private Airport jfk = new Airport("New York", "JFK");
    private Airport scx = new Airport("Berlin", "SCX");
    private Airport dub = new Airport("Dublin", "DUB");
    private Airport chg = new Airport("Paris", "CHG");
    private Airport cph = new Airport("Copenhagen", "CPH");
    private Airport wmi = new Airport("Modlin", "WMI");

    public Airport retrieveAirports(String codeName) {

        Airport retrievedAirport = null;
        List<Airport> airportList = new ArrayList<>();

        airportList.add(waw);
        airportList.add(jfk);
        airportList.add(scx);
        airportList.add(dub);
        airportList.add(chg);
        airportList.add(cph);
        airportList.add(wmi);

        for (Airport airport : airportList) {
            if (codeName.equals(airport.getCodeName())) {
                retrievedAirport = airport;
            }
        }
        return retrievedAirport;

    }

    public Airline retrieveFlights() {

        airline.addConnection(waw, jfk, "12:10", "18:20");
        airline.addConnection(waw, dub, "12:34");
        airline.addConnection(dub, jfk, "13:03");
        airline.addConnection(scx, jfk, "19.23", "21.00");
        airline.addConnection(chg, dub, "18.12");
        airline.addConnection(chg, jfk, "07:09");
        airline.addConnection(cph, wmi, "07.00");

        return airline;

    }

}
