import java.util.Scanner;
public class ValidatePassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		
		while(!isValid) {
			System.out.println("Enter a password: ");
			String password = sc.nextLine();
			
			int upperCount = 0;
			int lowerCount = 0;
			int digitCount = 0;
			
			for(int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);
				if (Character.isUpperCase(ch)) {
					upperCount++;
				} else if (Character.isLowerCase(ch)) {
                    lowerCount++;
                } else if (Character.isDigit(ch)) {
                    digitCount++;
                }
			}
			if (upperCount < 2) {
                System.out.println("Password is not valid; must contain at least two uppercase letters.");
            } 
			else if (lowerCount < 3) {
                System.out.println("Password is not valid; must contain at least three lowercase letters.");
            } 
			else if (digitCount < 1) {
                System.out.println("Password is not valid; must contain at least one digit.");
            } 
			else {
                isValid = true;
                System.out.println("Password is valid.");
		}
	}
}
}
