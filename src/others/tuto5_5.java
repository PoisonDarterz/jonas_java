package others;

import java.util.Scanner;
import java.text.DecimalFormat;

class tuto556while{
    public static void main(String[] args) {
        int i=2;
        while (i<=6){
            System.out.println((i+1));
            i=i+2;
        }
    }
}

class tuto556for{
    public static void main(String[] args) {
        for(int i=2; i<=6; i+=2){
            System.out.println((i+1));
        }
    }
}


/*
a) Factorial of 5 is 1
b) 6
c) 4
*/

//7d:
class tuto557{
    public static void main(String[] args) {
        int number = 5;
        int factorial =1;
        int i=2;
            while(i<=number){
                factorial = factorial * factorial;
            }
        System.out.println("Factorial of 5 is " + factorial);
    }
} 


class tuto558{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double taxincl;
        double sumprice = 0.0;
        double sumincl= 0.0;
        double sumtax = 0.0;
        
        do{
            System.out.print("Enter tax-inclusive price in RM (or -1 to end): ");
            taxincl = sc.nextDouble();
            double price = taxincl / 1.07;
            double tax = price * 0.07;

            String dfprice = df.format(price);
            String dftax = df.format(tax);

                if (taxincl>=0){
                    sumprice = sumprice + price;
                    sumtax = sumtax + tax;
                    sumincl = sumincl + taxincl;
                    System.out.println("Actual price is: RM" + dfprice + ", Sales Tax is: RM" + dftax + "\n");
                }
        } while (taxincl != -1);

        String dfsumprice = df.format(sumprice);
        String dfsumtax = df.format(sumtax);
        String dfsumincl = df.format(sumincl);
        System.out.println("\nTotal price is: " + dfsumincl);
        System.out.println("Total actual price is: " + dfsumprice);
        System.out.println("Total sales tax is: " + dfsumtax);
    }
}