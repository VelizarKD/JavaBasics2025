package org.example.FirstStepsInCodingExercise;

import java.util.Scanner;

public class E03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int depositTerm = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine()) / 100;


        double sum = deposit + depositTerm *((deposit * interestRate) / 12);

        System.out.println(sum);
    }
}
