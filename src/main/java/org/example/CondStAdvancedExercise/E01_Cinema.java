package org.example.CondStAdvancedExercise;

import java.util.Scanner;

public class E01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double sum = 0;

        if (projection.equals("Premiere")) {
            price = 12;
        } else if (projection.equals("Normal")) {
            price = 7.5;
        } else if (projection.equals("Discount")) {
            price = 5;
        }

        sum = rows * columns * price;

        System.out.printf("%.2f leva", sum);
    }
}
