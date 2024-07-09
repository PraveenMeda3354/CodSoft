import java.util.Random;
import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        Scanner inputScanner = new Scanner(System.in);
        Random numberGenerator = new Random();

        int totalRounds = 0;
        int totalGuesses = 0;

        while (true) {
            int secretNumber = numberGenerator.nextInt(100) + 1;

            System.out.println("I've generated a random number between 1 and 100. Can you guess it?");

            int maxGuesses = 5;
            int currentGuesses = 0;

            while (currentGuesses < maxGuesses) {
                System.out.print("Enter your guess: ");
                int playerGuess = inputScanner.nextInt();

                if (playerGuess == secretNumber) {
                    System.out.println("Congratulations You guessed the number correctly.");
                    break;
                } else if (playerGuess < secretNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }

                currentGuesses++;
                totalGuesses++;
            }

            if (currentGuesses == maxGuesses) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + secretNumber + ".");
            }

            totalRounds++;

            System.out.print("Do you want to play again? (y/n) ");
            String playAgain = inputScanner.next();

            if (!playAgain.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Total guesses: " + totalGuesses);
        System.out.println("Thanks for playing!");
    }
}