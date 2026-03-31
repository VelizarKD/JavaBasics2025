package org.example.ForLoopExercise;

import java.util.Scanner;

public class E02_HalfSumElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if (num > maxNum) {
                maxNum = num;
            }
        }
        int sumWithoutMaxNumber = sum - maxNum;

        if (sumWithoutMaxNumber == maxNum) {
            System.out.printf("Yes%nSum = %d" , maxNum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sumWithoutMaxNumber - maxNum));
        }
    }
}
