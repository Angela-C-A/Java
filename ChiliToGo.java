import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        double ADULT_MEAL_PRICE = 7.00;
        double CHILD_MEAL_PRICE = 4.00;
        double ADULT_MEAL_COST = 4.35;
        double CHILD_MEAL_COST = 3.10;

        System.out.print("Enter the number of adult meals ordered: ");
        int adultMeals = sc.nextInt();

        System.out.print("Enter the number of child meals ordered: ");
        int childMeals = sc.nextInt();

        double totalAdultRevenue = adultMeals * ADULT_MEAL_PRICE;
        double totalChildRevenue = childMeals * CHILD_MEAL_PRICE;

        double totalAdultCost = adultMeals * ADULT_MEAL_COST;
        double totalChildCost = childMeals * CHILD_MEAL_COST;

        double adultProfit = totalAdultRevenue - totalAdultCost;
        double childProfit = totalChildRevenue - totalChildCost;

        double grandTotalProfit = adultProfit + childProfit;

        System.out.printf("Total profit from adult meals: $%.2f%n", adultProfit);
        System.out.printf("Total profit from child meals: $%.2f%n", childProfit);
        System.out.printf("Grand total profit: $%.2f%n", grandTotalProfit);

    }
}