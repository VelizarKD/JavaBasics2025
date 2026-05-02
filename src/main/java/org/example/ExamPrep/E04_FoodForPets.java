package org.example.ExamPrep;

import java.util.Scanner;

public class E04_FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        int totalFood = 0;
        int totalDogFood = 0;
        int totalCatFood = 0;

        double cookies = 0;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            totalFood += dogFood + catFood;
            totalDogFood += dogFood;
            totalCatFood += catFood;


            if (i % 3 == 0) {
                cookies += (dogFood + catFood) * 0.1;
            }
        }
        double percentEatenFood = totalFood * 100 / food;
        double percentEatenFoodByDog = totalDogFood * 100.0 / totalFood;
        double percentEatenFoodByCat = totalCatFood * 100.0 / totalFood;


        System.out.printf("Total eaten biscuits: %dgr.%n",Math.round( cookies));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentEatenFoodByDog);
        System.out.printf("%.2f%% eaten from the cat.", percentEatenFoodByCat);


    }
}
