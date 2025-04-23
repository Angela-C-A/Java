import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int maxElement = Integer.MIN_VALUE;
        System.out.println("Row sums: ");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += array[i][j];
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        System.out.println("Maximum element: " + maxElement);

    }
}
