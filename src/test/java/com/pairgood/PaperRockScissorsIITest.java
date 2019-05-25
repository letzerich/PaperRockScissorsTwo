package com.pairgood;

import org.junit.Assert;
import org.junit.Test;

public class PaperRockScissorsIITest {

    @Test
    public void whenPaperAndRockThrownPaperWins(){

        PaperRockScissorsII game = new PaperRockScissorsII();

        String actual = game.play("rock", "paper");

        Assert.assertEquals("rock", actual);
    }
}
