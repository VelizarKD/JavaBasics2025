package org.example.NestedLoopsExercise;

import java.util.Scanner;

public class E04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfJury = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        double sumAverageGrades = 0;
        int presentationsCount = 0;


        while (!command.equals("Finish")) {
            double sumGrades = 0;

            for (int i = 1; i <= numOfJury ; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                sumGrades += grades;
            }
            double averageGrade = sumGrades / numOfJury;
            System.out.printf("%s - %.2f.%n" , command , averageGrade);

            sumAverageGrades += averageGrade;
            presentationsCount++;

            command = scanner.nextLine();
        }

        double finalAssessment = sumAverageGrades / presentationsCount;
        System.out.printf("Student's final assessment is %.2f.", finalAssessment);

    }
}
