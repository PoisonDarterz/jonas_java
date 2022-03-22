/*
* Jonas Chuan
* F1T4
* MS2124135412
* Program to calculate and display sales report.
*/


import java.util.Scanner;
import java.text.DecimalFormat;

class preprac2 {
    public static void main(String[] args) {
        //init libraries
        Scanner jonas = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        //get inputs
        System.out.println("-------------------Hashim Hardware-----------------");
        System.out.print("\nCustomer number: ");
            int cusno = jonas.nextInt();
        System.out.print("Customer Name: ");
            jonas.nextLine(); //to cover the extra line from the enter of nextInt();
            String name = jonas.nextLine();
        System.out.print("Sales Amount: ");
            double amount = jonas.nextDouble();
        System.out.print("Tax code (0 or 1 or 2) :");
            int code = jonas.nextInt();

            //calculation of tax amount, and final amount, and DecimalFormat-ting.
            double tax=0.00;
            double total;

            switch(code){
                case 0:{
                    tax = 0.00;
                    break;
                } case 1:{
                    tax = amount * 0.03;
                    break;
                } case 2:{
                    tax = amount * 0.05;
                    break;
                }
            }
            
            total = amount + tax;
            String dfamount = df.format(amount);
            String dftax = df.format(tax);
            String dftotal = df.format(total);

        //final output
        System.out.println("\n********************Sales Report*******************");
        System.out.println("Customer Number: " + cusno);
        System.out.println("Customer Name: " + name);
        System.out.println("Sales Amount: RM " + dfamount);
        System.out.println("Sales Tax: RM " + dftax);
        System.out.println("Total Amount: RM " + dftotal);
        System.out.println("***************************************************");
        System.out.println("\nThis report is prepared by: Jonas Chuan.");
    }
}
