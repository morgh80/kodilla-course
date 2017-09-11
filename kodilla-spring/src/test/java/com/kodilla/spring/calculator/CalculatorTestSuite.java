package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double addResult = calculator.add(1,1);
        Double subResult = calculator.sub(2,1);
        Double mulResult = calculator.mul(2,2);
        Double divResult = calculator.div(4,2);

        //Then
        Assert.assertEquals(2, addResult, 0);
        Assert.assertEquals(1, subResult, 0);
        Assert.assertEquals(4, mulResult, 0);
        Assert.assertEquals(2, divResult, 0);

    }
}
