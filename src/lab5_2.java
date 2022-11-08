import java.util.Scanner;

class q52_1 {
    public static void main(String[] args) {
        for (int i = 1; i <=30 ; i+=2){
            System.out.println(i);
        }
    }
}

class q52_2{
    public static void main(String[] args) {
        int sum =0;
            for (int i = 1; i <=10 ; i++){
                sum = sum + i;
            }
        System.out.println("Sum of first 10 natural numbers is: " + sum);
    }
}

class q52_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("-----Multiplication Table-----");
            for(i=1; i<=12; i++){
                System.out.println(i + " x " + num + " = " + (i*num));
            }
    }
}


class q52_4{
    public static void main(String[] args) {
        for (int i = 100; i < 200; i+=10){
            System.out.print("\n");
            for(int j = 0; j<10; j++){
                System.out.print((i+j) + " ");
            }
        }
        System.out.println("\n200");
    }
}


class q52_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int qty = sc.nextInt();
        int price,min=9999999,max=-9999999,ttl=0;
            for(int i=0; i<qty; i++){
                System.out.println("Enter price of item: ");
                price = sc.nextInt();

                if(price < min){
                    min = price;
                } else if (price > max){
                    max = price;
                }

                ttl = ttl + price;
            }
        System.out.println("Total is: " + ttl);
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
    }
}