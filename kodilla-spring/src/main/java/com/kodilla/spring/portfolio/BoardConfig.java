package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    // Nie wiem czy zrozumiałem zadanie - czy miałem dodać w klasie konfiguracyjnej konkretne zadania np. "Buy grill",
    // jak w przykładzie z Kodilli com.kodilla.spring.reader

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(),getInProgressList(),getDoneList());
    }

    public TaskList getToDoList() {
        ArrayList<String> task = new ArrayList<>();
        task.add("Buy food for grill ");
        return new TaskList(task);
    }

    public TaskList getInProgressList() {
        ArrayList<String> task = new ArrayList<>();
        task.add("Sending invitations");
        return new TaskList(task);
    }

    public TaskList getDoneList() {
        ArrayList<String> task = new ArrayList<>();
        task.add("Buy grill");
        return new TaskList(task);
    }

}
