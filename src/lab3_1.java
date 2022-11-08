/* 
Jonas Chuan
F1T4

Classes are name according to the format:
qNS_Q, where
N = topic
S = Subtopic
Q = Question number
*/

import java.text.DecimalFormat;
import java.util.Scanner;

class q31_1{
    public static void main(String[] args) {
        System.out.println("Hello Matriculation");
    }
}



class q31_2{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner input = new Scanner(System.in);

            System.out.println("Enter price:");
            double price = input.nextDouble();
            System.out.println("Enter discount rate in percent:");
            double rate = input.nextDouble();

            double fprice = price * ((100-rate)/100);
            String x = df.format(fprice);

        System.out.println("The price after discount is RM" + x);
    }
}




class q31_3{
    static Scanner input = new Scanner(System.in); //so that scanner is accessible from all functions
    public static void main(String[] args) {

        double height = height();
        double width = width();
        double length = length();

            double vol = height * width * length;
            System.out.println("The volume is: " + vol);
    } //end main

        //functions to get height, width, length
        static double height(){
            System.out.println("Enter height: ");
            return input.nextDouble();
        }
    
        static double width(){
            System.out.println("Enter width: ");
            return input.nextDouble();
        }
    
        static double length(){
            System.out.println("Enter length: ");
            return input.nextDouble();
        }
        // end functions
} //end class



class q31_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter total number of umbrellas you want to buy:");
            int num = input.nextInt();

            double price = num * 3;
            System.out.println("The total price is RM" + price);
    }
}



class q31_5 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");
        Scanner input = new Scanner(System.in); //initialise scanner

        //obtain data needed to calculate payment
        System.out.println("Enter rate in decimal:");
        double percent = input.nextDouble();
        double rate = percent /100;

        System.out.println("Enter term in years:");
        double term = input.nextDouble();

        System.out.println("Enter amount of loan:");
        double amount = input.nextDouble();

            //calculate and display payment
            double payment = ((rate * (1 + rate)* term)/((1+rate)*term -1)) * amount;
            String x = df.format(payment);
            System.out.println("Total payment due: " + x);
        
    }
}



class q31_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pi = 3.1416;

        System.out.println("Enter radius of circle:");
        double r = input.nextDouble();

            double a = pi * r * r;

        System.out.println("The area of circle is: " + a);
    }
}