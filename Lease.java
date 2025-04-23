import java.util.Scanner;

public class Lease {

    private String tenantName;
    private int apartmentNumber;
    private double monthlyRent;
    private int leaseTerm;

    public Lease() {
        this.tenantName = "XXX";
        this.apartmentNumber = 0;
        this.monthlyRent = 1000.0;
        this.leaseTerm = 12;
    }
    public String getTenantName() {
        return tenantName;
    }
    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }
    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
    public double getMonthlyRent() {
        return monthlyRent;
    }
    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }
    public int getLeaseTerm() {
        return leaseTerm;
    }
    public void setLeaseTerm(int leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    public void addPetFee() {
        this.monthlyRent += 10.0;
        explainPetPolicy(); 
    }

    public static void explainPetPolicy() {
        System.out.println("There is a $10 monthly charge for each pet due to the Pet Policy.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Lease lease = new Lease();
        
        System.out.print("Enter tenant's name: ");
        String name = scanner.nextLine();
        lease.setTenantName(name);
        
        System.out.print("Enter apartment number: ");
        int apartmentNum = scanner.nextInt();
        lease.setApartmentNumber(apartmentNum);
        
        System.out.print("Do you have a pet? (Yes/No): ");
        String hasPet = scanner.next();
        
        if (hasPet.equalsIgnoreCase("yes")) {
            lease.addPetFee(); 
        }
        
        System.out.println("\nLease Details:");
        System.out.println("Tenant Name: " + lease.getTenantName());
        System.out.println("Apartment Number: " + lease.getApartmentNumber());
        System.out.println("Monthly Rent: $" + lease.getMonthlyRent());
        System.out.println("Lease Term: " + lease.getLeaseTerm() + " months");
    }
}
