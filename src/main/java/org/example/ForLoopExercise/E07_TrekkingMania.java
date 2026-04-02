package org.example.ForLoopExercise;

import java.util.Scanner;

public class E07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfGroups = Integer.parseInt(scanner.nextLine());

        double musalla = 0;
        double monBlanc = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;

        int totalPeople = 0;

        double pMusalla = 0;
        double pMonBlanc = 0;
        double pKilimanjaro = 0;
        double pK2 = 0;
        double pEverest = 0;

        for (int i = 1; i <= numOfGroups; i++) {
            int numOfPeople = Integer.parseInt(scanner.nextLine());
            totalPeople += numOfPeople;

            if (numOfPeople <= 5) {
                musalla += numOfPeople;
            } else if (numOfPeople <= 12) {
                monBlanc += numOfPeople;
            } else if (numOfPeople <= 25) {
                kilimanjaro += numOfPeople;
            } else if (numOfPeople <= 40) {
                k2 += numOfPeople;
            } else  {
                everest += numOfPeople;
            }
        }
        pMusalla = musalla / totalPeople * 100;
        pMonBlanc = monBlanc / totalPeople * 100;
        pKilimanjaro = kilimanjaro / totalPeople * 100;
        pK2 = k2 / totalPeople * 100;
        pEverest = everest / totalPeople * 100;

        System.out.printf("%.2f%%%n", pMusalla);
        System.out.printf("%.2f%%%n", pMonBlanc);
        System.out.printf("%.2f%%%n", pKilimanjaro);
        System.out.printf("%.2f%%%n", pK2);
        System.out.printf("%.2f%%", pEverest);

    }
}
