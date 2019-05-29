package com.pairgood;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PaperRockScissorsIITest {

    private PaperRockScissorsII game;

    @Before

    public void setup(){
        game = new PaperRockScissorsII();
    }

    @Test
    public void whenRockAndPaperThrownPaperWins(){

        String actual = game.play("rock", "paper");

        Assert.assertEquals("paper", actual);
    }

    @Test
    public void whenPaperAndRockThrownPaperWins(){

        String actual = game.play("paper", "rock");

        Assert.assertEquals("paper", actual);
    }

    @Test
    public void whenRockAndScissorsThrownRockWins(){

        String actual = game.play("rock", "scissors");

        Assert.assertEquals("rock", actual);
    }

    @Test
    public void whenScissorsAndRockThrownRockWins(){

        String actual = game.play("scissors", "rock");

        Assert.assertEquals("rock", actual);
    }

    @Test
    public void whenScissorsAndPaperThrownScissorsWins(){

        String actual = game.play("scissors", "paper");

        Assert.assertEquals("scissors", actual);
    }

    @Test
    public void whenPaperAndScissorsThrownScissorsWins(){

        String actual = game.play("paper", "scissors");

        Assert.assertEquals("scissors", actual);
    }

    @Test
    public void whenPaperAndPaperThrownTieDrawn(){

        String actual = game.play("paper", "paper");

        Assert.assertEquals("tie", actual);
    }

    @Test
    public void whenRockAndRockThrownTieDrawn(){

        String actual = game.play("rock", "rock");

        Assert.assertEquals("tie", actual);
    }

    @Test
    public void whenScissorsAndScissorsThrownTieDrawn(){

        String actual = game.play("scissors", "scissors");

        Assert.assertEquals("tie", actual);
    }
}
