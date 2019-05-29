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

        if (gestureOne.equals("rock") && gestureTwo.equals("scissors"))
            return "rock";

        if (gestureOne.equals("scissors") && gestureTwo.equals("rock"))
            return "rock";

        if (gestureOne.equals("scissors") && gestureTwo.equals("paper"))
            return "scissors";

        if (gestureOne.equals("paper") && gestureTwo.equals("scissors"))
            return "scissors";

        if (gestureOne.equals(gestureTwo))
            return "tie";

        return "error";
    }
}


