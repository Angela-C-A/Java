import java.util.Scanner; 
public class MinutesConversation {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		
		Scanner sc = new Scanner(System.in);
		int minutes = sc.nextInt();
		
		int hours = minutes/60;
		double days = (double) minutes/(60*24);
		
		System.out.println("Hours: " + hours + " and " + days + " days");
		
		

	}

}
