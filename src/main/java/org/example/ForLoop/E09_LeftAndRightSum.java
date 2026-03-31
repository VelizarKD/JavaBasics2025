package org.example.ForLoop;


import java.util.Scanner;

public class E09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            int leftNum = Integer.parseInt(scanner.nextLine());
            leftSum += leftNum;
        }
            for (int j = 0; j < n; j++) {
                int rightNum = Integer.parseInt(scanner.nextLine());
                rightSum += rightNum;
            }

        if (leftSum == rightSum){
            System.out.println("Yes, sum = " + leftSum );
        }else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }
    }
}
