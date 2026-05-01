import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess;
        int attempts = 5;

        System.out.println("Guess a number between 1 and 100");

        while(attempts > 0) {
            System.out.print("Enter guess: ");
            guess = sc.nextInt();

            if(guess == number) {
                System.out.println("Correct!");
                break;
            } else if(guess > number) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }

            attempts--;
            System.out.println("Attempts left: " + attempts);
        }

        if(attempts == 0) {
            System.out.println("Game Over! Number was: " + number);
        }
    }
}
