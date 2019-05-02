package com.pairgood;

import org.junit.Assert;
import org.junit.Test;

public class PaperRockScissorsIITest {

    @Test
    public void whenPaperAndRockThrownPaperWins(){

        PaperRockScissorsII game = new PaperRockScissorsII();

        String actual1 = ((PaperRockScissorsII) game).play("rock");
        String actual2 = ((PaperRockScissorsII) game).play("paper");

        Assert.assertEquals("rock", actual2);
    }
}
