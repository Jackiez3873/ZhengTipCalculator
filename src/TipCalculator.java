import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator! ");
        System.out.println("How many people are in your group: ");
        int numOfPeople= scan.nextInt();
        double cost;
        double totalCost = 0;
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double number = scan.nextDouble();
        while (number != -1.0) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextInt();
            totalCost += cost

        }

        // code below the while loop runs after the loop ends
        System.out.print("Done!");

    }
}
