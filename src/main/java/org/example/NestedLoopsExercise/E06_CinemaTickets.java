package org.example.NestedLoopsExercise;

import java.util.Scanner;

public class E06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int totalTicketsCount = 0;
        int studentTicketsCount = 0;
        int standardTicketsCount = 0;
        int kidTicketsCount = 0;

        while (!command.equals("Finish")) {
            String movieName = command;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int ticketsSoldCounter = 0;

            String endCommand = scanner.nextLine();
            while (!endCommand.equals("End")) {
                String ticketType = endCommand;
                totalTicketsCount++;
                ticketsSoldCounter++;

                switch (ticketType) {
                    case "student" -> studentTicketsCount++;
                    case "standard" -> standardTicketsCount++;
                    case "kid" -> kidTicketsCount++;
                }

                if (ticketsSoldCounter == freeSeats) {
                    break;
                }
                endCommand = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, 1.0 * ticketsSoldCounter / freeSeats * 100);
            command = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n" +
                "%.2f%% student tickets.%n" +
                "%.2f%% standard tickets.%n" +
                "%.2f%% kids tickets.", totalTicketsCount,
                1.0 * studentTicketsCount / totalTicketsCount * 100,
                1.0 * standardTicketsCount / totalTicketsCount * 100,
                1.0 * kidTicketsCount / totalTicketsCount * 100
                );
    }
}
