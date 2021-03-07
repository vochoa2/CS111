/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author:
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        // WRITE YOUR CODE HERE
        //Read in 5 values from command line
        // Use parse int as args contains Strings
        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
        // int c = Integer.parseInt(args[2]);
        // int d = Integer.parseInt(args[3]);
        // int e = Integer.parseInt(args[4]);

        //Set default compare value
        int max = 0;
        //int n = 0;

        //Using for loop since I know I have to iterate through 5 numbers
        for(int i = 0; i < 5; i++){
            int currentNumber = Integer.parseInt(args[i]);

            if(currentNumber > max)
                max = currentNumber;
        }

        System.out.println(max);
    }
}