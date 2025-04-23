import java.util.Scanner;
public class InchesToFeet {

	private static final int INCHES_IN_FOOT = 12;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a length in inches: ");
		int inches = sc.nextInt();
		
		int feet = inches / INCHES_IN_FOOT;
	    int remainingInches = inches % INCHES_IN_FOOT;
		
	    System.out.println(inches + " inches is equivalent to " + feet + " feet and " + remainingInches + " inches.");
	    


	}

}
