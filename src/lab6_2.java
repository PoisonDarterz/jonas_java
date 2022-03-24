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
