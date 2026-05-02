package org.example.ExamPrep;

import java.util.Scanner;

public class E05_EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerOneEggs = Integer.parseInt(scanner.nextLine());
        int playerTwoEggs= Integer.parseInt(scanner.nextLine());


        String command = scanner.nextLine();

        while (!command.equals("End")) {
            if (command.equals("one")) {
                playerTwoEggs--;
            } else if (command.equals("two")) {
                playerOneEggs--;
            }

            if (playerOneEggs <= 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", playerTwoEggs);
                break;
            } else if (playerTwoEggs <= 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", playerOneEggs);
                break;
            }
            command = scanner.nextLine();
        }
        if (playerOneEggs > 0 && playerTwoEggs > 0) {
            System.out.printf("Player one has %d eggs left.%n", playerOneEggs);
            System.out.printf("Player two has %d eggs left.", playerTwoEggs);
        }
    }
}
