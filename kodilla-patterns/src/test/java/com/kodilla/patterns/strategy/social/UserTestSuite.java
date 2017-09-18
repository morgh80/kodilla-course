package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.Test;
import org.junit.Assert;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        Millenials millenialsUser = new Millenials("Milena");
        YGeneration yGenerationUser = new YGeneration("Janusz");
        ZGeneration zGeneration = new ZGeneration("Karol");

        //When
        String millenialsShare = millenialsUser.getName() + " uses " + millenialsUser.sharePost();
        System.out.println(millenialsShare);
        String yGenerationShare = yGenerationUser.getName() + " uses " + yGenerationUser.sharePost();
        System.out.println(yGenerationShare);
        String zGenerationShare = zGeneration.getName() + " uses " + zGeneration.sharePost();
        System.out.println(zGenerationShare);

        Assert.assertEquals("Milena uses Share on Snapchat", millenialsShare);
        Assert.assertEquals("Janusz uses Share on Twitter", yGenerationShare);
        Assert.assertEquals("Karol uses Share on Facebook", zGenerationShare);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials millenialsUser = new Millenials("Milena");
        millenialsUser.setSocialPublisher(new FacebookPublisher());
        YGeneration yGenerationUser = new YGeneration("Janusz");
        yGenerationUser.setSocialPublisher(new SnapchatPublisher());
        ZGeneration zGeneration = new ZGeneration("Karol");
        zGeneration.setSocialPublisher(new TwitterPublisher());

        //When
        String millenialsShare = millenialsUser.getName() + " uses " + millenialsUser.sharePost();
        System.out.println(millenialsShare);
        String yGenerationShare = yGenerationUser.getName() + " uses " + yGenerationUser.sharePost();
        System.out.println(yGenerationShare);
        String zGenerationShare = zGeneration.getName() + " uses " + zGeneration.sharePost();
        System.out.println(zGenerationShare);

        Assert.assertEquals("Milena uses Share on Facebook", millenialsShare);
        Assert.assertEquals("Janusz uses Share on Snapchat", yGenerationShare);
        Assert.assertEquals("Karol uses Share on Twitter", zGenerationShare);


    }

}
