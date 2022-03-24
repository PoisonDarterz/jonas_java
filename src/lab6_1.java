import java.util.Scanner;

class q61_1 {
    public static void main(String[] args) {
       int[] array = {0,1,2,3,4,5}; 
    }
}

class q61_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] number = new double[10];

        for(int i=0; i<number.length; i++){
            System.out.print("Enter number: ");
            number[i] = sc.nextDouble();
        }

        System.out.println("The list of numbers inputted: ");
        for(int j=0; j<number.length; j++){
            System.out.print(number[j] + "  ");
        }
    }
}

class q61_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5];

        for (int i=0; i<array.length; i++){
            System.out.print("Enter a line: ");
            array[i] = sc.nextLine();
        }

        System.out.println("Your inputted lines are: ");
        for(int j=0; j<array.length; j++){
            System.out.println(array[j]);
        }
    }
}
