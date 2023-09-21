import java.util.Scanner()
public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an EVEN integer: ");
        int number = scan.nextInt();

        while (number % 2 != 0) {
            System.out.print("No silly, i said EVEN not odd! Try again: ");
            number = scan.nextInt();
        }

        // code below the while loop runs after the loop ends
        System.out.print("Done!");

    }
}
