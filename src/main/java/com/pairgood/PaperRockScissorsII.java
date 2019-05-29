package com.pairgood;

public class PaperRockScissorsII {

    public String play(String gestureOne, String gestureTwo){

        if (gestureOne.equals("rock") && gestureTwo.equals("paper"))
            return "paper";

        if (gestureOne.equals("paper") && gestureTwo.equals("rock"))
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


