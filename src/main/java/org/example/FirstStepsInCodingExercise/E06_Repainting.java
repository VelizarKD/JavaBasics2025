package org.example.FirstStepsInCodingExercise;

import java.util.Scanner;

public class E06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonCm2 = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int paintTinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonSum = (nylonCm2 + 2) * 1.5;
        double paintSum = (paint + paint * 0.10) * 14.5;
        double paintTinnerSum = paintTinner * 5;
        double bagSum = 0.4;
        double materialsSum = nylonSum + paintSum + paintTinnerSum + bagSum;
        double masterSum = (materialsSum * 0.30) * hours;

        double totalSum = materialsSum + masterSum;

        System.out.println(totalSum);

    }
}
