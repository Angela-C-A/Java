import java.util.Scanner;

public class TriangleWithLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single digit: ");
        int digit = sc.nextInt();

        int rows = 7;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(digit);
            }
            System.out.println();
        }
    }
}
