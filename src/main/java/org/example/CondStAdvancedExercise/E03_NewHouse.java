package org.example.CondStAdvancedExercise;


import java.util.Scanner;

public class E03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceForFlower = 0;
        double totalPrice = 0;

        switch (flowers) {
            case "Roses":
                priceForFlower = 5;
                totalPrice = numOfFlowers * priceForFlower;
                if (numOfFlowers > 80) {
                    totalPrice = totalPrice - totalPrice * 0.10;
                }
                break;
            case "Dahlias":
                priceForFlower = 3.8;
                totalPrice = numOfFlowers * priceForFlower;
                if (numOfFlowers > 90) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                }
                break;
            case "Tulips":
                priceForFlower = 2.8;
                totalPrice = numOfFlowers * priceForFlower;
                if (numOfFlowers > 80) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                }
                break;
            case "Narcissus":
                priceForFlower = 3;
                totalPrice = numOfFlowers * priceForFlower;
                if (numOfFlowers < 120) {
                    totalPrice = totalPrice + totalPrice * 0.15;
                }
                break;
            case "Gladiolus":
                priceForFlower = 2.5;
                totalPrice = numOfFlowers * priceForFlower;
                if (numOfFlowers < 80) {
                    totalPrice = totalPrice + totalPrice * 0.20;
                }
                break;
            default:
                break;
        }
        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numOfFlowers, flowers, budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budget - totalPrice));
        }
    }
}
