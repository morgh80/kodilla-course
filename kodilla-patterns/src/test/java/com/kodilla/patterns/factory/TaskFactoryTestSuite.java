package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

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

}