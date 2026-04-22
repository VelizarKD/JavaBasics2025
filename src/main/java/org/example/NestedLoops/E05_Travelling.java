package org.example.NestedLoops;

import java.util.Scanner;

public class E05_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double neededMoney = Double.parseDouble(scanner.nextLine());
            double budget = 0;

            while (neededMoney > budget) {
                double currentMoney = Double.parseDouble(scanner.nextLine());

                budget += currentMoney;
            }

            System.out.printf("Going to %s!%n", destination);


            destination = scanner.nextLine();
        }
    }
}
