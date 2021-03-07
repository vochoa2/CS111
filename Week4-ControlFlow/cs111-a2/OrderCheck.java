/*************************************************************************
 * Compilation: javac OrderCheck.java Execution: java OrderCheck 5 10 15 2
 *
 * @author: Victor M Ochoa-Gonzalez, victor.ochoa@rutgers.edu, vmo27
 *
 *Prints true if the four integer inputs are in strictly ascending or
 *descending order, false otherwise
 *
 *% java OrderCheck 5 10 15 2 false
 *
 *% java OrderCheck 15 11 9 4 true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

    // WRITE YOUR CODE HERE
    //Take in 4 numbers
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    int d = Integer.parseInt(args[3]);

    //Compare them to see if ascending
    boolean ascending = a < b && b < c && c < d;
    //ascending = ascending && Math.max(b, c) == c;
    //ascending = ascending && Math.max(c, d) == d;
    
    //Compare to see if descending
    boolean descending = a > b && b > c && c > d;
    // boolean descending = Math.max(a, b) == a;
    // descending = descending && Math.max(b, c) == b;
    // descending = descending && Math.max(c, d) == c;

    //Check if either or is true
    boolean ordered = ascending || descending;
    
    //Print out boolean of ordered or not
    System.out.println(ordered);
	
    }
}
