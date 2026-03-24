package org.example.FirstStepsInCoding;

import java.util.Scanner;

public class E09_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cm2 = Double.parseDouble(scanner.nextLine());

        double price = cm2 * 7.61;
        double discount = 0.18 * price;
        double finalPrice = price - discount;

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
