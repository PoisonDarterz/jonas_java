package others;

import java.util.Scanner;
import java.text.DecimalFormat;

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
            
        } while(taxincl != -1);

        String dfsumprice = df.format(sumprice);
        String dfsumtax = df.format(sumtax);
        String dfsumincl = df.format(sumincl);
        System.out.println("\nTotal price is: " + dfsumincl);
        System.out.println("Total actual price is: " + dfsumprice);
        System.out.println("Total sales tax is: " + dfsumtax);
    }
}