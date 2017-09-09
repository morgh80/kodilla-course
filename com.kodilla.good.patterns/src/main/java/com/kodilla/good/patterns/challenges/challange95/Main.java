package com.kodilla.good.patterns.challenges.challange95;

import java.util.Set;

public class Main {

    public static void main(String[] args) {

        FlightRetriever flightRetriever = new FlightRetriever();
        FlightSearch flightSearch = new FlightSearch(flightRetriever.retrieveFlights());

        Set<Airport> flightsFromWAW = flightSearch.findAllConnectionsFrom(flightRetriever.retrieveAirports("WAW"));
        Set<Airport> flightsToJFK = flightSearch.findAllConnectionsTo(flightRetriever.retrieveAirports("JFK"));
        Set<Airport> connectedRoutesCPHtoWMI = flightSearch.findConnectedRoute(flightRetriever.retrieveAirports("CPH"), flightRetriever.retrieveAirports("WMI"));
        Set<Airport> flightsFromCPH = flightSearch.findAllConnectionsFrom(flightRetriever.retrieveAirports("CPH"));

    }

}