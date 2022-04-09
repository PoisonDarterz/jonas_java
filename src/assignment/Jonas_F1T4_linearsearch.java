/*
* Jonas Chuan
* F1T4
* MS2124135412
* Assignment SC025
*/

package assignment;
import java.util.Scanner;
import java.text.DecimalFormat;

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

            //determine max and min rows
            double maxTemp=celsius[0],minTemp=celsius[0];
            String maxID=stationID[0],maxName=stationName[0],minID=stationID[0],minName=stationName[0];
            int maxIndex=0,minIndex=-1;
            for(int m = 0; m<5; m++){
                if(celsius[m] > maxTemp){
                    maxTemp = celsius[m];
                    maxID = stationID[m];
                    maxName = stationName[m];
                    maxIndex = m;
                }
            }
            for(int n = 0; n<5; n++){
                if(celsius[n] < minTemp){
                    minTemp = celsius[n];
                    minID = stationID[n];
                    minName = stationName[n];
                    minIndex = n;
                }
            }

        //final report, and search
        obj.tempReport(maxTemp,minTemp,maxID,minID,maxIndex,minIndex,maxName,minName,dfavg);
        obj.search(stationID,stationName,celsius);
    } //end main()

    //input methods getID(), getName(), getTemp()
    String[] getID(){
        System.out.println("-------Input of Station ID--------");
        String[] input = new String[5];
            for(int i=0; i<5; i++){
                System.out.print("Enter station ID " + (i+1) + ": ");
                input[i] = sc.nextLine();
            }
        return input;
    }

    String[] getName(String[] sID){
        System.out.println("\n-------Input of Station Name-------");
        String[] input = new String[5];
            for(int i=0; i<5; i++){
                System.out.print("Enter station name for " + sID[i] + ": ");
                input[i] = sc.nextLine();
            }
        return input;
    }

    double[] getTemp(String[] sName){
        System.out.println("\n-----Input of Temperature in Fahrenheit-----");
        double[] input = new double[5];
            for(int i=0; i<5; i++){
                System.out.print("Enter temperature of " + sName[i] + ": ");
                input[i] = sc.nextDouble();
            }
        return input;
    }

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
    }

    void tempReport(double maxTemp, double minTemp, String maxID, String minID,
                    int maxIndex, int minIndex, String maxName, String minName, String dfavg)
    {
        //formatting decimal places
        String dfmax = df.format(maxTemp);
        String dfmin = df.format(minTemp);
        //outputs
        System.out.println("\n---------------Temperature Report------------------");
        System.out.println("Average temperature is: " + dfavg + " Celsius.");
        System.out.println("Type   \t" + "    Index     ID        Name        Temperature");
        System.out.println("Maximum: \t" + maxIndex + "\t" + maxID + "\t" + maxName + "\t" + dfmax + " Celsius.");
        System.out.println("Minimum: \t" + minIndex + "\t" + minID + "\t" + minName + "\t" + dfmin + " Celsius.");
    } //end tempReport()

    void search(String[] stationID, String[] stationName, double[] celsius){
        System.out.println("\n======= Station ID Search =======");
        String yesno="";
        String target;
        do{
            do{ //this loop verifies that user wants to search. if "N" is inputted, the program will end immediately.
                System.out.print("Search by station ID? (Y/N): ");
                yesno = sc.next();
                    if (yesno.equals("N")){
                        System.out.println("OK. System will exit now.");
                        System.exit(0);
                    } else if (yesno.equals("Y")){
                        continue;
                    } else {
                        System.out.println("Invalid input!");
                    }
            } while(!(yesno.equals("Y") || yesno.equals("N")));
            //var initialisations
            int tgtIndex;
            String tgtID,tgtName;
            double tgtTemp;
            //search algorithm
            System.out.print("Enter station ID to search: ");
                target = sc.next();
                boolean found = false;
                for(int n =0; n<5; n++){
                    if(stationID[n].equals(target)){
                        tgtTemp = celsius[n];
                        tgtID = stationID[n];
                        tgtName = stationName[n];
                        tgtIndex = n;
                        found = true;
                        String dftgtTemp = df.format(tgtTemp);
                        System.out.println("Target found.");
                        System.out.println("Index  ID        Name        Temperature");
                        System.out.println(tgtIndex + "\t" + tgtID + "\t" + tgtName + "\t" + dftgtTemp + " Celsius.");
                    }
                }
                if(!found){
                    System.out.println("No record found. Please search again.");
                }
        } while(true); //loops back to line 126
    } //end search()
}
