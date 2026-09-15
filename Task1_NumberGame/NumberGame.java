import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        do {

            // Generate random number between 1 and 100
            int number = random.nextInt(100) + 1;

            int guess;
            int attempts = 0;

            System.out.println("\n===== NUMBER GAME =====");
            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("Try to guess it!");

            // Keep asking until correct
            do {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();

                attempts++;

                if (guess > number) {
                    System.out.println("Too high! Try again.");

                } else if (guess < number) {
                    System.out.println("Too low! Try again.");

                } else {
                    System.out.println("Correct! You guessed the number.");
                    System.out.println("Number of attempts: " + attempts);

                    score++;
                }

            } while (guess != number);

            System.out.println("Your score: " + score);

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\nThank you for playing!");
        System.out.println("Final Score: " + score);

        sc.close();
    }
}
