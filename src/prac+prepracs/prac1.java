/*
* Jonas Chuan
* F1T4
* MS2124135412
* Program to display monthly payment and total interest, based on amount, rate and period input.
*/

import java.util.Scanner; //to receive input
import java.text.DecimalFormat; //to format prices to 2 dp

class prac1 {
    public static void main(String[] args) {
        //init libraries
        Scanner jonas = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        //obtain variable inputs
        System.out.println("\n-----------------------KOK LANAS BANK-------------------------");
        System.out.println("***********************Loan Calculator************************");
        System.out.print("Amount of Loan: ");
            int loan = jonas.nextInt();
        System.out.print("Annual Interest Rate (%): ");
            double rate = jonas.nextDouble();
        System.out.print("Loan Period in Years: ");
            int year = jonas.nextInt();

            //calculations and formatting to 2dp
            double interest = loan * (rate/100) * year; //convert percentage to decimal
            double total = loan + interest;
            double monthly = total / (12 * year); //divide by months, so mul by 12
            String inter2dp = df.format(interest);
            String month2dp = df.format(monthly);

        //final output
        System.out.println("\n---------------------Monthly Payment--------------------------");
        System.out.println("             Monthly payment is RM " + month2dp);
        System.out.println("\n------------------Total Amount Interest-----------------------");
        System.out.println("\n          Total interest to pay is " + inter2dp);
        System.out.println("\n**************************************************************\n");
        System.out.println("Program developed by: Jonas Chuan :)");
    }//end main
}//end class
