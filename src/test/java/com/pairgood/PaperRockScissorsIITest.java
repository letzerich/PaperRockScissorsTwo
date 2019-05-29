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

    @Test
    public void whenScissorsAndRockThrownRockWins(){

        PaperRockScissorsII game = new PaperRockScissorsII();

        String actual = game.play("scissors", "rock");

        Assert.assertEquals("rock", actual);
    }

    @Test
    public void whenScissorsAndPaperThrownScissorsWins(){

        PaperRockScissorsII game = new PaperRockScissorsII();

        String actual = game.play("scissors", "paper");

        Assert.assertEquals("scissors", actual);
    }

    @Test
    public void whenPaperAndScissorsThrownScissorsWins(){

        PaperRockScissorsII game = new PaperRockScissorsII();

        String actual = game.play("paper", "scissors");

        Assert.assertEquals("scissors", actual);
    }

    @Test
    public void whenPaperAndPaperThrownTieDrawn(){

        PaperRockScissorsII game = new PaperRockScissorsII();

        String actual = game.play("paper", "paper");

        Assert.assertEquals("tie", actual);
    }
}
