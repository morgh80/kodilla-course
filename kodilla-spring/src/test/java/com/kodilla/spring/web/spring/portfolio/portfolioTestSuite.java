package com.kodilla.spring.web.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class portfolioTestSuite {

    @Test

    // Nazwa testu zasugerowana przez Kodille sugeruje, że mam przetestować dodawanie tasków ("testTaskAdd()")
    // Trochę mnie to dziwi, bo w BoardConfig zrozumiałem, że mam wstrzyknąć w Beany konkretne zadania
    // Czego już w teście w tym kontekście nie ma sensu sprawdzac

    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String toDo = "Go to shop";
        List<String> result = board.getToDoList().addTask(toDo);

        //Then
        Assert.assertTrue(board.getToDoList().getTasks().contains(toDo));
    }

}
