package com.kodilla.good.patterns.challenges.challange95;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {

    Airline airline;

    public FlightSearch(Airline airline) {
        this.airline = airline;
    }

    public Set<Airport> findAllConnectionsFrom(Airport airport) {

        Map<Airport, Map<Airport, List<String>>> flightConnections = airline.getFlightConnections();
        Set<Airport> connections = new HashSet<>();

        if (flightConnections.containsKey(airport)) {
            connections = airline.getFlightConnections().get(airport).keySet();
        }

        return connections;

    }

    public Set<Airport> findAllConnectionsTo(Airport airport) {

        Set<Airport> airlineConnections = airline.getFlightConnections().entrySet().stream()
                .map(entry -> {
                            if (entry.getValue().containsKey(airport)) {
                                return entry.getKey();
                            }
                            return null;
                        }
                )
                .filter(entry -> entry != null)
                .collect(Collectors.toSet());

        return airlineConnections;

    }

    public Set<Airport> findConnectedRoute(Airport origin, Airport destination) {

        Set<Airport> fromSet = findAllConnectionsFrom(origin);
        Set<Airport> toSet = findAllConnectionsFrom(destination);
        Set<Airport> connectedFlights = new HashSet<>();

        if (fromSet.contains(destination)) {
            System.out.println("There is a direct flight");
        }

        for (Airport fromAirport : fromSet) {
            if (toSet.contains(fromAirport)) {
                connectedFlights.add(fromAirport);
            } else {
                System.out.println("There are no connected flights from " + origin + " to " + destination);
            }
        }

        return connectedFlights;

    }

}