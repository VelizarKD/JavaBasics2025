package org.example.FirstStepsInCodingExercise;

import java.util.Scanner;

public class E04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagesForHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hours = bookPages / pagesForHour;
        int hoursPerDay = hours / days;

        System.out.println(hoursPerDay);
    }
}
