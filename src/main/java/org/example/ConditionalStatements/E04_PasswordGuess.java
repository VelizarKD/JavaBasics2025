package org.example.ConditionalStatements;

import java.util.Scanner;

public class E04_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPass = scanner.nextLine();
        String password = "s3cr3t!P@ssw0rd";

        if (inputPass.equals(password)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
