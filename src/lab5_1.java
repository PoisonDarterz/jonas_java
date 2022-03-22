import java.util.Scanner;

class q51_1 {
    public static void main(String[] args) {
        int i=1;
        while (i<=100){
            System.out.println(i);
            i = i+1;
        }
    }
}


class q51_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int ttl=0;
        double avg;
            while (i<10){
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                ttl = ttl + num;
                i = i+1;
            }
        avg = ttl / 10;
        System.out.println("Total :" + ttl);
        System.out.println("Average: " + avg);
    }
}


class q51_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int min = 999999;
            while (i<10){
                System.out.print("Enter number: ");
                int num = sc.nextInt();

                if(num < min){
                    min = num;
                }
                i = i+1;
            }
        System.out.println("Minimum number is: " + min);
    }
}


class q51_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int ttl = 0;
            while (i<15){
                System.out.println("Enter number: ");
                int num = sc.nextInt();

                if (num%2 == 1){
                    ttl = num + ttl;
                }
                i = i+1;
            }
        System.out.println("Total of odd numbers is: " + ttl);
    }
}


class q51_5{
    public static void main(String[] args) {
        int i = 10;
        final double PI = 3.1416;
        double area;
            while (i<=20){
                area = PI * i * i;
                System.out.println("Area of circle with radius " + i + " is: " + area);
                i = i+1;
            }
    }
}

class q51_6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxage=-1, age;
        int i = 0;
        String maxname="", name;

            while (i<10){
                System.out.print("Enter name: ");
                name = sc.nextLine();
                System.out.print("Enter age: ");
                age = sc.nextInt();

                if (age > maxage){
                    maxage = age;
                    maxname = name;
                }
            }
        System.out.println("Name of eldest person is: " + maxname + " with age " + maxage);
    }
}