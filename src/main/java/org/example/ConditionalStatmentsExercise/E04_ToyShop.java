package org.example.ConditionalStatmentsExercise;

import java.util.Scanner;

public class E04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        //общия брой на всички играчки
        int numberOfToys = puzzles + dolls + teddyBears + minions + trucks;

        //колко струват различните видове играчки
        double puzzlesPrice = puzzles * 2.60;
        double dollsPrice = dolls * 3;
        double teddyBearsPrice = teddyBears * 4.10;
        double minionsPrice =minions * 8.20;
        double trucksPrice = trucks * 2;

        double sumToys = puzzlesPrice + dollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;
        //наем и цена с наем
        double rent = sumToys * 0.10;
        totalPrice = sumToys - rent;

        if (numberOfToys >= 50) {
            totalPrice = totalPrice - totalPrice * 0.25;
        }

        if (totalPrice >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", totalPrice - excursionPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(totalPrice - excursionPrice));
        }

    }
}
