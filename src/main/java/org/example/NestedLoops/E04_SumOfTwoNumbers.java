package org.example.NestedLoops;

import java.util.Scanner;

public class E04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int countCombination = 0;
        boolean fountValidCombination = false;

        for (int i = startNum; i <= endNum; i++) {
            for (int j = startNum; j <= endNum; j++) {
                int currentCombination = i + j;
                countCombination++;

                if (currentCombination == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", countCombination, i, j, magicNum);
                    fountValidCombination = true;
                    break;
                }
            }
            if (fountValidCombination) {
                break;
            }
        }
        if (!fountValidCombination) {
            System.out.printf("%d combinations - neither equals %d", countCombination , magicNum);
        }
    }
}
