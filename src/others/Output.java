package others;


/* This is a multiline comment.
Anything in between the two highlighted symbols
is ignored by the compiler.
Jonas Chuan
   F1T4 */

   import java.util.Scanner;

public class Output {//beginning of class
    public static void main(String[] args){//beginning of main method
        //output for question 1
        System.out.println("Output 1:");
        System.out.println("Kolej Matrikulasi Kelantan");
        System.out.println("Kementerian Pendidikan Malaysia");
        System.out.println("16810 Selising, Pasir Puteh");
        System.out.println("Kelantan\n");
        
        //output for question 2
        System.out.println("Output 2:");
        System.out.println("Kolej Matrikulasi Kelantan");
        System.out.println("\tKementerian Pendidikan Malaysia");
        System.out.println("\t\t16810 Selising");
        System.out.println("\t\t\tPasir Puteh, Kelantan\n");

        //output for question 3
        System.out.println("Output 3:");
        System.out.println("Good Morning \"Kmkt!\".");
        System.out.println("\tHow are you all?\n");

        //output for question 4
        System.out.println("Output 4:");
        System.out.println("Hi my all\'s friends. \nWelcome to \"Java Programming Lab\".\n");

        //output for question 5
        System.out.println("Output 5:");
        System.out.println("      $$");
        System.out.println("        ");
        System.out.println("    $$$$");  //this is a line comment. anything after the two slashes are ignored by compiler.
        System.out.println("        ");
        System.out.println("  $$$$$$");
        System.out.println("        ");
        System.out.println("$$$$$$$$");
        
        
        
    }//end of main
}//end of class

class arraydemo{
    public static void main(String[] args) {
        System.out.println(-5 + 1/2);
    }
}

class random{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int sum=0;
        while (n<1){
            System.out.println("Enter a positive number: ");
            n = sc.nextInt();
        }
        for (int i=1; i<=n; i+=2){
            sum += i;
        }
        System.out.println("Sum of odd numbers from 1 to n is " + sum);
    }
}
