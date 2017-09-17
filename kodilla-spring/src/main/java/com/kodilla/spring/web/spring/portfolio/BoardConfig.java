package com.kodilla.spring.web.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BoardConfig {



    @Bean
    public Board getBoard() {
        return new Board(getToDoList(),getInProgressList(),getDoneList());
    }

    @Bean
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean
    TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean
    public TaskList getDoneList() {
        return new TaskList();
    }

////    @Bean
//    public ArrayList<String> getTasks() {
//        ArrayList<String> task = new ArrayList<>();
//        return task;
//    }

//    public TaskList getToDoList() {
//        ArrayList<String> task = new ArrayList<>();
//        task.add("Buy food for grill ");
//        return new TaskList(task);
//    }
//
//    public TaskList getInProgressList() {
//        ArrayList<String> task = new ArrayList<>();
//        task.add("Sending invitations");
//        return new TaskList(task);
//    }
//
//    public TaskList getDoneList() {
//        ArrayList<String> task = new ArrayList<>();
//        task.add("Buy grill");
//        return new TaskList(task);
//    }

}
