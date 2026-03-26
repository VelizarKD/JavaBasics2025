package org.example.ConditionalStatmentsExercise;

import java.util.Scanner;

public class E05_GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int actor = Integer.parseInt(scanner.nextLine());
        double priceCostume = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0;
        double decor = budget * 0.10;
        double costumePrice = actor * priceCostume;

        if (actor >= 150) {
            costumePrice = costumePrice - costumePrice * 0.10;
        }

        totalPrice = costumePrice + decor;

        if (totalPrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget - totalPrice));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(budget - totalPrice));
        }
    }
}
