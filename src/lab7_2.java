import java.util.Scanner;

class q72_1{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        q72_1 obj = new q72_1();
        int age = obj.getAge();
        boolean eligib = obj.check(age);
        obj.output(eligib);
    }

    int getAge(){
        System.out.print("Enter age: ");
        return sc.nextInt();
    }

    boolean check(int a){
        if(a>=18){
            return true;
        } else {
            return false;
        }
    }

    void output(boolean e){
        if(e){
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}

class q72_2{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        q72_2 obj = new q72_2();

        System.out.print("Enter integer 1: ");
        int p = sc.nextInt();
        System.out.print("Enter integer 2: ");
        int q = sc.nextInt();

        boolean div = obj.isNotDivisible(p,q);
        obj.output(div);
    }

    boolean isNotDivisible(int p, int q){
        if (p%q!=0){
            return true;
        } else{
            return false;
        }
    }

    void output(boolean e){
        if(e){
            System.out.println("The numbers are not divisible.");
        } else {
            System.out.println("The numbers are divisible.");
        }
    }
}
