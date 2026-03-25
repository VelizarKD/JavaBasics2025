package org.example.FirstStepsInCodingExercise;

import java.util.Scanner;

public class E07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double delivery = 2.5;

        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double vegetarianMenuPrice = vegetarianMenu * 8.15;

        double menusSum = chickenMenuPrice + fishMenuPrice + vegetarianMenuPrice;
        double desertPrice = menusSum * 0.20;
        double totalSum = menusSum + desertPrice + delivery;

        System.out.println(totalSum);

    }
}
