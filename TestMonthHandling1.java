import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestMonthHandling1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String firstDateInput = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String secondDateInput = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        System.out.println("\nFirst Date: " + firstDate);
        System.out.println("After adding 1 month: " + firstDate.plusMonths(1));
        System.out.println("After adding 2 months: " + firstDate.plusMonths(2));
        System.out.println("After adding 3 months: " + firstDate.plusMonths(3));

        System.out.println("\nSecond Date: " + secondDate);
        System.out.println("After adding 1 month: " + secondDate.plusMonths(1));
        System.out.println("After adding 2 months: " + secondDate.plusMonths(2));
        System.out.println("After adding 3 months: " + secondDate.plusMonths(3));

    }
}

