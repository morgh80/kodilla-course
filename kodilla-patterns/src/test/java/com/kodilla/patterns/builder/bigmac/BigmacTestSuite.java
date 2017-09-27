package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBigMacIngredients() {
        //Given
        BigMac bigMac = new BigMac.BigmacBuilder()
                .rollWithSesame(true)
                .numberOfburgers(2)
                .ingredient(BigMac.Ingredients.BACON)
                .ingredient(BigMac.Ingredients.CHEESE)
                .ingredient(BigMac.Ingredients.MASHROOMS)
                .ingredient(BigMac.Ingredients.ONION)
                .souce(BigMac.Souce.THOUSAND_ISLANDS)
                .build();

        System.out.println(bigMac);

        //When
        int numberOfIngredients = bigMac.getIngredients().size();

        //Then
        Assert.assertEquals(4, numberOfIngredients);
    }

    @Test
    public void testNewBigMacRoll() {
        //Given
        BigMac bigMac = new BigMac.BigmacBuilder()
                .rollWithSesame(true)
                .numberOfburgers(2)
                .ingredient(BigMac.Ingredients.ONION)
                .souce(BigMac.Souce.THOUSAND_ISLANDS)
                .build();

        System.out.println(bigMac);

        //When
        Boolean isWithSesame = bigMac.getRollWithSesame();

        //Then
        Assert.assertEquals(true, isWithSesame);
    }

//    @Test
//    public void testNewBigMacBurgers() {
//        //Given
//        BigMac bigMac = aBigmacBuilder()
//                .withRollWithSesame(true)
//                .numberOfburgers(2)
//                .ingredient(BigMac.Ingredients.ONION)
//                .souce(BigMac.Souce.THOUSAND_ISLANDS)
//                .build();
//
//        System.out.println(bigMac);
//
//        //When
//        int numberOfBurgers = bigMac.getNumberOfburgers();
//
//        //Then
//        Assert.assertEquals(2, numberOfBurgers);
//    }

    @Test
    public void testNewBigMacSouce() {
        //Given
        BigMac bigMac = new BigMac.BigmacBuilder()
                .rollWithSesame(true)
                .numberOfburgers(2)
                .ingredient(BigMac.Ingredients.ONION)
                .souce(BigMac.Souce.THOUSAND_ISLANDS)
                .build();

        System.out.println(bigMac);

        //When
        BigMac.Souce souce = bigMac.getSouce();

        //Then
        Assert.assertEquals(BigMac.Souce.THOUSAND_ISLANDS, souce);
    }


}
