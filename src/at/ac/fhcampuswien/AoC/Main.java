package at.ac.fhcampuswien.AoC;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        int number;
        do {
            System.out.println("Enter a number between 0 - 99");
            number = scanner1.nextInt();
        } while (number <= 0 || number >= 100);

        int floor = 1;
        int ceiling = 100;
        int guess = (ceiling + floor) / 2;

        System.out.println("number: " + number + " and my guess equals: " + guess);

        do {
            System.out.println("Does my guess have to be higher or lower? Answer \"l\" or \"h\":");

            Scanner scanner2 = new Scanner(System.in);
            String answer = scanner2.nextLine();

            if (answer.equals("h")) {
                floor = guess;
                guess = (ceiling + floor) / 2;
                System.out.println(guess + "?");
            } else if (answer.equals("l")) {
                ceiling = guess;
                guess = (ceiling + floor) / 2;
                System.out.println(guess + "?");
            }

        } while (number != guess);
        System.out.println("I've guessed your number!");
    }
}