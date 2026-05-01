package org.example.ExamPrep;

import java.util.Scanner;

public class E01_FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananaKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspberryKg = Double.parseDouble(scanner.nextLine());
        double strawberryKg = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice / 2;
        double orangePrice = raspberryPrice - (0.4 * raspberryPrice);
        double bananaPrice = raspberryPrice - (0.8 * raspberryPrice);

        double totalPrice = strawberryKg * strawberryPrice + bananaKg * bananaPrice + orangeKg * orangePrice + raspberryKg * raspberryPrice;

        System.out.printf("%.2f", totalPrice);
    }
}
