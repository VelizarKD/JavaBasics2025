package org.example.ExamPrep;

import java.util.Scanner;

public class E06_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //прочитаме 2 числа
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        //намираме първа, втора , трета и четвърта цифра на 1во число
        int firstDigitFirstNum = firstNumber / 1000;
        int secondDigitFirstNum = firstNumber / 100 % 10;
        int thirdDigitFirstNum = firstNumber / 10 % 10;
        int forthDigitFirstNum = firstNumber % 10;

        //... на второто число
        int firstDigitSecondNum = secondNumber / 1000;
        int secondDigitSecondNum = secondNumber / 100 % 10;
        int thirdDigitSecondNum = secondNumber / 10 % 10;
        int forthDigitSecondNum = secondNumber % 10;

        //преминаваме през всички интервали
        for (int i = firstDigitFirstNum; i <= firstDigitSecondNum; i++) {
            for (int j = secondDigitFirstNum; j <= secondDigitSecondNum; j++) {
                for (int k = thirdDigitFirstNum; k <= thirdDigitSecondNum; k++) {
                    for (int l = forthDigitFirstNum; l <= forthDigitSecondNum; l++) {

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
