package org.example.CondStAdvancedExercise;

import java.util.Scanner;

public class E09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String rating = scanner.nextLine();



        double totalPrice = 0;

        switch (typeOfRoom) {
            case "room for one person":
                double roomForOnePersonPrice = 18;
                totalPrice = (days - 1) * roomForOnePersonPrice;
                if (rating.equals("positive")) {
                    totalPrice = totalPrice + totalPrice * 0.25;
                } else if (rating.equals("negative")) {
                    totalPrice = totalPrice - totalPrice * 0.10;
                }
                break;
            case "apartment":
                double apartmentPrice = 25;
                totalPrice = (days - 1) * apartmentPrice;
                if (days < 10) {
                    totalPrice = totalPrice - totalPrice * 0.30;
                } else if (days > 10 && days <= 15) {
                    totalPrice = totalPrice - totalPrice * 0.35;
                } else {
                    totalPrice = totalPrice - totalPrice * 0.50;
                }
                if (rating.equals("positive")) {
                    totalPrice = totalPrice + totalPrice * 0.25;
                } else if (rating.equals("negative")) {
                    totalPrice = totalPrice - totalPrice * 0.10;
                }
                break;
            case "president apartment":
                double presidentApartmentPrice = 35;
                totalPrice = (days - 1) * presidentApartmentPrice;
                if (days < 10) {
                    totalPrice = totalPrice - totalPrice * 0.1;
                } else if (days > 10 && days <= 15) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                } else {
                    totalPrice = totalPrice - totalPrice * 0.20;
                }
                if (rating.equals("positive")) {
                    totalPrice = totalPrice + totalPrice * 0.25;
                } else if (rating.equals("negative")) {
                    totalPrice = totalPrice - totalPrice * 0.10;
                }
                break;
            default:
                break;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
