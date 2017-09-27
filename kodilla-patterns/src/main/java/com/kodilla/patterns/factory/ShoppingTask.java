package com.kodilla.patterns.factory;

public class ShoppingTask implements Task {

    String taskName;
    String whatToBuy;
    double quantity;
    private Boolean isExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public void executeTask() {
        isExecuted = true;
    }

    public String getTaskName() {
        return taskName;
    }

    public Boolean isTaskExecuted() {
        return isExecuted;
    }

    @Override
    public String toString() {
        return "I am executing task \"" +
                taskName + "\"";
    }

}