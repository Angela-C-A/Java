import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name:");
        String name1 = sc.nextLine();

        System.out.println("Enter the second name:");
        String name2 = sc.nextLine();

        System.out.println("Enter the third name:");
        String name3 = sc.nextLine();

        System.out.println("Here are the possible two-name combinations:");
        System.out.println(name1 + " " + name3);
        System.out.println(name1 + " " + name2);
        System.out.println(name2 + " " + name1);
        System.out.println(name2 + " " + name3);
        System.out.println(name3 + " " + name2);
        System.out.println(name3 + " " + name1);
    }
}
