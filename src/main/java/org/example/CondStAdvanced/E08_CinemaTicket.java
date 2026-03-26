package org.example.CondStAdvanced;

import java.util.Scanner;

public class E08_CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        double price = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                price = 12;
                break;
            case "Wednesday":
            case "Thursday":
                price = 14;
                break;
            case "Saturday":
            case "Sunday":
                price = 16;
                break;
            default:
                break;
        }

        System.out.printf("%.0f", price);
    }
}
