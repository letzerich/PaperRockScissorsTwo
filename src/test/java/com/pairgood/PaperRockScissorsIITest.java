package com.pairgood;

import org.junit.Assert;
import org.junit.Test;

public class PaperRockScissorsIITest {

    @Test
    public void whenRockAndPaperThrownPaperWins(){

        PaperRockScissorsII game = new PaperRockScissorsII();

        String actual = game.play("rock", "paper");

        Assert.assertEquals("paper", actual);
    }

    @Test
    public void whenPaperAndRockThrownPaperWins(){

        PaperRockScissorsII game = new PaperRockScissorsII();

        String actual = game.play("paper", "rock");

        Assert.assertEquals("paper", actual);
    }

    @Test
    public void whenRockAndScissorsThrownRockWins(){

        PaperRockScissorsII game = new PaperRockScissorsII();

        String actual = game.play("rock", "scissors");

        Assert.assertEquals("rock", actual);
    }
}
