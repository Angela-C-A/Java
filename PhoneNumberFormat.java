import java.util.Scanner;
public class PhoneNumberFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String userInput;

        System.out.println("Enter a 10-digit phone number to format or 999 to quit: ");

        while (true) {
            System.out.print("Enter the phone number: ");
            userInput = sc.nextLine();

            if (userInput.equals("999")) {
                System.out.println("Exiting the program.");
                break;
            }

            if (userInput.length() == 10 && userInput.matches("\\d+")) {
                String formattedPhoneNumber = formatPhoneNumber(userInput);
                System.out.println("Formatted Phone Number: " + formattedPhoneNumber);
            } else {
                System.out.println("Error: You did not enter 10-digits. Please enter 10-digits");
            }
        }
    }
    public static String formatPhoneNumber(String phoneNumber) {
        return "(" + phoneNumber.substring(0, 3) + ") " + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6);
    }
}


