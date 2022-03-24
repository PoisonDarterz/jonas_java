package prac_preprac;
import java.util.Scanner;
import java.text.DecimalFormat;


class Jonas_F1T4preprac {
    public static void main(String[] args) {
        //init libraries
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        //gather data
        System.out.println("---------- GR Tech Sdn Bhd ------------");
    
        System.out.print("Input item: ");
            String item = sc.nextLine();
        System.out.print("Input price of item: RM");
            double price = sc.nextDouble();
        System.out.print("Input quantity: ");
            int qty = sc.nextInt();

                //calculations
                double total = price * qty;
                double discount = total * 0.1;
                double net = total - discount;
                double charity = net * 0.03;
                //format to 2 d.p.
                String ttl = df.format(total);
                String dsc = df.format(discount);
                String netf = df.format(net);
                String chrt = df.format(charity);

        //final output
        System.out.println("---------- GR Tech Sdn Bhd ------------");
        System.out.println("Total payment for " + item + " is RM" + ttl);
        System.out.println("Discount for " + item + " is RM" + dsc);
        System.out.println("Net payment for " + item + " is RM" + netf);
        System.out.println("Donating to charities is RM" + chrt);
        System.out.println("---------- End of Receipt -------------");

    }
}

