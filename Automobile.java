import java.util.Scanner;

public class Automobile {
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;
    private double milesPerGallon;

    public Automobile(int id, String make, String model, String color, int year, double milesPerGallon) {
        setId(id);
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setMilesPerGallon(milesPerGallon);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if (id < 0 || id > 9999) {
            this.id = 0; 
        } else {
            this.id = id;
        }
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year < 2005 || year > 2024) {
            this.year = 0; 
        } else {
            this.year = year;
        }
    }
    public double getMilesPerGallon() {
        return milesPerGallon;
    }
    public void setMilesPerGallon(double milesPerGallon) {
        if (milesPerGallon < 10 || milesPerGallon > 60) {
            this.milesPerGallon = 0;
        } else {
            this.milesPerGallon = milesPerGallon;
        }
    }
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Miles per gallon: " + milesPerGallon);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter information for the first automobile:");

        System.out.print("Enter the ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter the make: ");
        String make1 = sc.nextLine();
        System.out.print("Enter the model: ");
        String model1 = sc.nextLine();
        System.out.print("Enter the color: ");
        String color1 = sc.nextLine();
        System.out.print("Enter the year: ");
        int year1 = sc.nextInt();
        System.out.print("Enter the miles per gallon: ");
        double mpg1 = sc.nextDouble();
        sc.nextLine();  

        Automobile auto1 = new Automobile(id1, make1, model1, color1, year1, mpg1);

        System.out.println("\nEnter information for the second automobile:");

        System.out.print("Enter the ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter the make: ");
        String make2 = sc.nextLine();
        System.out.print("Enter the model: ");
        String model2 = sc.nextLine();
        System.out.print("Enter the color: ");
        String color2 = sc.nextLine();
        System.out.print("Enter the year: ");
        int year2 = sc.nextInt();
        System.out.print("Enter the miles per gallon: ");
        double mpg2 = sc.nextDouble();

        Automobile auto2 = new Automobile(id2, make2, model2, color2, year2, mpg2);

        System.out.println("\nInformation for the first automobile:");
        auto1.displayInfo();

        System.out.println("\nInformation for the second automobile:");
        auto2.displayInfo();
    }
}
