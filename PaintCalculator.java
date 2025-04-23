import java.util.Scanner;

public class PaintCalculator {
    
    private static double COVERAGE_PER_GALLON = 350.0;
    private static double PAINT_PRICE_PER_GALLON = 32.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the room: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the room: ");
        double width = sc.nextDouble();

        System.out.print("Enter the height of the room: ");
        double height = sc.nextDouble();

        double wallArea = calculateWallArea(length, width, height);

        double gallonsNeeded = calculateGallonsNeeded(wallArea);

        double totalPrice = calculatePrice(gallonsNeeded);

        System.out.printf("Gallons of paint needed: %.2f%n", gallonsNeeded);
        System.out.printf("Total price: $%.2f%n", totalPrice);


    }
	private static double calculatePrice(double gallonsNeeded) {
		return 0;
	}
	private static double calculateGallonsNeeded(double wallArea) {
		return 0;
	}
	private static double calculateWallArea(double length, double width, double height) {
		return 0;
	}
}