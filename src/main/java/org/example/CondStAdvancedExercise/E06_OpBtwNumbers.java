package org.example.CondStAdvancedExercise;

import java.util.Scanner;

public class E06_OpBtwNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int num1 = Integer.parseInt(scanner.nextLine());
         int num2 = Integer.parseInt(scanner.nextLine());
         char symbol = scanner.nextLine().charAt(0);

         double mathExpression = 0;
         String isEvenOrOdd = "";

         switch (symbol) {
             case '+':
                 mathExpression = num1 + num2;
                 if (mathExpression % 2 == 0) {
                     isEvenOrOdd = "even";
                 } else {
                     isEvenOrOdd = "odd";
                 }
                 System.out.printf("%d %c %d = %.0f - %s", num1, symbol, num2, mathExpression, isEvenOrOdd);
                 break;
             case '-':
                 mathExpression = num1 - num2;
                 if (mathExpression % 2 == 0) {
                     isEvenOrOdd = "even";
                 } else {
                     isEvenOrOdd = "odd";
                 }
                 System.out.printf("%d %c %d = %.0f - %s", num1, symbol, num2, mathExpression, isEvenOrOdd);
                 break;
             case '*':
                 mathExpression = num1 * num2;
                 if (mathExpression % 2 == 0) {
                     isEvenOrOdd = "even";
                 } else {
                     isEvenOrOdd = "odd";
                 }
                 System.out.printf("%d %c %d = %.0f - %s", num1, symbol, num2, mathExpression, isEvenOrOdd);
                 break;
             case '/':
                 if (num2 == 0) {
                     System.out.printf("Cannot divide %d by zero", num1);
                 } else {
                     mathExpression = (double) num1 / num2;
                     System.out.printf("%d %c %d = %.2f", num1, symbol, num2, mathExpression);
                 }
                 break;
             case '%':
                 if (num2 == 0) {
                     System.out.printf("Cannot divide %d by zero", num1);
                 } else {
                     mathExpression = (double) num1 % num2;
                     System.out.printf("%d %c %d = %.0f", num1, symbol, num2, mathExpression);
                 }
                 break;
             default:
                 break;

         }
    }
}
