import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator! ");
        System.out.println("How many people are in your group: ");
        int numOfPeople= scan.nextInt();
        System.out.println("What's the tip percentage? (0-100, Whole Number):");
        int tipPercentage = scan.nextInt();
        double totalCost = 0;
        double cost = 0;
        //list
        List <String> foodList = new ArrayList<>();
        // while loop
        while (cost != -1.0) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 or -1.0 to end): ");
            cost = scan.nextDouble();
            if (cost == -1.0) {
                break;
                // stops loop before -1 is added or another item is asked for
            }
            totalCost += cost;
            scan.nextLine();
            System.out.print("Enter the item: ");
            String add = scan.nextLine();
            foodList.add(add); // stores items in list
        }
        //rounding to 2 decimal places
        // variables
        totalCost = Math.round(totalCost * 100 ) / 100.0;
        double tip = totalCost * tipPercentage/100;
        tip = Math.round(tip * 100 ) / 100.0;
        double billAndTip = totalCost + tip;
        billAndTip = Math.round(billAndTip * 100 ) / 100.0;
        double perPersonCostBeforeTip = totalCost / numOfPeople;
        perPersonCostBeforeTip = Math.round(perPersonCostBeforeTip * 100 ) / 100.0;
        double tipPerPerson = tip/ numOfPeople;
        tipPerPerson = Math.round(tipPerPerson * 100 ) / 100.0;
        double costPerPerson = billAndTip / numOfPeople;
        costPerPerson = Math.round(costPerPerson * 100 ) / 100.0;
        //print statements
        System.out.println("-------------------------------- ");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: " + tipPercentage + "%");
        System.out.println("Total tip: $" + tip);
        System.out.println("Total bill with tip: $" + billAndTip);
        System.out.println("Per person cost before tip: $" + perPersonCostBeforeTip);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total cost per person: $" + costPerPerson);
        System.out.println("-------------------------------- ");
        System.out.println("Items ordered: ");
        // print foods in foodList, EC feature
        for(String foods : foodList){
            System.out.println(foods);
        }
        // freestyle feature
        billAndTip *= 100;
        int billAndTipInt = (int)billAndTip;
        int quarters = billAndTipInt / 25;
        int remainder = billAndTipInt % 25;
        int dimes = remainder / 10;
        remainder %= 10;
        int nickels = remainder / 5;
        remainder %= 5;
        int pennies = remainder;
        System.out.println("The least amount of coins you can pay is " + quarters + " quarters " + dimes + " dimes " + nickels + " nickels " + pennies + " pennies.");








    }
}
