import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator! ");
        System.out.println("How many people are in your group: ");
        int numOfPeople= scan.nextInt();
        System.out.println("What's the tip percentage? (0-100):");
        double tipPercentage = scan.nextDouble();
        double totalCost = 0;
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost = scan.nextDouble();
        totalCost += cost;
        while (cost != -1.0) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextdouble();
            totalCost += cost;

        }
        double tip = totalCost * tipPercentage/100;
        double billAndTip = totalCost + tip;
        double perPersonCostBeforeTip = totalCost / numOfPeople;
        double tipPerPerson = tip/ numOfPeople;
        double costPerPerson = totalCost / numOfPeople;
        System.out.println("-------------------------------- ");
        System.out.println("Total bill before tip: " + totalCost);
        System.out.println("Total percentage: " + tipPercentage);
        System.out.println("Total tip: " + tip);
        System.out.println("Total bill with tip: " + billAndTip);
        System.out.println("Per person cost before tip: " + perPersonCostBeforeTip);
        System.out.println("Tip per person: " + tipPerPerson);
        System.out.println("Total cost per person: " + costPerPerson);
    }
}
