package org.example.ConditionalStatmentsExercise;

import java.util.Scanner;

public class E06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double result = distance * timeInSec;
        double distanceDelay = Math.floor(distance / 15);
        double delayInSeconds = distanceDelay * 12.5;

        double finalResult = result + delayInSeconds;

        if (finalResult < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalResult);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(record - finalResult));
        }
    }
}
