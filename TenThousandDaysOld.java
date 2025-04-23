import java.time.LocalDate;
import java.util.Scanner;

public class TenThousandDaysOld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year (YYYY): ");
        int year = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);

        LocalDate tenThousandDaysOldDate = birthDate.plusDays(10000);

        System.out.println("You will be (or became) 10,000 days old on: " + tenThousandDaysOldDate);

    }
}
