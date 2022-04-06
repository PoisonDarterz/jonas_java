import java.util.Scanner;
import java.util.ArrayList;

class q63_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for(int i=0; i<array.length; i++){
            System.out.print("Enter number: ");
            array[i] = sc.nextInt();
        }

        int sum=0;
        for (int j=0; j<array.length; j++){
            sum = sum + array[j];
        }

        System.out.println("The sum of numbers inputted are: " + sum);
    }
}


class q63_2{
    public static void main(String[] args) {
        //init scanner and arraylists
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<Integer>();
        ArrayList<String> name = new ArrayList<String>();

        System.out.println("Enter \"null\" if you have finished entering student data. The max number of students is 50.");

        //input of name and marks.
        String inname;
        int i=0;
            do{
                System.out.print("Enter student name: ");
                inname = sc.nextLine();
                    if (!inname.equals("null")){ //if input is null (Sentinel value), this part is skipped.
                        name.add(inname);
                        System.out.print("Enter marks: ");
                        marks.add(sc.nextInt());
                        sc.nextLine();
                        i = i+1;
                    }
            } while (!inname.equals("null") && i<50); 

        //calc avg
        System.out.println("-------------------------------");
        int numstudent = name.size();
        double sum=0.0;
        double average;
            for(int j=0; j<numstudent; j++){
                sum = sum + marks.get(j);
            }
        average = sum / numstudent;
        System.out.println("Average marks: " + average);

        //get students below average
        System.out.println("List of students below average: ");
            for(int k=0; k<numstudent; k++){
                if (marks.get(k) < average){
                    System.out.println(name.get(k));
                }
            }
        System.out.println("-------------------------------");
        
        //determine maxmark, then determine name of person(s) with maxmark.
        int maxmark=marks.get(0);
            for(int m=0; m<numstudent; m++){
                if(marks.get(m)>maxmark){
                    maxmark = marks.get(m);
                }
            }

        System.out.println("Highest mark is: " + maxmark + ". Students with highest marks is/are: ");
            for(int n=0; n<numstudent; n++){
                if(marks.get(n)==maxmark){
                    System.out.println(name.get(n));
                }
            }

    }
}


class q63_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> aboveavg = new ArrayList<Double>();
        q63_3 obj = new q63_3();

        System.out.print("Enter number of days: ");
            int numday = sc.nextInt();
            double temp[] = new double[numday];
            double sum=0.0;

            for(int i=0; i<temp.length; i++){
                System.out.print("Enter temperature: ");
                temp[i] = sc.nextDouble();
                sum = sum + temp[i];
            }

        System.out.println("Temperatures inputted are: ");
            for(int j=0; j<temp.length; j++){
                System.out.print(temp[j] + "  ");
            }

        double avg = obj.getAvg(sum, numday);
        System.out.println("\n\nAverage temperature is: " + avg);

        double max = obj.getMax(temp);
        System.out.println("\nMaximum temperature is: " + max);

        double min = obj.getMin(temp);
        System.out.println("Minimum temperature is: " + min);

        aboveavg = obj.getAbove(temp, avg);
        System.out.println("\nTemperatures above average are: ");
            for (int k =0; k<aboveavg.size(); k++){
                System.out.print(aboveavg.get(k) + " ");
            }
    }

    double getAvg(double sum, int num){
        double avg = sum / num;
        return avg;
    }

    double getMax(double[] array){
        double maxtemp = array[0];
        for (int i=0; i<array.length; i++){
            if(array[i] > maxtemp){
                maxtemp = array[i];
            }
        }
        return maxtemp;
    }

    double getMin(double[] array){
        double mintemp = array[0];
        for (int i=0; i<array.length; i++){
            if(array[i] < mintemp){
                mintemp = array[i];
            }
        }
        return mintemp;
    }

    ArrayList<Double> getAbove(double[] array, double avg){
        ArrayList<Double> abvavg = new ArrayList<Double>();
        for (int i=0; i<array.length; i++){
            if(array[i] > avg){
                abvavg.add(array[i]);
            }
        }
        return abvavg;
    }
}


class q63_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numstud = sc.nextInt();
        int mark[] = new int[numstud];
        String name[] = new String[numstud];
        double sum=0.0;
        int maxmark=mark[0],minmark=mark[0];

            for(int i=0; i<numstud; i++){
                sc.nextLine();
                System.out.print("Enter name: ");
                name[i] = sc.nextLine();
                System.out.print("Enter marks: ");
                mark[i] = sc.nextInt();

                sum = sum + mark[i];

                if(mark[i]<minmark){
                    minmark = mark[i];
                }

                if(mark[i]>maxmark){
                    maxmark = mark[i];
                }
            }

        double avg = sum / numstud;

        System.out.println("-------------------------------------------------");
        System.out.println("List of students and marks: ");
            for(int j=0; j<numstud; j++){
                System.out.println(name[j] +"    " + mark[j]);
            }
        System.out.println("Average marks is: " + avg);
        System.out.println("-------------------------------------------------");
        System.out.println("Highest mark is: " + maxmark + ". Students with highest marks is/are: ");
            for(int n=0; n<numstud; n++){
                if(mark[n]==maxmark){
                    System.out.println(name[n]);
                }
            }
        System.out.println("-------------------------------------------------");
        System.out.println("Lowest mark is: " + minmark + ". Students with lowest marks is/are: ");
            for(int m=0; m<numstud; m++){
                if(mark[m]==minmark){
                    System.out.println(name[m]);
                }
            }
    }
}



class ganjilgenap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ganjilgenap obj = new ganjilgenap();

        int[] array = new int[10];

        for(int i=0; i<10; i++){
            System.out.println("Enter numbers:");
            array[i] = sc.nextInt();
        }

        for(int j=0; j<10; j++){
            if(array[j] %2 ==0){
                even.add(array[j]);
            } else {
                odd.add(array[j]);
            }
        }

        System.out.println("Number of even numbers: " + even.size());
        System.out.println("List of even numbers: ");
        for(int m =0; m<even.size(); m++){
            System.out.print(even.get(m));
        }
        System.out.println("Number of odd numbers: " + odd.size());
        System.out.println("List of odd numbers: ");
        for(int n =0; n<odd.size(); n++){
            System.out.print(odd.get(n));
        }

    }
}