package org.example.CondStAdvancedExercise;

import java.util.Scanner;

public class E04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numOfFisherman = Integer.parseInt(scanner.nextLine());

        double priceForRent = 0;
        double discount = 0;
        double totalPrice = 0;

        switch (season) {
            case "Spring":
                priceForRent = 3000;
                if (numOfFisherman <= 6) {
                    discount = priceForRent * 0.10;
                    totalPrice = priceForRent - discount;
                } else if (numOfFisherman > 7 && numOfFisherman <= 11) {
                    discount = priceForRent * 0.15;
                    totalPrice = priceForRent - discount;
                } else if (numOfFisherman >= 12) {
                    discount = priceForRent * 0.25;
                    totalPrice = priceForRent - discount;
                }
                break;
            case "Summer":
            case "Autumn":
                priceForRent = 4200;
                if (numOfFisherman <= 6) {
                    discount = priceForRent * 0.10;
                    totalPrice = priceForRent - discount;
                } else if (numOfFisherman > 7 && numOfFisherman <= 11) {
                    discount = priceForRent * 0.15;
                    totalPrice = priceForRent - discount;
                } else if (numOfFisherman >= 12) {
                    discount = priceForRent * 0.25;
                    totalPrice = priceForRent - discount;
                }
                break;
            case "Winter":
                priceForRent = 2600;
                if (numOfFisherman <= 6) {
                    discount = priceForRent * 0.10;
                    totalPrice = priceForRent - discount;
                } else if (numOfFisherman > 7 && numOfFisherman <= 11) {
                    discount = priceForRent * 0.15;
                    totalPrice = priceForRent - discount;
                } else if (numOfFisherman >= 12) {
                    discount = priceForRent * 0.25;
                    totalPrice = priceForRent - discount;
                }
                break;
            default:
                break;
        }

        if (numOfFisherman % 2 == 0 && !season.equals("Autumn")) {
            totalPrice = totalPrice - totalPrice * 0.05;
        }

        if (totalPrice <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - totalPrice));
        }

    }
}
