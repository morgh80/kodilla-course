package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TaskFactoryTestSuite {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void isExecutingDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        System.out.println(drivingTask);
        drivingTask.executeTask();

        //Then
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void isExecutingShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        System.out.println(shoppingTask);
        shoppingTask.executeTask();

        //Then
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void isExecutingPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        System.out.println(paintingTask);
        paintingTask.executeTask();

        //Then
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void shouldThrowException() throws IllegalStateException {
        //Given
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Task unavailable");
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task dumbTask = taskFactory.makeTask("dumbTask");

        //Then
        Assert.fail("This method should throw SomeException");
    }

}