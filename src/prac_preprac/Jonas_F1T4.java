package prac_preprac;
/*
* Jonas Chuan
* F1T4
* MS2124135412
* Program that calculates monthly fee based on package number.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

class Jonas_F1T4{
    public static void main(String[] args) {
        //init scanner, decimalformat
        Scanner jonas = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        //obtain inputs
        System.out.println("--------------------Math Online Tuition------------------");
        System.out.print("Student Name: ");
            String name = jonas.nextLine();
        System.out.print("Student ID: ");
            int id = jonas.nextInt();
        System.out.print("Monthly fee: RM ");
            double fee = jonas.nextDouble();

        /*input and verification of package number.
         *user will be asked to re-enter package number 
         *in the event of an invalid input (! 1<=x<=30) 
         *this method would be better than an "else" statement with system.exit(0)
         *as user no need to re-enter everything due to a probable mistake.*/
        int packno = 0;
            do{
            System.out.print("Package Number: ");
                packno = jonas.nextInt();
                    if(packno>30 || packno <=0){
                        System.out.println("Invalid Package Number!");
                    }
            } while (packno>30|| packno <1);

        //calculation of rate, discount and total fee
        double rate=0.0;

            if(packno>=1 && packno<=10){
                rate=0.05;
            } else if (packno<=20){
                rate=0.0;
            } else if (packno<=30){
                rate=0.03;
            }
            
        double discount = fee * rate;
        double total = fee - discount + 10;
        String dffee = df.format(fee);
        String dfdiscount = df.format(discount);
        String dftotal = df.format(total);

        //final output
        System.out.println("**********************Fee Receipt***********************");
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Monthly fee is: RM " + dffee);
        System.out.println("Discount is: RM " + dfdiscount);
        System.out.println("Total fee to be paid is: RM " + dftotal);
        System.out.println("********************************************************");
        System.out.println("\nReceived from: " + name);
    }
}