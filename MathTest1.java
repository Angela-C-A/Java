import java.util.Scanner;

public class MathTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();

        System.out.print("Enter a double: ");
        double userDouble = scanner.nextDouble();

        double squareRoot = Math.sqrt(userInt);
        System.out.println("The square root of " + userInt + " is: " + squareRoot);

        double randomNumber = Math.random() * userInt;
        System.out.println("A random number between 0 and " + userInt + " is: " + randomNumber);

        double floorValue = Math.floor(userDouble);
        double ceilingValue = Math.ceil(userDouble);
        long roundedValue = Math.round(userDouble);
        
        System.out.println("The floor of " + userDouble + " is: " + floorValue);
        System.out.println("The ceiling of " + userDouble + " is: " + ceilingValue);
        System.out.println("The rounded value of " + userDouble + " is: " + roundedValue);

        double largerValue = Math.max(userInt, userDouble);
        double smallerValue = Math.min(userInt, userDouble);
        
        System.out.println("The larger value between " + userInt + " and " + userDouble + " is: " + largerValue);
        System.out.println("The smaller value between " + userInt + " and " + userDouble + " is: " + smallerValue);

    }
}
