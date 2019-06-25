package com.tomdale;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score " + highScore);

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScore(1500);
        displayHighScorePosition("Tom", highScorePosition);

        highScorePosition = calculateHighScore(900);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScore(400);
        displayHighScorePosition("Tally", highScorePosition);

        highScorePosition = calculateHighScore(50);
        displayHighScorePosition("Ted", highScorePosition);

        highScorePosition = calculateHighScore(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScore(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScore(100  );
        displayHighScorePosition("Louise", highScorePosition);

    }

    public static void displayHighScorePosition (String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScore (int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
    
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }
        return 1;
    }
}