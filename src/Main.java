import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input your bill: ");
        double bill = s.nextDouble();
        System.out.println("Please input the tip percentage(whole number without percentage sign): ");
        int tipPercent = s.nextInt();1
        System.out.println("Please input the number of people in the party: ");
        int numPeople = s.nextInt();

        double totalTip = Math.round(bill * (tipPercent * 1/100);
        double totalBill = Math.round(bill + totalTip);
        double tipPerPerson = Math.round(totalTip/numPeople);
        double totalPerPerson = Math.round(totalBill/numPeople);

        System.out.println("Total Tip: " + totalTip);
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Total Tip Per Person :  " + tipPerPerson);
        System.out.println("Total Total Per Person:  " + totalPerPerson);


    }
}