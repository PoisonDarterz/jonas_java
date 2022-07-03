/*
* poorly written code to test and learn the printf formatting for nice tables in output. 
* safely ignore this file.
*/

package assignment;

import java.text.DecimalFormat;

public class testprogram {
    static DecimalFormat df = new DecimalFormat("#.00");
    public static void main(String[] args) {
        
        String[] stationID = {"aaaa" ,"bbbb", "cccc", "dddd", "eeee"};
        String[] stationName = {"qwertyuiop", "asdfghjkl", "zxcvbnm,.", "1234567890", "!@#$%^&*()"};
        double[] fahrenheit = {78,90,45,90,45};
        double[] celsius = new double[5];
        String[] dfcels = new String[5];

        for(int i=0; i<5; i++){
            celsius[i] = (fahrenheit[i] - 32) * 5 / 9;
            dfcels[i] = df.format(celsius[i]);
        }

        System.out.println("\n----------------Input Summary---------------------");
        // System.out.println("ID\t| Name\t|  Temperature (C)");
        System.out.printf("%-10s %-18s %-5s\n", "ID", "Name", "Temperature (C)");

        for(int i=0; i<5; i++){
            System.out.printf("%-10s %-18s %-5s\n", stationID[i], stationName[i], dfcels[i]);
            // System.out.println(stationID[i] + "\t|" + stationName[i] + "\t|" + dfcels[i]);
        }


    }
}
