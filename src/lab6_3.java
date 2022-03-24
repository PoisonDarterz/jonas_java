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
        int maxmark=-99999;
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

        double avg = sum / temp.length;
        System.out.println("Average temperature is: " + avg);
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
        int maxmark=-99999,minmark=99999;

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
