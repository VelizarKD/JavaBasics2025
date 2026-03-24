package org.example.FirstStepsInCoding;

import java.util.Scanner;

public class E07_ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numOfProjects = Integer.parseInt(scanner.nextLine());

        int totalTime = numOfProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, totalTime, numOfProjects);
    }
}
