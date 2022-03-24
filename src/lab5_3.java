import java.util.Scanner;
import java.util.ArrayList;

class q53_1 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
            while (sum < 100){
                sum = sum + i;
                i = i + 1;
                
                if(sum<100){
                    System.out.println(sum);
                }
            }
    }
}

class q53_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inputted = new ArrayList<Integer>();
        int input, sum=0;

            do{
                System.out.print("Enter number: ");
                input = sc.nextInt();
                inputted.add(input);
                sum = sum + input;
            }while (input!=0);

        System.out.print("Numbers inputted: ");
            for (int i = 0; i < inputted.size(); i++){
                System.out.println(inputted.get(i) + " ");
            }
        System.out.println("Sum of numbers: " + sum);
    }
}

class q53_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, sum=0;

        do{
            System.out.print("Enter number: ");
            input = sc.nextInt();
                if(input>0){
                    sum = sum + input;
                }
        }while (input>0);

        System.out.println("Sum of numbers: " + sum);

    }
}

class q53_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0, input = 0, sum = 0;
            do{
                System.out.print("Enter number: ");
                input = sc.nextInt();
                sum = sum + input;
                i = i + 1;
            } while (i<20 && input >=0);
    }
}

class q53_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
            while (pin!=877){
                System.out.print("Incorrect pin number, please try again: ");
                pin = sc.nextInt();
            }
    }
}