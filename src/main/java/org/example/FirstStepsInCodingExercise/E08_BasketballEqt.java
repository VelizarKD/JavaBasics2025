package org.example.FirstStepsInCodingExercise;

import java.util.Scanner;

public class E08_BasketballEqt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = annualFee - annualFee * 0.40;
        double basketballKit = sneakersPrice - sneakersPrice * 0.20;
        double ball = basketballKit / 4;
        double accessory = ball / 5;

        double totalSum = annualFee + sneakersPrice + basketballKit + ball + accessory;

        System.out.println(totalSum);
    }
}
