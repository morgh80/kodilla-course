package com.kodilla.good.patterns.challenges.challange95;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Airline {
    private Map<Airport, Map<Airport, List<String>>> flightConnections = new HashMap<>();

    public Map<Airport, Map<Airport, List<String>>> getFlightConnections() {
        return flightConnections;
    }

    public Map<Airport, Map<Airport, List<String>>> addConnection(Airport from, Airport to, String... times) {

        List<String> timesList = new ArrayList<>();
        for (String time : times) {
            timesList.add(time);
        }

        Map<Airport, List<String>> timeTable = new HashMap<>();
        timeTable.put(to, timesList);

        if (flightConnections.containsKey(from)) {
            Map<Airport, List<String>> airportConnections = flightConnections.get(from);
            airportConnections.put(to, timesList);
        } else {
            flightConnections.put(from, timeTable);
        }

        return flightConnections;
    }
}