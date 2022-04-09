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
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");
    public static void main(String[] args) {
        jonas obj = new jonas();

        String[] stationID = new String[5];
        String[] stationName = new String[5];
        double[] fahrenheit = new double[5];
        double[] celsius = new double[5];

        stationID = obj.getID();
        stationName = obj.getName(stationID);

        fahrenheit = obj.getTemp(stationName);
        celsius = obj.getCelsius(fahrenheit);

        double average = obj.getAvg(celsius);
        String dfavg = df.format(average);

            double maxTemp=celsius[0],minTemp=celsius[0];
            String maxID="",maxName="",minID="",minName="";
            int maxIndex=-1,minIndex=-1;

            for(int m = 0; m<5; m++){
                if(celsius[m] > maxTemp){
                    maxTemp = celsius[m];
                    maxID = stationID[m];
                    maxName = stationName[m];
                    maxIndex = m;
                }
                if(celsius[m] < minTemp){
                    minTemp = celsius[m];
                    minID = stationID[m];
                    minName = stationName[m];
                    minIndex = m;
                }
            }

        obj.tempReport(maxTemp,minTemp,maxID,minID,maxIndex,minIndex,maxName,minName,dfavg);
        
        String yesno;
        String target;
        do{
            System.out.print("Search by station ID? (Y/N): ");
            sc.nextLine();
            yesno = sc.nextLine();
                if (yesno.equals("N")){
                    System.out.println("OK. System will exit now.");
                    System.exit(0);
                } else if (!(yesno.equals("Y"))){
                    System.out.println("Invalid input!");
                } else {
                    continue;
                }
            System.out.print("Enter station ID to search: ");
            target = sc.nextLine();
            int tgtIndex;
            String tgtID,tgtName;
            double tgtTemp;
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
                    System.out.println(tgtIndex + "\t" + tgtID + "\t" + tgtName + "\t" + dftgtTemp);
                }
            }

            if(!found){
                System.out.println("No record found. Please search again.");
            }
        } while(yesno.equals("Y"));
    }

    String[] getID(){
        String[] input = new String[5];
        for(int i=0; i<5; i++){
            System.out.print("Enter station ID " + (i+1) + ": ");
            input[i] = sc.nextLine();
        }
        return input;
    }

    String[] getName(String[] sID){
        String[] input = new String[5];
        for(int i=0; i<5; i++){
            System.out.print("Enter station name for " + sID[i] + ": ");
            input[i] = sc.nextLine();
        }
        return input;
    }

    double[] getTemp(String[] sName){
        double[] input = new double[5];
        for(int i=0; i<5; i++){
            System.out.print("Enter temperature of " + sName[i] + ": ");
            input[i] = sc.nextDouble();
        }
        return input;
    }

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
        String dfmax = df.format(maxTemp);
        String dfmin = df.format(minTemp);

        System.out.println("---------------Temperature Report------------------");
        System.out.println("Average temperature is: " + dfavg);
        System.out.println("Maximum temperature:\t" + maxIndex + "\t" + maxID + "\t" + maxName + "\t" + dfmax);
        System.out.println("Minimum temperature:\t" + minIndex + "\t" + minID + "\t" + minName + "\t" + dfmin);
    }
}
