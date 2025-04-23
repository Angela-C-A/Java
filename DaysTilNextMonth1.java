import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DaysTilNextMonth1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Enter the year (YYYY): ");
        int year = scanner.nextInt();

        LocalDate currentDate = LocalDate.of(year, month, day);

        LocalDate firstOfNextMonth = currentDate.withDayOfMonth(1).plusMonths(1);
        
        long daysUntilNextMonth = currentDate.until(firstOfNextMonth).getDays();

        System.out.println("There are " + daysUntilNextMonth + " days until " + 
                           firstOfNextMonth.getMonth().toString() + " starts.");

    }
}
