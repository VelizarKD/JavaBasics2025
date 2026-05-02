package org.example.ExamPrep;

import java.util.Scanner;

public class E03_MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double filmDay = 0;
        double totalPrice = 0;

        switch (destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    filmDay = 45000;
                } else if (season.equals("Summer")) {
                    filmDay = 40000;
                }
                totalPrice = days * filmDay;
                totalPrice = totalPrice - totalPrice * 0.30;
                break;
            case "Sofia":
                if (season.equals("Winter")) {
                    filmDay = 17000;
                } else if (season.equals("Summer")) {
                    filmDay = 12500;
                }
                totalPrice = days * filmDay;
                totalPrice = totalPrice + totalPrice * 0.25;
                break;
            case "London":
                if (season.equals("Winter")) {
                    filmDay = 24000;
                } else if (season.equals("Summer")) {
                    filmDay = 20250;
                }
                totalPrice = days * filmDay;
                break;
        }
        if (totalPrice <= budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("The director needs %.2f leva more!", Math.abs(budget - totalPrice));
        }
    }
}
