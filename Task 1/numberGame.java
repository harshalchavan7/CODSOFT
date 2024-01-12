import java.util.Scanner;
import java.util.Random;

public class numberGame
{

    public static void main(String args[])
    {
        System.out.println("\nGuess the number between 0 and 100, based on the feedbacks");
        int choice = 1, roundsWon = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (choice == 1)
        {
            int numberToGuess = random.nextInt(101);
            int guess = -1, attemptNumber = 1;
            System.out.println("Max Attempts: 10");

            while (guess != numberToGuess && attemptNumber <= 10)
            {
                System.out.println("\nAttempt number = " + attemptNumber);
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();

                if (guess < numberToGuess)
                {
                    System.out.println("Higher\n");
                }
                else if (guess > numberToGuess)
                {
                    System.out.println("Lower\n");
                }

                attemptNumber++;
            }

            if (guess == numberToGuess)
            {
                System.out.println("\nCorrect!\nNumber of attempts = " + (attemptNumber - 1));
                roundsWon++;
            }
            else
            {
                System.out.println("Game over, max attempts reached");
            }

            System.out.print("\n1. Yes 0. No\nPlay again? ");
            choice = scanner.nextInt();
        }

        System.out.println("\n\nQuitting...\nRounds won: " + roundsWon);
        scanner.close();
    }
}