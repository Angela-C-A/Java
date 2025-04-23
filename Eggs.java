import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of eggs: ");
		
		int eggs = sc.nextInt();
		int dozens = eggs / 12, ind = eggs - (dozens*12);
		
		System.out.println("You ordered " + eggs + " eggs. That's " + dozens + 
				" at $3.25 per dozen and " + ind + " loose eggs at 45 cents each for a total of $" + 
				((dozens * 3.25) + (ind * 0.45))+".");

	}

}
