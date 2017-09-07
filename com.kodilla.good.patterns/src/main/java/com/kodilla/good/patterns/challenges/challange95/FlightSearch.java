package com.kodilla.good.patterns.challenges.challange95;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearch {

    Airline airline;

    public FlightSearch(Airline airline) {
        this.airline = airline;
    }

    public void findAllConnectionsFrom(Airport airport) {

        HashMap<Airport, List<String>> allConnections =
        airline.getFlightConnections().entrySet().stream()
                .filter(entry -> entry.getKey().equals(airport))
                .map(entry -> entry.getValue())
                .collect(Collectors.toMap());
//                .forEach(x -> System.out.println(x));

    }

    public void findAllConnectionsTo(Airport airport) {
        Map<Airport, Map<Airport, List<String>>> airlineConnections = airline.getFlightConnections();
        airline.getFlightConnections().entrySet().stream()
                .map(entry -> {
                            if (entry.getValue().containsKey(airport)) {
                                return entry.getKey();
                            }
                    return null;
                        }
                )
                .filter(entry -> entry != null)
                .forEach(x -> System.out.println(x));

    }

//    public void findConnectedRoute(Airport from, Airport to) {
//        Boolean hasConnection = (findAllConnectionsFrom(from);)
//
//        if
//
//
//    }
}