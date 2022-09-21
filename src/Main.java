import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //set variables and ask for user input
        System.out.println("Please input your bill: ");
        double bill = s.nextDouble();
        System.out.println("Please input the tip percentage(whole number without percentage sign): ");
        double tipPercent = s.nextDouble();
        System.out.println("Please input the number of people in the party: ");
        int numPeople = s.nextInt();

        //calculate values using variables
        double totalTip = Math.round(bill * (tipPercent * 1/100 * 100.0))/100.0;
        double totalBill = Math.round(bill + totalTip);
        double tipPerPerson = Math.round(totalTip/numPeople * 10.0)/10.0;
        double totalPerPerson = Math.round(totalBill/numPeople * 10.0)/10.0;

        //display values
        System.out.println("Total Tip: $ " + totalTip);
        System.out.println("Total Bill: $ " + totalBill);
        System.out.println("Total Tip Per Person : $ " + tipPerPerson);
        System.out.println("Total Total Per Person: $ " + totalPerPerson);


    }
}