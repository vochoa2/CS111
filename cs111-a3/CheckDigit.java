/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        // WRITE YOUR CODE HERE
        //12 - 13 digit long
        //Chop off final digit add it to sum1
        //chop off next digit add it to sum2 
        //alternate between sum1 and sum2
        // sum1 keep ones digit discard tens, same thing 
        // sum 2; sum2 *  3, discard tens
        // add sum1 and sum2, and drop the tens again

        long number = Long.parseLong(args[0]);
        int sum1 = 0;
        int sum2 = 0;

        while(number != 0){
            sum1 += number % 10;

            number /= 10;

            sum2 += number % 10;

            number /= 10;
        }

        sum1 = sum1 % 10;

        sum2 %= 10;
        sum2 *= 3;
        sum2 %= 10;

        int finalSum = sum1 + sum2;
        finalSum %= 10;

        System.out.println(finalSum);


    }
}