package others;

import java.util.Scanner;

class p69_1{ //q2
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        p69_1 obj = new p69_1();

        System.out.print("Enter year (eg. 2020 / 2021): ");
        int year = sc.nextInt();
        System.out.print("Enter month (eg. January / February): ");
        sc.nextLine();
        String mth = sc.nextLine();
        System.out.print("Enter date of month (eg. 1 , 2): ");
        int date = sc.nextInt();
        System.out.print("Enter day of week (eg. Monday / Tuesday): ");
        sc.nextLine();
        String day = sc.nextLine();

        obj.printAmerican(year,mth,date,day);
        obj.printEuropean(year,mth,date,day);
    }

    void printAmerican(int yr, String mth, int dt, String day){
        System.out.println("\nThe date in American format is: ");
        System.out.println(day + ", " + mth + " " + dt + ", " + yr);
    }

    void printEuropean(int yr, String mth, int dt, String day){
        System.out.println("\nThe date in Eurpoean format is: ");
        System.out.println(day + ", " + dt + " " + mth + " " + yr);
    }
}


class p69_2{ //q3
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        p69_2 obj = new p69_2();
        System.out.print("Enter integer: ");
        int num = sc.nextInt();

        int squ = obj.square(num);

        System.out.println("The square of the number is: " + squ);
    }

    int square(int n){
        return (n * n);
    }
}

class p69_3{ //q5
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        p69_3 obj = new p69_3();
        int num = obj.getInput();
        int ttl = obj.oddSum(num);
        System.out.println("The sum of odd numbers from 1 to your inputted number is: " + ttl);
    }

    int getInput(){
        int n=0;
        do{
            System.out.print("Enter a positive odd integer: ");
            n = sc.nextInt();
            if (n%2 !=1 || n<0){
                System.out.println("The number is not an odd number, and/or is not positive.");
            }
        } while (n%2 !=1 || n<0);
        return n;
    }

    int oddSum (int n){
        int ttl=0;
        for(int i=1; i<=n; i+=2){
            ttl = ttl + i;
        }
        return ttl;
    }
}