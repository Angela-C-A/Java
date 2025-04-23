import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double mexicoPopulation = 128_000_000; 
        double usPopulation = 323_000_000; 

        System.out.print("Enter an annual population increase for Mexico: ");
        double mexicoGrowthRate = sc.nextDouble();

        System.out.print("Enter an annual population decrease for the U.S.: ");
        double usDeclineRate = sc.nextDouble();

        int years = 0;

        while (mexicoPopulation <= usPopulation) {
            mexicoPopulation += mexicoPopulation * mexicoGrowthRate;
            usPopulation -= usPopulation * usDeclineRate;
            years++;
        }
        System.out.printf("It took %d years for Mexico's population to exceed that of the United States.%n", years);
        System.out.printf("Final population of Mexico: %.0f%n", mexicoPopulation);
        System.out.printf("Final population of the United States: %.0f%n", usPopulation);
    }
}

