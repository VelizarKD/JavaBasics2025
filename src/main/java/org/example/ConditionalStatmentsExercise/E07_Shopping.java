package org.example.ConditionalStatmentsExercise;

import java.util.Scanner;

public class E07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videoCard * 250;
        double processorPrice = processor * (videoCardPrice * 0.35);
        double ramPrice = ram * (videoCardPrice * 0.10);

        double totalPrice = videoCardPrice + processorPrice + ramPrice;

        if (videoCard > processor) {
            totalPrice = totalPrice - totalPrice * 0.15;
        }

        if (totalPrice <= budget) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - totalPrice));
        }

    }
}
