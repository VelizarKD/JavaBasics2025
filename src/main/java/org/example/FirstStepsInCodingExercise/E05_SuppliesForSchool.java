package org.example.FirstStepsInCodingExercise;

import java.util.Scanner;

public class E05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaningAgent = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine()) / 100;

        double penPrice = pens * 5.80;
        double markerPrice = markers * 7.20;
        double cleaningAgentPrice = cleaningAgent * 1.20;

        double totalPrice = penPrice + markerPrice + cleaningAgentPrice;
        double discountPrice = totalPrice - (totalPrice * discount);

        System.out.println(discountPrice);
    }
}
