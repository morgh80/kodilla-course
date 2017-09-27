package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {



    @Test
    public void isLogging() {
        //Given
        Logger logger = Logger.getInstance();

        //When
        logger.log("Log was created");

        //Then
        Assert.assertEquals("Log was created", logger.getLastLog());

    }

    @Test
    public void isGettingLastLog() {
        //Given
        Logger logger = Logger.getInstance();

        //When
        logger.log("First log");
        logger.log("Second log");

        //Then
        Assert.assertEquals("Second log", logger.getLastLog());

    }
}
