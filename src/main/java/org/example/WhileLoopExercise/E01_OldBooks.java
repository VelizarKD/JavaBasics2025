package org.example.WhileLoopExercise;

import java.util.Scanner;

public class E01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String annyBook = scanner.nextLine();
        int bookCount = 0;


        while (true){
            String currentBook = scanner.nextLine();


            if (currentBook.equals(annyBook)) {
                System.out.printf("You checked %d books and found it.", bookCount);
                break;
            }
            if (currentBook.equals("No More Books")){
                System.out.printf("The book you search is not here!%nYou checked %d books.", bookCount);
                break;
            }
            bookCount++;
        }

    }
}
