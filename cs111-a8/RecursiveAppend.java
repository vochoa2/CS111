 /*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Victor Ochoa
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
        if(n < 0) return "Integer must be positive";
        if(n == 0) return original;

        return original + appendNTimes(original, n - 1);
    }

    public static void main (String[] args) {

        StdOut.println(appendNTimes("", -1));
        StdOut.println(appendNTimes("", 1));
        StdOut.println(appendNTimes("labyrinth", 2));   
    }
}
