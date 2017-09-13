package com.kodilla.spring.web.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList(ArrayList<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> addTask(String task) {
        tasks.add(task);
        return tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
