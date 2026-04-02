package org.example.ForLoopExercise;

import java.util.Scanner;

public class E08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        double startingPoints = Double.parseDouble(scanner.nextLine());

        double winsPoints = 0;
        double finalistPoints = 0;
        double semiFinalPoints = 0;
        double totalPoints = 0;
        double averageWins = 0;
        double averagePoints = 0;
        int wins = 0;

        for (int i = 1; i <= tournaments ; i++) {
            String stage = scanner.nextLine();

            if (stage.equals("W")) {
                winsPoints += 2000;
                wins++;
            } else if (stage.equals("F")) {
                finalistPoints += 1200;

            } else if (stage.equals("SF")) {
                semiFinalPoints += 720;

            }
        }
        totalPoints = startingPoints + winsPoints + finalistPoints + semiFinalPoints;
        averagePoints = (winsPoints + finalistPoints + semiFinalPoints) / tournaments;
        averageWins = ((double) wins / tournaments ) * 100;

        System.out.printf("Final points: %.0f%n", totalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", averageWins);
    }
}
