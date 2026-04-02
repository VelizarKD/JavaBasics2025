package org.example.WhileLoop;

import java.util.Scanner;

public class E02_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        while (!password.equals(password)) {
            password = scanner.nextLine();
        }
        System.out.println("Welcome " + username + "!");
    }
}
