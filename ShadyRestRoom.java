import java.util.Scanner;
public class ShadyRestRoom {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for a queen bed: ");
		System.out.println("Enter 2 for a king bed: ");
		System.out.println("Enter 3 for a suite with a king bed and a pullout couch: ");

	        
	    int roomType = sc.nextInt();
	    int price = 0; 
	        
	    switch (roomType) {
	    	case 1:
	    		price = 125;
	            System.out.println("You selected a queen bed. The price is: $" + price);
	            break;
	        case 2:
	            price = 139;
	            System.out.println("You selected a king bed. The price is: $" + price);
	            break;
	        case 3:
	            price = 139;
	            System.out.println("You selected a suite with a king bed and a pullout couch. The price is: $" + price);
	            break;
	        default:
                System.out.println("You made an invalid selection. The price is set to $0.");
                price = 0;
                break;
	    }
}}