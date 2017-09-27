package com.kodilla.spring.web.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class portfolioTestSuite {

    @Test
    public void testAddTaskToList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String toDo = "Go to shop";
        List<String> result = board.getToDoList().addTask(toDo);

        //Then
        Assert.assertTrue(board.getToDoList().getTasks().contains(toDo));
    }

    @Test
    public void testIfListContainsTasks() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        List<String> list = new ArrayList<>();
        list.add("Make laundry");
        list.add("Iron t-shirts");

        //When
        board.getInProgressList().addTask("Make laundry");
        board.getInProgressList().addTask("Iron t-shirts");

        //Then
        Assert.assertEquals(list, board.getInProgressList().getTasks());
    }

}
