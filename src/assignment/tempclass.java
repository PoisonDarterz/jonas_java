/*
* Jonas Chuan
* F1T4
* MS2124135412
* Assignment SC025
*/

package assignment;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

class Station {
    // obj and vars
    static Scanner sc = new Scanner(System.in);
    String[] sName = new String[5];
    String[] sID = new String[5];

    public Station(){ // constructor method
        for(int i = 0; i<5; i++){
            System.out.println("Enter station ID: ");
            sID[i] = sc.nextLine();
        }
        for(int i = 0; i<5; i++){
            System.out.println("Enter station Name: ");
            sName[i] = sc.nextLine();
        }
    }
}

class Temperature {
    // obj and vars
    static Scanner sc = new Scanner(System.in);
    double[] celsius = new double[5];
    double[] fahrenheit = new double[5];
    double avg;

    public Temperature(){ // constructor method
        double sum = 0.0;
        for(int i = 0; i<5; i++){
            System.out.println("Enter temperature in Fahrenheit: ");
            fahrenheit[i] = sc.nextDouble();
            celsius[i] = (fahrenheit[i] - 32) * 5 / 9;
            sum = sum + celsius[i];
        }
        avg = sum / 5;
    }
}

public class tempclass {
    // declare static objects to be able to use in all methods
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");
    static tempclass obj = new tempclass();

    void fullReport(String[] sID, String[] sName, double[] cels){
        String[] dfcels = new String[5];
        for(int j=0; j<5; j++){
            dfcels[j] = df.format(cels[j]); //format celsius to 2 d.p.
        }
        System.out.println("\n----------------Input Summary---------------------");
        //printf is used so table is padded and columns are aligned
        System.out.printf("%-10s %-18s %-5s\n", "ID", "Name", "Temperature (C)"); 
        for(int i=0; i<5; i++){
            System.out.printf("%-10s %-18s %-5s\n", sID[i], sName[i], dfcels[i]);
        }
    }

    void tempReport(double maxTemp, double minTemp, ArrayList<String> maxID, ArrayList<String> minID,
                    ArrayList<Integer> maxIndex, ArrayList<Integer> minIndex, ArrayList<String> maxName,
                    ArrayList<String> minName, String dfavg)
    {
        //formatting decimal places
        String dfmax = df.format(maxTemp);
        String dfmin = df.format(minTemp);
        //outputs
        System.out.println("\n---------------Temperature Report------------------");
        System.out.println("Average temperature is: " + dfavg + " Celsius.");

        System.out.println("\nStations with maximum temperatures: ");
        System.out.printf("%-7s %-10s %-18s %-5s\n", "Index", "ID", "Name", "Celsius");
        for(int i=0; i<maxID.size(); i++){
            System.out.printf("%-7d %-10s %-18s %-5s\n", maxIndex.get(i), maxID.get(i),  maxName.get(i), dfmax);
        }
        System.out.println("\nStations with minimum temperatures: ");
        System.out.printf("%-7s %-10s %-18s %-5s\n", "Index", "ID", "Name", "Celsius");
        for(int j=0; j<minID.size(); j++){
            System.out.printf("%-7d %-10s %-18s %-5s\n", minIndex.get(j), minID.get(j),  minName.get(j), dfmin);
        }
    } //end tempReport()

    void search(String[] stationID, String[] stationName, double[] fahrenheit, double[] celsius){
        System.out.println("\n======= Station ID Search =======");
        String yesno="";
        String target;
        do{
            do{ //this loop verifies that user wants to search. if "N" is inputted, the program will end immediately.
                System.out.print("\nSearch by station ID? (Y/N): ");
                yesno = sc.next();
                    if (yesno.equals("N")){
                        System.out.println("OK. System will exit now.");
                        System.out.println("All temperatures processed.");
                        System.exit(0);
                    } else if (yesno.equals("Y")){
                        continue;
                    } else {
                        System.out.println("Invalid input! Please input \"Y\" or \"N\" only.");
                    }
            } while(!(yesno.equals("Y") || yesno.equals("N")));
            //var initialisations
            int tgtIndex;
            String tgtID,tgtName;
            double tgtCels, tgtFahr;
            //search algorithm
            System.out.print("Enter station ID to search: ");
                target = sc.next();
                boolean found = false;
                for(int n =0; n<5; n++){
                    if(stationID[n].equals(target)){
                        tgtCels = celsius[n];
                        tgtFahr = fahrenheit[n];
                        tgtID = stationID[n];
                        tgtName = stationName[n];
                        tgtIndex = n;
                        found = true;
                        String dftgtCels = df.format(tgtCels);
                        String dftgtFahr = df.format(tgtFahr);
                        System.out.println("Target found. Displaying.....");
                        System.out.printf("%-7s %-10s %-18s %-10s %-10s\n", "Index", "ID", "Name", "Fahrenheit" ,"Celsius");
                        System.out.printf("%-7d %-10s %-18s %-10s %-10s\n", tgtIndex, tgtID, tgtName, dftgtFahr , dftgtCels);
                    }
                }
                if(!found){
                    System.out.println("No record for station ID " + target + " found. Please search again.");
                }
            } while(true); //loops back to line 126. 
                           //This is not considered an infinite loop as it contains a program-ending sentinel value "N".
    } //end search()

    public static void main(String[] args) {
        // declare objects
        Station sta = new Station();
        Temperature temp = new Temperature();
        String dfavg = df.format(temp.avg);

        /*determine max and min rows.
        * System will determine the max and min temperatures first,
        * then search for all stations with that max/min temps.
        */
            double maxTemp = temp.celsius[0];
            double minTemp = temp.celsius[0];
            ArrayList<String> maxName = new ArrayList<String>();
            ArrayList<String> minName = new ArrayList<String>();
            ArrayList<String> maxID = new ArrayList<String>();
            ArrayList<String> minID = new ArrayList<String>();
            ArrayList<Integer> maxIndex = new ArrayList<Integer>();
            ArrayList<Integer> minIndex = new ArrayList<Integer>();
            for(int m = 0; m<5; m++){
                if(temp.celsius[m] > maxTemp){
                    maxTemp = temp.celsius[m];
                }
                if(temp.celsius[m] < minTemp){
                    minTemp = temp.celsius[m];
                }
            }
            for(int n = 0; n<5; n++){
                if(temp.celsius[n] == maxTemp){
                    maxID.add(sta.sID[n]);
                    maxName.add(sta.sName[n]);
                    maxIndex.add(n);
                }
                if(temp.celsius[n] == minTemp){
                    minID.add(sta.sID[n]);
                    minName.add(sta.sName[n]);
                    minIndex.add(n);
                }
            }

        //final report, and search
        obj.fullReport(sta.sID,sta.sName,temp.celsius);
        obj.tempReport(maxTemp,minTemp,maxID,minID,maxIndex,minIndex,maxName,minName,dfavg);
        obj.search(sta.sID,sta.sName,temp.fahrenheit,temp.celsius);
    } //end main()
}

