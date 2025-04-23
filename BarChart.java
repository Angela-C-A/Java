import java.util.Scanner;
public class BarChart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 String[] players = {"Ali", "Bob", "Cai", "Dan", "Eli"};

	        int[] points = new int[5];

	        for (int i = 0; i < players.length; i++) {
	            System.out.print("Enter the points earned by " + players[i] + " >> ");
	            points[i] = sc.nextInt();

	        }
	        System.out.println("\nPoint for Game:");

	        for (int i = 0; i < players.length; i++) {
	            System.out.print(players[i] + ": ");
	            for (int j = 0; j < points[i]; j++) {
	                System.out.print("*");
	            }
	            System.out.println(); 
	        }
	    }
	}
