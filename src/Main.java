import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //set variables and ask for user input
        System.out.println("---------------------");
        System.out.print("Please input your bill: ");
        double bill = s.nextDouble();
        System.out.print("Please input the tip percentage(whole number without percentage sign): ");
        double tipPercent = s.nextDouble();
        System.out.print("Please input the number of people in the party: ");
        int numPeople = s.nextInt();
        System.out.println("---------------------");

        //calculate values using variables
        double totalTip = Math.round(bill * (tipPercent/100.0 * 100.0))/100.0;
        double totalBill = Math.round(( bill + totalTip)*100.0)/100.0;
        double tipPerPerson = Math.round(totalTip/numPeople * 100.0)/100.0;
        double totalPerPerson = Math.round(totalBill/numPeople * 100.0)/100.0;

        //display values
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Total Tip: $ " + totalTip);
        System.out.println("Total Bill: $ " + totalBill);
        System.out.println("Total Tip Per Person : $ " + tipPerPerson);
        System.out.println("Total Total Per Person: $ " + totalPerPerson);
        System.out.println("---------------------");

    }
}