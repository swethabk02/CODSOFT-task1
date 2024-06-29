import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        int totalScore = 0;

        while (playAgain) {
            Random random = new Random();
            int randomInt = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;
            int maxAttempts = 10;

            System.out.println("Guess a number between 1 and 100:");
            
            while (attempts < maxAttempts) {
                System.out.println("Enter your guess (Attempt " + (attempts + 1) + " of " + maxAttempts + "):");
                guess = scanner.nextInt();
                attempts++;

                if (guess == randomInt) {
                    System.out.println("Your guess is correct!");
                    totalScore += (maxAttempts - attempts + 1); // Higher score for fewer attempts
                    break;
                } else if (guess < randomInt) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }

            if (guess != randomInt) {
                System.out.println("Sorry, you've used all attempts. The correct number was " + randomInt);
            }

            System.out.println("Your attempts to find the number: " + attempts);
            System.out.println("Your current score: " + totalScore);

            System.out.println("Do you want to play again? (yes/no)");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing! Your final score is: " + totalScore);
        scanner.close();
    }
}
