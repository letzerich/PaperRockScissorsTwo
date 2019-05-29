package com.pairgood;

import java.util.ArrayList;
import java.util.List;

public class PaperRockScissorsII {

    public String play(String gestureOne, String gestureTwo){

        List<String> gestures = new ArrayList<>();
        gestures.add(gestureOne);
        gestures.add(gestureTwo);

        if (gestures.contains("rock") && gestures.contains("paper"))
            return "paper";

        if (gestures.contains("rock") && gestures.contains("scissors"))
            return "rock";

        if (gestures.contains("paper") && gestures.contains("scissors"))
            return "scissors";

        if (gestureOne.equals(gestureTwo))
            return "tie";

        return "error";
    }
}


