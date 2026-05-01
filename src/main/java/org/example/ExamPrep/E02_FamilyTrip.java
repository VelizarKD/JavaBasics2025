package org.example.ExamPrep;

import java.util.Scanner;

public class E02_FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentExpenses = Integer.parseInt(scanner.nextLine());

        double additionalCosts = 0;
        double totalPriceForNights = 0;
        double totalPrice = 0;

        if (countNights > 7) {
            pricePerNight = pricePerNight - (pricePerNight * 0.05);
        }

        totalPriceForNights = pricePerNight * countNights;
        additionalCosts = budget * percentExpenses / 100;

        totalPrice = totalPriceForNights + additionalCosts;

        if (budget >= totalPrice) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalPrice);
        } else {
            System.out.printf("%.2f leva needed.", Math.abs(budget - totalPrice));
        }

    }
}
