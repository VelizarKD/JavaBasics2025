package org.example.ConditionalStatmentsExercise;

import java.util.Scanner;

public class E08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tvShow = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchtime = breakDuration / 8.0;
        double breaktime = breakDuration / 4.0;
        double remainingTime = breakDuration - lunchtime - breaktime;

        double diff = Math.abs(remainingTime - episodeDuration);
        if (remainingTime >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvShow, Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tvShow, Math.ceil(diff));
        }
    }
}
