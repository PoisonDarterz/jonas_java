import java.util.Scanner;

class kuliah2302{
    public static void main(String[] args) {
        Scanner jonas = new Scanner(System.in); //init scanner

        //declare variables 
        final int SIZE =8; //array size
        int[] number = new int[SIZE]; //input array
        int i,j,k,m; //flags
        int input,freq=0; //search and frequency use
        boolean exist=false;

            //obtain values for number[]
            for (i=0; i<SIZE; i++){
                System.out.print("Enter integer: ");
                number[i]=jonas.nextInt();
            }

        //output of values entered
        System.out.println("These numbers are entered: ");
            for (j=0; j<SIZE ; j++){
                System.out.print(number[j] + "  ");
            }

        /* Search and Frequency Section.
        *  Both functions have been combined in this block of code.
        *  The program will search for the number if it exists first.
        *  If it exists, it jumps out of the initial for loop and proceeds with frequency calculation.
        *  If it doesn't, it will display the appropriate message. */
        //search
        System.out.print("\nEnter a number to search its frequency, if it exists: ");
        input = jonas.nextInt();
            for(k=0; k<SIZE; k++){
                if (input == number[k]){
                    exist = true;
                    System.out.println("The number exists. Determining frequency...");
                    break;
                } else{ // this block will repeatedly output Searching until it really finds the required number.
                    exist = false;
                    System.out.println("Searching...");
                }
            }

            //calculate frequency
            for(m=0;m<SIZE;m++){
                if(input==number[m]){
                    freq = freq+1;
                }
            }

        //final output
        System.out.println("The number searched is: " + input);
        if (exist){
            System.out.println("The frequency is: " + freq);
        } else {
            System.out.println("The number does not exist.");
        }
    }
}