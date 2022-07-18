/*
* poorly written code to test and learn the printf formatting for nice tables in output. 
* safely ignore this file.
*/

package assignment;

import java.text.DecimalFormat;

public class testprogram {
    static DecimalFormat df = new DecimalFormat("#.00");
    public static void main(String[] args) {
        
        char choice = 'D';

        switch (choice) {
            case 'A' -> System.out.println("Apple Pie");
            case 'B' -> System.out.println("Blueberry Pudding");
            case 'C', 'D' -> System.out.println("Milk Tea");
            default -> System.out.println("Invalid Choice");
        }

    }
}
