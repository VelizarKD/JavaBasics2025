package org.example.ConditionalStatements;

import java.util.Scanner;

public class E07_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("square")) {
            double squareLength =Double.parseDouble(scanner.nextLine());
            double sum = squareLength * squareLength;
            System.out.printf("%.3f", sum);

        } else if (input.equals("rectangle")) {
            double rectangleLength = Double.parseDouble(scanner.nextLine());
            double rectangleLength2 = Double.parseDouble(scanner.nextLine());
            double sum = rectangleLength * rectangleLength2;
            System.out.printf("%.3f", sum);

        } else if (input.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double sum = Math.PI * radius * radius;
            System.out.printf("%.3f", sum);

        } else if (input.equals("triangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double sum = (length * height) / 2;
            System.out.printf("%.3f", sum);
        }
    }
}
