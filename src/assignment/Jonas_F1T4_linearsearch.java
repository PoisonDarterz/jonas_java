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

class jonas {
    //declare static objects to be able to use in all methods
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");
    public static void main(String[] args) {
        jonas obj = new jonas(); //class object
        //initialisation of arrays required
        String[] stationID = new String[5];
        String[] stationName = new String[5];
        double[] fahrenheit = new double[5];
        double[] celsius = new double[5];
        //obtain inputs via methods, and conversion of F to C temperatures
        stationID = obj.getID();
        stationName = obj.getName(stationID);
        fahrenheit = obj.getTemp(stationName);
        celsius = obj.getCelsius(fahrenheit);
        //calculate average
        double average = obj.getAvg(celsius);
        String dfavg = df.format(average);
            /*determine max and min rows.
            * System will determine the max and min temperatures first,
            * then search for all stations with that max/min temps.
            */
            double maxTemp = celsius[0];
            double minTemp = celsius[0];
            ArrayList<String> maxName = new ArrayList<String>();
            ArrayList<String> minName = new ArrayList<String>();
            ArrayList<String> maxID = new ArrayList<String>();
            ArrayList<String> minID = new ArrayList<String>();
            ArrayList<Integer> maxIndex = new ArrayList<Integer>();
            ArrayList<Integer> minIndex = new ArrayList<Integer>();
            for(int m = 0; m<5; m++){
                if(celsius[m] > maxTemp){
                    maxTemp = celsius[m];
                }
                if(celsius[m] < minTemp){
                    minTemp = celsius[m];
                }
            }
            for(int n = 0; n<5; n++){
                if(celsius[n] == maxTemp){
                    maxID.add(stationID[n]);
                    maxName.add(stationName[n]);
                    maxIndex.add(n);
                }
                if(celsius[n] == minTemp){
                    minID.add(stationID[n]);
                    minName.add(stationName[n]);
                    minIndex.add(n);
                }
            }
        //final report, and search
        obj.fullReport(stationID,stationName,celsius);
        obj.tempReport(maxTemp,minTemp,maxID,minID,maxIndex,minIndex,maxName,minName,dfavg);
        obj.search(stationID,stationName,fahrenheit,celsius);
    } //end main()

    /*input methods getID(), getName(), getTemp()
    * Generally, it contains: 
    * Array Declaration > Header > Input Loop > Return statement.
    */
    String[] getID(){
        String[] input = new String[5];
        System.out.println("-------Input of Station ID--------");
            for(int i=0; i<5; i++){
                System.out.print("Enter station ID " + (i+1) + ": ");
                input[i] = sc.nextLine();
            }
        return input;
    }

    String[] getName(String[] sID){
        String[] input = new String[5];
        System.out.println("\n-------Input of Station Name-------");
            for(int i=0; i<5; i++){
                System.out.print("Enter station name for " + sID[i] + ": ");
                input[i] = sc.nextLine();
            }
        return input;
    }

    double[] getTemp(String[] sName){
        double[] input = new double[5];
        System.out.println("\n-----Input of Temperature in Fahrenheit-----");
            for(int i=0; i<5; i++){
                System.out.print("Enter temperature of " + sName[i] + ": ");
                input[i] = sc.nextDouble();
            }
        return input;
    } //end of input methods

    //calculation method getCelsius(), getAvg()
    double[] getCelsius(double[] frh){
        double[] cels = new double[5];
            for(int i=0; i<5; i++){
                cels[i] = (frh[i] - 32) * 5 / 9;
            }
        return cels;
    }

    double getAvg(double[] cels) {
        double avg,sum=0;
            for(int i=0; i<5; i++){
                sum = sum + cels[i];
            }
        avg = sum / 5;
        return avg;
    } //end of calculation methods

    //Report method
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
} // end class