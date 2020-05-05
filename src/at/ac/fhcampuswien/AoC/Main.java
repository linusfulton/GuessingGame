package at.ac.fhcampuswien.AoC;

import java.util.Scanner;
import java.util.Random;

public class Main {

    // Guessing algorithm idea:
    // Ask for higher lower, add certain number and then always add half number recursively
    // Approach correct answer

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        int number;
        do {
            System.out.println("Enter a number between 0 - 100");
            number = scanner1.nextInt();
        } while (number <= 0 || number >= 100);

        Random random = new Random();
        int guess = random.nextInt(100);

        System.out.println("number: " + number + " and my guess equals: " + guess);

        do {
            System.out.println("Does my guess have to be higher or lower? Answer \"l\" or \"h\":");

            Scanner scanner2 = new Scanner(System.in);
            String answer = scanner2.nextLine();

            if (answer.equals("h")) {
                guess++;
                System.out.println(guess + "?");
            } else if (answer.equals("l")) {
                guess--;
                System.out.println(guess + "?");
            }

        } while (number != guess);
        System.out.println("I've guessed your number!");
    }

    /*
    private void validNumber() {

        Scanner scanner = new Scanner(System.in);

        int guess;
        do {
            System.out.println("Enter a number between 0 - 100");
            guess = scanner.nextInt();
        } while (guess >= 0 && guess <= 100);
    }
    */
}
