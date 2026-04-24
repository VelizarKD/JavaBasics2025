package org.example.NestedLoopsExercise;

import java.util.Scanner;

public class E01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int current = 1;
        boolean isBigger = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 0; cols < rows; cols++) {
                if (current > n) {
                    isBigger = true;
                    break;
                }
                System.out.print(current + " ");
                current++;
            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}
