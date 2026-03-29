package org.example.CondStAdvancedExercise;

import java.util.Scanner;

public class E07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int overnightStay = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;
        double sumStudioPrice = 0;
        double sumApartmentPrice = 0;


        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                if (overnightStay > 7 && overnightStay < 14) {
                    studioPrice = studioPrice - studioPrice * 0.05;
                } else if (overnightStay > 14) {
                    studioPrice = studioPrice - studioPrice * 0.30;
                }
                if (overnightStay > 14) {
                    apartmentPrice = apartmentPrice - apartmentPrice * 0.10;
                }
                sumStudioPrice = studioPrice * overnightStay;
                sumApartmentPrice = apartmentPrice * overnightStay;
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.7;
                if (overnightStay > 14) {
                    studioPrice = studioPrice - studioPrice * 0.20;
                }
                if (overnightStay > 14) {
                    apartmentPrice = apartmentPrice - apartmentPrice * 0.10;
                }
                sumStudioPrice = studioPrice * overnightStay;
                sumApartmentPrice = apartmentPrice * overnightStay;
                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                if (overnightStay > 14) {
                    apartmentPrice = apartmentPrice - apartmentPrice * 0.10;
                }
                sumStudioPrice = studioPrice * overnightStay;
                sumApartmentPrice = apartmentPrice * overnightStay;
                break;
            default:
                break;
        }

        System.out.printf("Apartment: %.2f lv.%n", sumApartmentPrice);
        System.out.printf("Studio: %.2f lv.", sumStudioPrice);
    }
}
