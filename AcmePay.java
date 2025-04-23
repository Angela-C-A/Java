import java.util.Scanner;

public class AcmePay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        final double FIRST_SHIFT_RATE = 17.00;
        final double SECOND_SHIFT_RATE = 18.50;
        final double THIRD_SHIFT_RATE = 22.00;
        final double OVERTIME_RATE_MULTIPLIER = 1.5;
        final int REGULAR_HOURS = 40;

        System.out.print("Enter the number of hours worked you worked: ");
        double hoursWorked = sc.nextDouble();

        System.out.print("Enter the shift number that you worked (1, 2, or 3): ");
        int shiftNumber = sc.nextInt();

        double hourlyRate = 0;
      
        switch (shiftNumber) {
            case 1:
                hourlyRate = FIRST_SHIFT_RATE;
                break;
            case 2:
                hourlyRate = SECOND_SHIFT_RATE;
                break;
            case 3:
                hourlyRate = THIRD_SHIFT_RATE;
                break; 
        }

        double regularPay;
        double overtimePay = 0;

        if (hoursWorked > REGULAR_HOURS) {
            regularPay = REGULAR_HOURS * hourlyRate;
            overtimePay = (hoursWorked - REGULAR_HOURS) * hourlyRate * OVERTIME_RATE_MULTIPLIER;
        } else {
            regularPay = hoursWorked * hourlyRate;
        }

        double totalPay = regularPay + overtimePay;

        System.out.printf("Total pay: ", totalPay);

    }
}

