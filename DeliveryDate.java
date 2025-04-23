import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DeliveryDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the order month: ");
        int month = scanner.nextInt();
        System.out.print("Enter the order day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the order year: ");
        int year = scanner.nextInt();

        LocalDate orderDate = LocalDate.of(year, month, day);
        
        LocalDate deliveryDate = orderDate.plusMonths(1);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        
        System.out.println("Order Date: " + orderDate.format(formatter));
        System.out.println("Delivery Date: " + deliveryDate.format(formatter));
    }
}

