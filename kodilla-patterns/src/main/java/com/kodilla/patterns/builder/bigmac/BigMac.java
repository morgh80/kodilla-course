package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private Boolean rollWithSesame;
    private Integer numberOfburgers;
    private List<Ingredients> ingredients;
    private Souce souce;

    public enum Souce {
        STANDARD, THOUSAND_ISLANDS, BARBECUE
    }

    public enum Ingredients {
        SALAT, ONION, BACON, CUCUMBER, CHILLI, MASHROOMS, SHRIMPS, CHEESE
    }

    public static class BigmacBuilder {
        private Boolean rollWithSesame;
        private Integer numberOfburgers;
        private List<Ingredients> ingredients = new ArrayList<>();
        private Souce souce;

        public BigmacBuilder rollWithSesame(Boolean rollWithSesame) {
            this.rollWithSesame = rollWithSesame;
            return this;
        }

        public BigmacBuilder numberOfburgers(Integer numberOfburgers) {
            this.numberOfburgers = numberOfburgers;
            return this;
        }

        public BigmacBuilder ingredient(Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigmacBuilder souce(Souce souce) {
            this.souce = souce;
            return this;
        }

        public BigMac build() {
            return new BigMac(rollWithSesame, numberOfburgers,ingredients,souce);
        }

    }

    private BigMac(Boolean rollWithSesame, Integer numberOfburgers, List<Ingredients> ingredients, Souce souce) {
        this.rollWithSesame = rollWithSesame;
        this.numberOfburgers = numberOfburgers;
        this.ingredients = new ArrayList<>(ingredients);
        this.souce = souce;
    }

    public Boolean getRollWithSesame() {
        return rollWithSesame;
    }

    public Integer getNumberOfburgers() {
        return numberOfburgers;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public Souce getSouce() {
        return souce;
    }

    @Override
    public String toString() {
        return "BigMac {" +
                "rollWithSesame: " + rollWithSesame +
                ", numberOfburgers: " + numberOfburgers +
                ", ingredients: " + ingredients +
                ", souce: " + souce +
                '}';
    }
}
