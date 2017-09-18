package com.kodilla.patterns.factory;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private Boolean isExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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