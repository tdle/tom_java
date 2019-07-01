package com.tomdale;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(100);
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if(centimeters < 0.0) {
            System.out.println("Invalid Parameters");
        }

        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {

        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and "  + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    //Method overloading is a feature that allows us to have more than one method with the same name, so long as we use different parameters.
    //It is the ability to create multiple methods of the same name with different implementations
    //Calls to overload method will run a specific implementation of that method.
    //In the example from the previous video we had calculateScore method with 0, 1 and 2 parameters
}
