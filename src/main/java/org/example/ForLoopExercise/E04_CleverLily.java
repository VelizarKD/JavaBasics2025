package org.example.ForLoopExercise;

import java.util.Scanner;

public class E04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toyCount = 0;
        double money = 0;
        int moneyGift = 0; // нарастващият подарък
        int brotherMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyGift += 10;      // 10, 20, 30...
                money += moneyGift;   // добавяме към общите пари
                brotherMoney++;       // братът взима 1 лв
            } else {
                toyCount++;
            }
        }

        double toysMoney = toyCount * toyPrice;
        double totalMoney = money + toysMoney - brotherMoney;

        if (totalMoney >= washerPrice) {
            System.out.printf("Yes! %.2f", totalMoney - washerPrice);
        } else {
            System.out.printf("No! %.2f", washerPrice - totalMoney);
        }
    }
}


