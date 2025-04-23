import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to find: ");
        String wordToFind = sc.next();

        System.out.print("Enter the word to replace it with: ");
        String replacementWord = sc.next();

        String updatedSentence = sentence.replace(wordToFind, replacementWord);

        System.out.println("Updated sentence: " + updatedSentence);

    }
}

