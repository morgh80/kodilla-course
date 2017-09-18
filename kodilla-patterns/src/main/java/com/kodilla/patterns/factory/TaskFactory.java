package com.kodilla.patterns.factory;

public class TaskFactory {

    public final static String DRIVING_TASK = "DRIVING_TASK";
    public final static String PAINTING_TASK = "PAINTING_TASK";
    public final static String SHOPPING_TASK = "SHOPPING_TASK";

    public final Task makeTask(final String task) {
        switch (task) {
            case DRIVING_TASK:
                return new DrivingTask("drive home", "Warsaw", "bike");
            case PAINTING_TASK:
                return new PaintingTask("paint kitchen", "kitchen");
            case SHOPPING_TASK:
                return new ShoppingTask("buy nails", "nails", 2.0);
            default:
                return null;
        }
    }

}