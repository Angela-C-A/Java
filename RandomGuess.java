import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; 
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Guess a number between 1 and 10: ");
        
        int playerGuess = sc.nextInt();
 
        if (playerGuess == randomNumber) {
            System.out.println("You've guessed the correct number.");
        } else if (playerGuess < randomNumber) {
            System.out.println("You guessed too low the correct number was " + randomNumber + ".");
        } else {
            System.out.println("You guessed too high the correct number was " + randomNumber + ".");
        }
     
    }
}
