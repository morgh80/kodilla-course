package com.kodilla.good.patterns.challenges.challange95;

public class Airport {
    private String name;
    private String codeName;

    public Airport(String name, String codeName) {
        this.name = name;
        this.codeName = codeName;
    }

    public String getName() {
        return name;
    }

    public String getCodeName() {
        return codeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        return getCodeName().equals(airport.getCodeName());
    }

    @Override
    public int hashCode() {
        return getCodeName().hashCode();
    }

    @Override
    public String toString() {
        return name + "[" + codeName + "]";
    }
}
