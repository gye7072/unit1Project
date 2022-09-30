//used to obtain user input
import java.text.DecimalFormat;
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
        // DecimalFormat rounds the values to the nearest hundredth place
        DecimalFormat df = new DecimalFormat("#.00");
        double totalTip = (bill * (tipPercent/100.00));
        double totalBill = (bill + totalTip);
        double tipPerPerson = (totalTip/numPeople);
        double totalPerPerson = (totalBill/numPeople);



        //display values
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Total Tip: $" + df.format(totalTip));
        System.out.println("Total Bill: $" + df.format(totalBill));
        System.out.println("Total Tip Per Person: $" + df.format(tipPerPerson));
        System.out.println("Total Total Per Person: $" + df.format(totalPerPerson));
        System.out.println("---------------------");

    }
}