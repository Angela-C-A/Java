import java.util.Scanner;

public class Apartment {
    private String apartmentNumber;
    private int numberOfBedrooms;
    private int numberOfBaths;
    private double rentAmount;

    public Apartment(String apartmentNumber, int numberOfBedrooms, int numberOfBaths, double rentAmount) {
        this.apartmentNumber = apartmentNumber;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBaths = numberOfBaths;
        this.rentAmount = rentAmount;
    }
    public String getApartmentNumber() {
        return apartmentNumber;
    }
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }
    public int getNumberOfBaths() {
        return numberOfBaths;
    }
    public double getRentAmount() {
        return rentAmount;
    }
    public void displayInfo() {
        System.out.println("Apartment Number: " + apartmentNumber);
        System.out.println("Bedrooms: " + numberOfBedrooms);
        System.out.println("Bathrooms: " + numberOfBaths);
        System.out.println("Rent Amount: $" + rentAmount);
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        Apartment[] apartments = new Apartment[5];
        apartments[0] = new Apartment("101", 2, 1, 1100.00);
        apartments[1] = new Apartment("102", 3, 2, 2000.00);
        apartments[2] = new Apartment("103", 1, 1, 750.00);
        apartments[3] = new Apartment("104", 3, 2, 1200.00);
        apartments[4] = new Apartment("105", 2, 1, 2400.00);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the minimum number of bedrooms required: ");
        int minBedrooms = sc.nextInt();

        System.out.print("Enter the minimum number of baths required: ");
        int minBaths = sc.nextInt();

        System.out.print("Enter the maximum rent you are willing to pay: ");
        double maxRent = sc.nextDouble();

        boolean foundApartment = false;

        for (Apartment apartment : apartments) {
            if (apartment.getNumberOfBedrooms() >= minBedrooms &&
                apartment.getNumberOfBaths() >= minBaths &&
                apartment.getRentAmount() <= maxRent) {
                apartment.displayInfo(); 
                foundApartment = true;
            }
        }
        if (!foundApartment) {
            System.out.println("No apartments are available from requirements given.");
        }
    }
}
