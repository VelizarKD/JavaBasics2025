package org.example.ForLoopExercise;

import java.util.Scanner;

public class E06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int numberOfJury = Integer.parseInt(scanner.nextLine());


        double neededPoints = 1250.5;
        for (int i = 1; i <= numberOfJury ; i++) {
            String nameOfJury = scanner.nextLine();
            double pointsOfJury = Double.parseDouble(scanner.nextLine());

            academyPoints += nameOfJury.length() * pointsOfJury / 2;
            if (academyPoints >= neededPoints) {
                break;
            }
        }


        if (academyPoints >= neededPoints) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, academyPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, Math.abs(neededPoints - academyPoints));
        }

    }
}
