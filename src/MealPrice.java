import java.util.Scanner;

/**
 * Created by smita on 3/31/17.
 *
 * Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip),
 * and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
 */

public class MealPrice {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter meal cost: ");
        double mealCost = scanner.nextDouble();

        System.out.print("Enter tip percent: ");
        int tipPercent = scanner.nextInt();

        System.out.print("Enter tax percent: ");
        int taxPercent = scanner.nextInt();
    }
}
