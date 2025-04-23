import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main ingredient: ");
        String mainIngredient = scanner.nextLine();

        System.out.print("Enter the bread type: ");
        String breadType = scanner.nextLine();

        System.out.print("Enter the price:$ ");
        double price = scanner.nextDouble();

        Sandwich sandwich = new Sandwich(mainIngredient, breadType, price);

        System.out.println("\nSandwich Details:");
        System.out.println(sandwich.toString());
    }
}

