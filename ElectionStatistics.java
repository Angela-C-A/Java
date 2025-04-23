import java.util.Scanner;
public class ElectionStatistics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the first political party: ");
        String party1 = sc.next();
        System.out.print("Enter the name of the second political party: ");
        String party2 = sc.next();
        System.out.print("Enter the name of the third political party: ");
        String party3 = sc.next();
        
        System.out.print("Enter the number of votes for " + party1 + ": ");
        int votes1 = sc.nextInt();
        System.out.print("Enter the number of votes for " + party2 + ": ");
        int votes2 = sc.nextInt();
        System.out.print("Enter the number of votes for " + party3 + ": ");
        int votes3 = sc.nextInt();

        int totalVotes = votes1 + votes2 + votes3;

        double percentage1 = (double) votes1 / totalVotes * 100;
        double percentage2 = (double) votes2 / totalVotes * 100;
        double percentage3 = (double) votes3 / totalVotes * 100;

        System.out.println(party1 + " received " + percentage1 + "% of the votes");
        System.out.println(party2 + " received " + percentage2 + "% of the votes");
        System.out.println(party3 + " received " + percentage3 + "% of the votes");


	}

}
