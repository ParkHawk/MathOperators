package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        System.out.println(randomNum);

        String userInput = scanner.nextLine();
        int input = Integer.parseInt(userInput);


        while (input != randomNum) {
            if (input > randomNum) {
                System.out.println("Your guess is higher than the number");
            }
            if (input < randomNum) {
                System.out.println("Your guess is lower than the number");
            }
            if (input == randomNum) {
                System.out.println("You were right!");
            }
            new Scanner(System.in);
            scanner.nextLine();
        }
    }



//    public static void compare (int userInput, int y) {
//        if (userInput > y) {
//            System.out.println("Your guess is higher than the number");
//        }
//        if (userInput < y) {
//            System.out.println("Your guess is lower than the number");
//        }
//        if (userInput == y) {
//            System.out.println("You were right!");
//        }
//    }

}
