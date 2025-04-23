import java.time.LocalDate;
import java.util.Scanner;

public class TestFitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the fitness activity: ");
        String activity = scanner.nextLine();

        System.out.print("Enter the number of minutes spent participating: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter the date (YYYY-MM-DD): ");
        String dateString = scanner.next();
        LocalDate date = LocalDate.parse(dateString); 

        FitnessTracker userTracker = new FitnessTracker(activity, minutes, date);

        FitnessTracker defaultTracker = new FitnessTracker();

        System.out.println("\nUser Fitness Tracker:");
        System.out.println(userTracker.toString());

        System.out.println("\nDefault Fitness Tracker:");
        System.out.println(defaultTracker.toString());
    }
}


