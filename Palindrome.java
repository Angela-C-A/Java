import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phrase:");
        String phrase = sc.nextLine();

        String cleanedPhrase = phrase.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedPhrase = new StringBuilder(cleanedPhrase).reverse().toString();

        if (cleanedPhrase.equals(reversedPhrase)) {
            System.out.println("The phrase is a palindrome.");
        } else {
            System.out.println("The phrase is not a palindrome.");
        }

	}

}














