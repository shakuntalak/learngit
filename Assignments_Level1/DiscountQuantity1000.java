package Assignments_Level1;

import java.util.Scanner;

public class DiscountQuantity1000 {
    //A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
    // Ask user for quantitySuppose,
    // one unit will cost 100.Judge and print total cost for user.

    public static void main(String[] args) {
        int quantity=0;
        double amount=0,tot_amount=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of units purchased :");
        quantity=s.nextInt();
        System.out.println("Enter the cost/price of one unit: ");
        amount=s.nextDouble();
        tot_amount=quantity*amount;
        if(tot_amount>=1000) {
            tot_amount = tot_amount + tot_amount * .1;
            System.out.println("Total AMount to be paid: " + tot_amount);
        }
        else
            System.out.println("Total AMount to be paid: " + tot_amount);

    }
}
