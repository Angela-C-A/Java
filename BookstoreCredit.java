import java.util.Scanner;
public class BookstoreCredit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the student's name: ");
        String studentName = sc.nextLine();
        
        System.out.print("Enter the student's GPA: ");
        double gpa = sc.nextDouble();
        
        displayCreditInfo(studentName, gpa);

	}
	public static void displayCreditInfo(String name, double gpa) {
		double credit = gpa * 10;
		System.out.println(name+ ", your GPA is "+gpa+", so your credit is $"+ credit +".");
	}

}
