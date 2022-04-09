package others;
import java.util.Scanner;
import java.util.ArrayList;

class search1{
    public static void main(String[] args) {
        int[] array ={10,20,30,40,50,60,70};
        int index=0, value = 30;
        boolean found = false;
            for(int i=0; i<array.length; i++){
                if(array[i] == value){
                    found = true;
                    index = i;
                }
            }
        if(found){
            System.out.println("The value " + value + " is found at index " + index);
        } else {
            System.out.println("The value is not found in the entire array.");
        }
    }
}

class search2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //enter size of array, then enter elements
        System.out.print("Enter number of elements: ");
            int size = sc.nextInt();
            int[] array = new int[size];
        System.out.println("Enter elements: ");
            for(int i=0; i<array.length; i++){
                array[i] = sc.nextInt();
            }
        //enter search value, and search
            ArrayList<Integer> index = new ArrayList<Integer>();
            int found = 0;
        System.out.println("Elements entered. Enter search value: ");
            int value = sc.nextInt(); //input target
            for(int j=0; j<array.length; j++){ //start search
                if(array[j] == value){ //if value is found, it is added into counters first.
                    found = found + 1;
                    index.add(j);
                }
            }
        //final output
            if(found>0){ //output is based on counter (how many value == target values found)
                System.out.println("The value " + value + " is found " + index.size() + " times at index(es) ");
                for(int k=0;k<index.size();k++){
                    System.out.print(index.get(k) + " ");
                }
            } else {
                System.out.println("The value is not found in the entire array.");
            }

    }
}

