import java.util.Scanner;

class q62_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int numday = sc.nextInt();
        double temp[] = new double[numday];

            for(int i=0; i<temp.length; i++){
                System.out.print("Enter temperature: ");
                temp[i] = sc.nextDouble();
            }

        System.out.println("Temperatures inputted are: ");
            for(int j=0; j<temp.length; j++){
                System.out.print(temp[j] + "  ");
            }
    }
}


class q62_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numstud = sc.nextInt();
        double weight[] = new double[numstud];
        String name[] = new String[numstud];

            for(int i=0; i<numstud; i++){
                System.out.print("Enter name: ");
                name[i] = sc.nextLine();
                System.out.print("Enter weight of " + name[i] + ": ");
                weight[i] = sc.nextDouble();
            }

        double minweight=99999.0;
        String minname="";
            for(int j=0; j<numstud; j++){
                if(weight[j] < minweight){
                    minweight = weight[j];
                    minname = name[j];
                }
            }

        System.out.println("Name of student with lowest weight is: " + minname);
    }
}