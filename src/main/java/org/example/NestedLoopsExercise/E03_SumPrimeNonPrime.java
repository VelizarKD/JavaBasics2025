package org.example.NestedLoopsExercise;

import java.util.Scanner;

public class E03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!command.equals("stop")) {
            int number = Integer.parseInt(command);

            if (number < 0) {
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
                int dividerCount = 0;

                for (int i = 1; i <= number; i++) {

                    if (number % i == 0) {
                        dividerCount++;
                    }
                }
                if (dividerCount > 2) {
                    sumNonPrime += number;
                } else {
                    sumPrime += number;
                }

            command = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%nSum of all non prime numbers is: %d", sumPrime, sumNonPrime);
    }
}
