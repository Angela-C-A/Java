import java.util.Random;
import java.util.Scanner;

public class RandomGuesses {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int targetNumber = rand.nextInt(10) + 1;
        
        int guess = 0;  
        int attempts = 0; 

        while (guess != targetNumber) {
            System.out.print("Guess a number between 1 and 10: ");
            guess = sc.nextInt();
            attempts++; 

            if (guess < targetNumber) {
                System.out.println("The number is too low try again.");
            } else if (guess > targetNumber) {
                System.out.println("The number is too high try again.");
            }
        }
        System.out.println("That is the correct number.");
        System.out.println("It took you " + attempts + " attempts to guess the correct number.");
    }
}
