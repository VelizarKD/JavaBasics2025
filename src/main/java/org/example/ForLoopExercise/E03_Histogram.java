package org.example.ForLoopExercise;

import java.util.Scanner;

public class E03_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        int p1count = 0;
        int p2count = 0;
        int p3count = 0;
        int p4count = 0;
        int p5count = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                p1count++;
            } else if (number < 400) {
                p2count++;
            } else if (number < 600) {
                p3count++;
            } else if (number < 800) {
                p4count++;
            } else  {
                p5count++;
            }

        }
        p1 = p1count * 1.0 / n * 100;
        p2 = p2count * 1.0 / n * 100;
        p3 = p3count * 1.0 / n * 100;
        p4 = p4count * 1.0 / n * 100;
        p5 = p5count * 1.0 / n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%", p5);
    }
}
