package org.example.WhileLoop;

import java.util.Scanner;

public class E03_SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (sum < number1) {
             int number = Integer.parseInt(scanner.nextLine());
             sum += number;
        }
        System.out.println(sum);
    }
}
