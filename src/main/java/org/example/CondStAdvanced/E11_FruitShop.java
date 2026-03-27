package org.example.CondStAdvanced;

import java.util.Scanner;

public class E11_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (product.equals("banana")) {
                    price = 2.5;
                } else if (product.equals("apple")) {
                    price = 1.2;
                } else if (product.equals("orange")) {
                    price = 0.85;
                } else if (product.equals("grapefruit")) {
                    price = 1.45;
                } else if (product.equals("kiwi")) {
                    price = 2.70;
                } else if (product.equals("pineapple")) {
                    price = 5.50;
                } else if (product.equals("grapes")) {
                    price = 3.85;
                } else {
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if (product.equals("banana")) {
                    price = 2.7;
                } else if (product.equals("apple")) {
                    price = 1.25;
                } else if (product.equals("orange")) {
                    price = 0.90;
                } else if (product.equals("grapefruit")) {
                    price = 1.60;
                } else if (product.equals("kiwi")) {
                    price = 3;
                } else if (product.equals("pineapple")) {
                    price = 5.60;
                } else if (product.equals("grapes")) {
                    price = 4.20;
                } else {
                    System.out.println("error");
                }

                break;
            default:
                System.out.println("error");
                break;
        }
        totalPrice = price * quantity;
        if (totalPrice > 0) {
            System.out.printf("%.2f", totalPrice);
        }

    }
}
