/*Jonas
* no1-6
*/

import java.util.Scanner;


class q43_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        int i,j,large=-999999999;
        
        for (i=0;i<3;i++){
            System.out.print("Enter an integer: ");
            array[i] = input.nextInt(); 
        }

            for(j=0;j<3;j++){
                if(array[j]>large){
                    large = array[j];
                }
            }

        System.out.println("The largest number is: " + large);
    }
}

class q43_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num<0){
            System.out.println("The number is negative");
        } else if (num >0){
            System.out.println("The number is positive");
        } else{
            System.out.println("The number is zero");
        }
    }
}

class q43_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String oldest="";
        int i,maxage=-9999;

            for (i=0; i<3; i++){
                System.out.print("Input age: ");
                int age = input.nextInt();
                System.out.print("Input name: ");
                input.nextLine();
                String name = input.nextLine();

                    if(age > maxage){
                        maxage = age;
                        oldest = name;
                    }
            }

        System.out.println("The oldest person is: " + oldest);
    }
}

class q43_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num>=5 && num <=15){
            System.out.println("GREEN");
        } else if (num>15 && num <=25){
            System.out.println("BLUE");
        } else if (num>25 && num <=35){
            System.out.println("ORANGE");
        } else {
            System.out.println("ALL COLOURS ARE BEAUTIFUL");
        }
    }
}

class q43_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input temperature in Celsius: ");
        int temp = input.nextInt();

        if(temp<0){
            System.out.println("Freezing weather");
        } else if (temp <=20) {
            System.out.println("Cold weather");
        } else if (temp <=35) {
            System.out.println("Normal in Temp");
        } else {
            System.out.println("Its Hot");
        }
    }
}

class q43_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bill=0;

        System.out.print("Enter number of units: ");
        int unit = input.nextInt();

            if(unit<=100){
                bill = unit * 0.5;
            } else if (unit <=250){
                bill = 100*0.5 + 10*(unit-100);
            } else {
                bill = 100*0.5 + 10*150 + 20*(unit-250);
            }

        double total = bill + 15;

        System.out.println("The total bill is: " + total);
    }
}