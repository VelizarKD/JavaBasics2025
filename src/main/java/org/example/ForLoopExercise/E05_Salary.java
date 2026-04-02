package org.example.ForLoopExercise;

import java.util.Scanner;

public class E05_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int facebookFine = 150;
        int instagramFine = 100;
        int redditFine = 50;

        for (int i = 1; i <= numberOfTabs ; i++) {
            String tabs = scanner.nextLine();

            if (tabs.equals("Facebook")) {
                 salary -= facebookFine;
            } else if (tabs.equals("Instagram")) {
                salary -= instagramFine;
            } else if (tabs.equals("Reddit")) {
                salary -= redditFine;
            }
        }

        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
