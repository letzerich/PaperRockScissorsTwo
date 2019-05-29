package com.pairgood;

public class PaperRockScissorsII {

    public String play(String gestureOne, String gestureTwo){

        if (gestureOne.equals("rock") && gestureTwo.equals("paper"))
            return "paper";

        if (gestureOne.equals("paper") && gestureTwo.equals("rock"))
            return "paper";

        if (gestureOne.equals("rock") && gestureTwo.equals("scissors"))
            return "rock";

        return "error";
    }
}


