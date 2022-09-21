//used to obtain user input
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //used to obtain user input
        Scanner s = new Scanner(System.in);

        //used for formatting
        System.out.println("---------------------");

        //asking for user input to set variables
        System.out.print("Please input your bill: ");
        double bill = s.nextDouble();
        System.out.print("Please input the tip percentage(whole number without percentage sign): ");
        double tipPercent = s.nextDouble();
        System.out.print("Please input the number of people in the party: ");
        int numPeople = s.nextInt();

        System.out.println("---------------------");

        //calculate values
        //Math.round(x*100.0)/100.0 rounds the value(x) to the nearest hundredth place
        double totalTip = Math.round(bill * (tipPercent/100.00 * 100.00))/100.00;
        double totalBill = Math.round(( bill + totalTip)*100.00)/100.00;
        double tipPerPerson = Math.round(totalTip/numPeople * 100.00)/100.00;
        double totalPerPerson = Math.round(totalBill/numPeople * 100.00)/100.00;

        //display values
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Total Tip: $" + totalTip);
        System.out.println("Total Bill: $" + totalBill);
        System.out.println("Total Tip Per Person: $" + tipPerPerson);
        System.out.println("Total Total Per Person: $" + totalPerPerson);
        System.out.println("---------------------");

    }
}