import java.util.Scanner;

public class BirthdayReminder {
    public static void main(String[] args) {
        final int MAX_FRIENDS = 10;
        final String SENTINEL = "ZZZ";

        String[] names = new String[MAX_FRIENDS];
        String[] birthdates = new String[MAX_FRIENDS];
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the names and birthdates of your friends (enter ZZZ to stop): ");
        while (count < MAX_FRIENDS) {
            System.out.print("Enter name #" + (count + 1) + ": ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase(SENTINEL)) {
                break;
            }
            System.out.print("Enter birthdate for " + name + " (MM/DD): ");
            String birthdate = sc.nextLine();
            names[count] = name;
            birthdates[count] = birthdate;
            count++;
        }
        System.out.println("\nYou entered " + count + " friend's.");
        System.out.println("Friend list:");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i]);
        }
        System.out.println("\nType a friend's name to view their birthdate (enter ZZZ to stop): ");
        while (true) {
            System.out.print("Enter a name: ");
            String query = sc.nextLine();

            if (query.equalsIgnoreCase(SENTINEL)) {
                break;
            }
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (names[i].equalsIgnoreCase(query)) {
                    System.out.println("Birthdate of " + names[i] + ": " + birthdates[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Error: Name not found.");
            }
        }
}
}