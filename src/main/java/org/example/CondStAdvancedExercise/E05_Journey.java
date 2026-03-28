package org.example.CondStAdvancedExercise;

import java.util.Scanner;

public class E05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String kindOfRoom = "";
        double price = 0;

        if (budget <= 100) {
            if (season.equals("summer")) {
                destination = "Bulgaria";
                kindOfRoom = "Camp";
                price = budget - budget * 0.30;

            } else if (season.equals("winter")) {
                destination = "Bulgaria";
                kindOfRoom = "Hotel";
                price = budget - budget * 0.70;
            }
        } else if (budget > 100 && budget <= 1000) {
            if (season.equals("summer")) {
                destination = "Balkans";
                kindOfRoom = "Camp";
                price = budget - budget * 0.40;
            } else if (season.equals("winter")) {
                destination = "Balkans";
                kindOfRoom = "Hotel";
                price = budget - budget * 0.80;
            }
        } else if (budget > 1000) {
                destination = "Europe";
                kindOfRoom = "Hotel";
                price = budget - budget * 0.90;
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", kindOfRoom, budget - price);
    }
}
