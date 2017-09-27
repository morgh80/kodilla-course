package com.kodilla.patterns.factory;

public class PaintingTask implements Task {

    String taskName;
    String whatToPaint;
    private Boolean isExecuted = false;

    public PaintingTask(String taskName, String whatToPaint) {
        this.taskName = taskName;
        this.whatToPaint = whatToPaint;
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