import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] values = new double[15];
        int count = 0;
        double sum = 0;

        while (count < 15) {
            System.out.println("Enter a double value up to 15 (or 99999 to quit):");
            double value = sc.nextDouble();

            if (value == 99999) {
                break;
            }

            values[count] = value;
            sum += value;
            count++;
        }

        if (count == 0) {
            System.out.println("Error: No numbers entered.");
        } else {
            double average = sum / count;
            System.out.println("Number of values entered: " + count);
            System.out.println("Arithmetic average: " + average);

            for (int i = 0; i < count; i++) {
                double distance = values[i] - average;
                System.out.printf("Value: %.2f, Distance from average: %.2f%n", values[i], distance);
            }
        }
    }
}
