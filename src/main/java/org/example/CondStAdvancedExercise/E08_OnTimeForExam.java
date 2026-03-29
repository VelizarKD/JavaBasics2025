package org.example.CondStAdvancedExercise;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class E08_OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        // превръщаме всичко в минути
        int examTime = examHour * 60 + examMin;
        int arrivalTime = arrivalHour * 60 + arrivalMin;

        int diff = arrivalTime - examTime;

        if (diff > 0) {
            System.out.println("Late");
        } else if (diff >= -30) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }

        if (diff != 0) {
            int absDiff = Math.abs(diff);

            int hours = absDiff / 60;
            int minutes = absDiff % 60;

            if (hours > 0) {
                if (diff > 0) {
                    System.out.printf("%d:%02d hours after the start", hours, minutes);
                } else {
                    System.out.printf("%d:%02d hours before the start", hours, minutes);
                }
            } else {
                if (diff > 0) {
                    System.out.printf("%d minutes after the start", minutes);
                } else {
                    System.out.printf("%d minutes before the start", minutes);
                }
            }
        }

    }
}
