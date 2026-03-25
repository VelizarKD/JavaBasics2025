package org.example.FirstStepsInCodingExercise;

import java.util.Scanner;

public class E09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());


        double volume = length * width * height;
        double liters = volume * 0.001;
        double occupiedSpace = percent * 0.01;

        double neededLiters = liters *(1 - occupiedSpace);

        System.out.println(neededLiters);
    }
}
