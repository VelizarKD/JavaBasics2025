package org.example.ForLoopExercise;

import java.util.Scanner;

public class E06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int numberOfJury = Integer.parseInt(scanner.nextLine());

        double totalPoints = 0;
        for (int i = 1; i <= numberOfJury ; i++) {
            String nameOfJury = scanner.nextLine();
            double pointsOfJury = Double.parseDouble(scanner.nextLine());
        }
    }
}
